package com.example.monotoring.controller;
import com.example.monotoring.service.KpiService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController

@RequestMapping("/api/kpi")
@CrossOrigin(origins= "*")
public class KpiController {
    private final KpiService kpiService;

    public KpiController(KpiService kpiService) {
        this.kpiService = kpiService;
    }

    @GetMapping("/quote-ratio")
    public double getQuoteRatio() {
        return kpiService.getQuoteRatio();
    }

    @GetMapping("/transformation-rate")
    public double getTransformationRate() {
        return kpiService.getTransformationRate();
    }

    @GetMapping("/hit-ratio")
    public double getHitRatio() {
        return kpiService.getHitRatio();
    }
    @GetMapping("/autonomy-rate")
    public double getAutonomyRate(){return kpiService.getAutonomyRate();}

    @GetMapping("/summary")
    public Map<String, Double> getSummary() {
        Map<String, Double> result = new HashMap<>();

        result.put("quoteRatio", kpiService.getQuoteRatio());
        result.put("transformationRate", kpiService.getTransformationRate());
        result.put("hitRatio", kpiService.getHitRatio());
        result.put("tauxAutonomie", kpiService.getAutonomyRate());

        return result;
    }


}
