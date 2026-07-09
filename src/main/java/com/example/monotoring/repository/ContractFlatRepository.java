package com.example.monotoring.repository;

import com.example.monotoring.model.ContractFlat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractFlatRepository extends JpaRepository<ContractFlat, String> {

    // =========================
    // BASIC COUNTS
    // =========================
    long countByBusinessStatus(String businessStatus);

    long countByBusinessStatusAndProspectionConsent(
            String businessStatus,
            Boolean prospectionConsent
    );

    long countByBusinessStatusAndProductGroupName(
            String businessStatus,
            String productGroupName
    );

    long countByBusinessStatusAndProspectionConsentAndProductGroupName(
            String businessStatus,
            Boolean prospectionConsent,
            String productGroupName
    );

    // =========================
    // AUTONOMY - GLOBAL
    // =========================
    @Query("""
        SELECT COUNT(cf)
        FROM ContractFlat cf
        WHERE cf.businessStatus = :status
        AND NOT EXISTS (
            SELECT 1
            FROM ContractComment cc
            WHERE cc.idContract = cf.idContract
            AND cc.event = :event
        )
    """)
    long countAutonomousContracts(
            @Param("status") String status,
            @Param("event") String event
    );

    // =========================
    // AUTONOMY - BY PRODUCT GROUP
    // =========================
    @Query("""
        SELECT COUNT(cf)
        FROM ContractFlat cf
        WHERE cf.businessStatus = :status
        AND cf.productGroupName = :productGroup
        AND NOT EXISTS (
            SELECT 1
            FROM ContractComment cc
            WHERE cc.idContract = cf.idContract
            AND cc.status = 'DA'
        )
    """)
    long countAutonomousContractsByProductGroup(
            @Param("status") String status,
            @Param("productGroup") String productGroup
    );
}