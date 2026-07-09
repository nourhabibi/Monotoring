package com.example.monotoring.controller;

import com.example.monotoring.dto.DashboardDto;
import com.example.monotoring.service.DashboardService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dashboard")
@CrossOrigin(origins = "*")
public class DashboardController {

    private final DashboardService dashboardService;

    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping("/summary")
    public DashboardDto getDashboardSummary() {
        return dashboardService.getDashboardSummary();
    }
}