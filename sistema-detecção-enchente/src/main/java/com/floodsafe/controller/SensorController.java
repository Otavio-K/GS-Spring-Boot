package com.floodsafe.controller;

import com.floodsafe.model.SensorData;
import com.floodsafe.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/monitoramento")
public class SensorController {

    @Autowired
    private SensorService service;

    @PostMapping
    public SensorData novaLeitura(@RequestBody SensorData dado) {
        return service.salvarLeitura(dado);
    }

    @GetMapping
    public List<SensorData> listar() {
        return service.listar();
    }
}
