package com.example.investingapp.controller;


import com.example.investingapp.controller.dto.CreateAccountDto;
import com.example.investingapp.controller.dto.CreateStockDto;
import com.example.investingapp.service.StockService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/v1/stocks")
public class StockController {

    private StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @PostMapping
    public ResponseEntity<Void> createStock(@RequestBody CreateStockDto createStockDto) {

        stockService.createStock(createStockDto);

        return ResponseEntity.ok().build();
    }
}
