package com.example.monotoring.dto;

public class ProductKpiDto {

    private long suspens;
    private long devis;
    private long emis;

    private double quoteRatio;
    private double transformationRate;
    private double hitRatio;
    private double autonomyRate;

    public ProductKpiDto() {
    }

    public ProductKpiDto(long suspens,
                         long devis,
                         long emis,
                         double quoteRatio,
                         double transformationRate,
                         double hitRatio,
                         double autonomyRate) {
        this.suspens = suspens;
        this.devis = devis;
        this.emis = emis;
        this.quoteRatio = quoteRatio;
        this.transformationRate = transformationRate;
        this.hitRatio = hitRatio;
        this.autonomyRate = autonomyRate;
    }

    public long getSuspens() {
        return suspens;
    }

    public void setSuspens(long suspens) {
        this.suspens = suspens;
    }

    public long getDevis() {
        return devis;
    }

    public void setDevis(long devis) {
        this.devis = devis;
    }

    public long getEmis() {
        return emis;
    }

    public void setEmis(long emis) {
        this.emis = emis;
    }

    public double getQuoteRatio() {
        return quoteRatio;
    }

    public void setQuoteRatio(double quoteRatio) {
        this.quoteRatio = quoteRatio;
    }

    public double getTransformationRate() {
        return transformationRate;
    }

    public void setTransformationRate(double transformationRate) {
        this.transformationRate = transformationRate;
    }

    public double getHitRatio() {
        return hitRatio;
    }

    public void setHitRatio(double hitRatio) {
        this.hitRatio = hitRatio;
    }

    public double getAutonomyRate() {
        return autonomyRate;
    }

    public void setAutonomyRate(double autonomyRate) {
        this.autonomyRate = autonomyRate;
    }
}