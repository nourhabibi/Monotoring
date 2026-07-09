package com.example.monotoring.service;
import com.example.monotoring.dto.ProductKpiDto;
import com.example.monotoring.repository.ContractFlatRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductKpiService {


    private ContractFlatRepository contractFlatRepository;

    public ProductKpiService(ContractFlatRepository contractFlatRepository) {
        this.contractFlatRepository = contractFlatRepository;
    }

    public ProductKpiDto getKpiProduct(String productGroup) {
        long suspens = contractFlatRepository.countByBusinessStatusAndProductGroupName("Submitted", productGroup);

        long devis = contractFlatRepository
                .countByBusinessStatusAndProductGroupName("NotSent", productGroup);

        long emis = contractFlatRepository
                .countByBusinessStatusAndProductGroupName("InstructionInProcess", productGroup);

        // KPI ratios
        double quoteRatio = calculateRatio(devis, suspens);
        double transformationRate = calculateRatio(emis, suspens);

        double hitRatio = calculateRatio(
                contractFlatRepository
                        .countByBusinessStatusAndProspectionConsentAndProductGroupName(
                                "InstructionInProcess",
                                true,
                                productGroup
                        ),
                emis
        );

        long autonomous = contractFlatRepository.countAutonomousContractsByProductGroup(
                "InstructionInProcess",
                productGroup
        );

        double autonomyRate = calculateRatio(autonomous, emis);

        return new ProductKpiDto(
                suspens,
                devis,
                emis,
                quoteRatio,
                transformationRate,
                hitRatio,
                autonomyRate
        );
    }

    private double calculateRatio(long numerator, long denominator) {
        if (denominator == 0) return 0.0;
        return (double) numerator / denominator * 100;
    }
}
