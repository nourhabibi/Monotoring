package com.example.monotoring.controller;

import com.example.monotoring.dto.ProductKpiDto;
import com.example.monotoring.service.ProductKpiService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/productkpi")
@CrossOrigin(origins = "*")
public class ProductKpiController {

    private final ProductKpiService productKpiService;

    public ProductKpiController(ProductKpiService productKpiService) {
        this.productKpiService = productKpiService;
    }

    @GetMapping("/product")
    public ProductKpiDto getProductKpi(@RequestParam String productGroup) {
        return productKpiService.getKpiProduct(productGroup);
    }
}