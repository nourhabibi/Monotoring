package com.example.monotoring.dto;

public class DashboardDto {

    private final long suspens;
    private final long devis;
    private final long contratsEmis;

    public DashboardDto(long suspens, long devis, long contratsEmis) {
        this.suspens = suspens;
        this.devis = devis;
        this.contratsEmis = contratsEmis;
    }

    public long getSuspens() {
        return suspens;
    }

    public long getDevis() {
        return devis;
    }

    public long getContratsEmis() {
        return contratsEmis;
    }
}