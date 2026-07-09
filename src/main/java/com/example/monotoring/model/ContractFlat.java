package com.example.monotoring.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "contract_flat")
public class ContractFlat {

    @Id
    @Column(name = "id_contract")
    private String idContract;

    @Column(name = "id_quote")
    private String idQuote;

    @Column(name = "id_mouvement")
    private String idMouvement;

    @Column(name = "process_id")
    private String processId;

    @Column(name = "process_name")
    private String processName;

    @Column(name = "endorsement_type")
    private String endorsementType;

    @Column(name = "issuingdate")
    private LocalDateTime issuingDate;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @Column(name = "effective_date")
    private LocalDate effectiveDate;

    @Column(name = "partner_id")
    private String partnerId;

    @Column(name = "product_original_name")
    private String productOriginalName;

    @Column(name = "product_identifier")
    private String productIdentifier;

    @Column(name = "product_acronym")
    private String productAcronym;

    @Column(name = "product_group_id")
    private String productGroupId;

    @Column(name = "product_group_name")
    private String productGroupName;

    @Column(name = "product_group_description", columnDefinition = "TEXT")
    private String productGroupDescription;

    @Column(name = "product_version")
    private String productVersion;

    @Column(name = "product_description", columnDefinition = "TEXT")
    private String productDescription;

    @Column(name = "product_external_identifier")
    private String productExternalIdentifier;

    @Column(name = "product_translated_name")
    private String productTranslatedName;

    @Column(name = "product_enable_grouped_subscription")
    private Boolean productEnableGroupedSubscription;

    @Column(name = "business_status")
    private String businessStatus;

    @Column(name = "business_label")
    private String businessLabel;

    @Column(name = "version")
    private String version;

    @Column(name = "prospection_consent")
    private Boolean prospectionConsent;

    @Column(name = "last_reached_activity", columnDefinition = "TEXT")
    private String lastReachedActivity;

    // getters & setters


    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getBusinessLabel() {
        return businessLabel;
    }

    public void setBusinessLabel(String businessLabel) {
        this.businessLabel = businessLabel;
    }

    public String getBusinessStatus() {
        return businessStatus;
    }

    public void setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getEndorsementType() {
        return endorsementType;
    }

    public void setEndorsementType(String endorsementType) {
        this.endorsementType = endorsementType;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getIdMouvement() {
        return idMouvement;
    }

    public void setIdMouvement(String idMouvement) {
        this.idMouvement = idMouvement;
    }

    public String getIdQuote() {
        return idQuote;
    }

    public void setIdQuote(String idQuote) {
        this.idQuote = idQuote;
    }

    public LocalDateTime getIssuingDate() {
        return issuingDate;
    }

    public void setIssuingDate(LocalDateTime issuingDate) {
        this.issuingDate = issuingDate;
    }

    public String getLastReachedActivity() {
        return lastReachedActivity;
    }

    public void setLastReachedActivity(String lastReachedActivity) {
        this.lastReachedActivity = lastReachedActivity;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getProductAcronym() {
        return productAcronym;
    }

    public void setProductAcronym(String productAcronym) {
        this.productAcronym = productAcronym;
    }

    public Boolean getProductEnableGroupedSubscription() {
        return productEnableGroupedSubscription;
    }

    public void setProductEnableGroupedSubscription(Boolean productEnableGroupedSubscription) {
        this.productEnableGroupedSubscription = productEnableGroupedSubscription;
    }

    public String getProductExternalIdentifier() {
        return productExternalIdentifier;
    }

    public void setProductExternalIdentifier(String productExternalIdentifier) {
        this.productExternalIdentifier = productExternalIdentifier;
    }

    public String getProductGroupDescription() {
        return productGroupDescription;
    }

    public void setProductGroupDescription(String productGroupDescription) {
        this.productGroupDescription = productGroupDescription;
    }

    public String getProductGroupId() {
        return productGroupId;
    }

    public void setProductGroupId(String productGroupId) {
        this.productGroupId = productGroupId;
    }

    public String getProductGroupName() {
        return productGroupName;
    }

    public void setProductGroupName(String productGroupName) {
        this.productGroupName = productGroupName;
    }

    public String getProductIdentifier() {
        return productIdentifier;
    }

    public void setProductIdentifier(String productIdentifier) {
        this.productIdentifier = productIdentifier;
    }

    public String getProductOriginalName() {
        return productOriginalName;
    }

    public void setProductOriginalName(String productOriginalName) {
        this.productOriginalName = productOriginalName;
    }

    public String getProductTranslatedName() {
        return productTranslatedName;
    }

    public void setProductTranslatedName(String productTranslatedName) {
        this.productTranslatedName = productTranslatedName;
    }

    public String getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion;
    }

    public Boolean getProspectionConsent() {
        return prospectionConsent;
    }

    public void setProspectionConsent(Boolean prospectionConsent) {
        this.prospectionConsent = prospectionConsent;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }




}