package com.example.monotoring.service;
import com.example.monotoring.repository.ContractFlatRepository;
import com.example.monotoring.dto.DashboardDto;
import org.springframework.stereotype.Service;
@Service

public class DashboardService {
    private final ContractFlatRepository contractFlatRepository;

    public DashboardService(ContractFlatRepository contractFlatRepository) {
        this.contractFlatRepository = contractFlatRepository;
    }

    public DashboardDto getDashboardSummary() {

        long devis = contractFlatRepository.countByBusinessStatus("NotSent");
        long suspens = contractFlatRepository.countByBusinessStatus("Submitted");
        long emis = contractFlatRepository.countByBusinessStatus("InstructionInProcess");

        System.out.println("Submitted = " + suspens);
        System.out.println("NotSent = " + devis);
        System.out.println("InstructionInProcess = " + emis);

        return new DashboardDto(suspens, devis, emis);
    }

    private long getSuspensCount() {
        return contractFlatRepository.countByBusinessStatus("Submitted");
    }

    private long getDevisCount() {
        return contractFlatRepository.countByBusinessStatus("NotSent");
    }

    private long getContratEmisCount() {
        return contractFlatRepository.countByBusinessStatus("InstructionInProcess");
    }



}