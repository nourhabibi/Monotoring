package com.example.monotoring.service;
import com.example.monotoring.repository.ContractFlatRepository;
import org.springframework.stereotype.Service;

@Service
public class KpiService {

    private final ContractFlatRepository contractFlatRepository;

    public KpiService(ContractFlatRepository contractFlatRepository) {
        this.contractFlatRepository = contractFlatRepository;
    }

    public long getCount(String businessStatus) {
        return contractFlatRepository.countByBusinessStatus(businessStatus);
    }

    private double calculateRatio(long numerator, long denominator) {
        if (denominator == 0) {
            return 0.0;
        }
        return Math.round((numerator * 10000.0) / denominator) / 100.0;
    }

    public double getQuoteRatio() {
        return calculateRatio(
                getCount("NotSent"),
                getCount("Submitted")
        );
    }

    public double getTransformationRate() {
        return calculateRatio(
                getCount("InstructionInProcess"),
                getCount("Submitted")
        );
    }

    public double getHitRatio() {
        long totalEmis = getCount("InstructionInProcess");
        long totalEmOpportunite = contractFlatRepository.countByBusinessStatusAndProspectionConsent(
                "InstructionInProcess", true            );
        return calculateRatio(totalEmOpportunite, totalEmis);}

    public double getAutonomyRate() {

        long totalEmis = getCount("InstructionInProcess");

        long autonome =
        contractFlatRepository.countAutonomousContracts(
                "InstructionInProcess",
                "DA"
        );

        return calculateRatio(autonome, totalEmis);
    }
}





