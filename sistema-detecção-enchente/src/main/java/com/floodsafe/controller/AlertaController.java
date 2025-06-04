package com.floodsafe.controller;

import com.floodsafe.model.Alerta;
import com.floodsafe.service.AlertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/alertas")
public class AlertaController {

    @Autowired
    private AlertaService service;

    @PostMapping
    public Alerta emitir(@RequestParam String nivel, @RequestParam String mensagem) {
        return service.emitir(nivel, mensagem);
    }

    @GetMapping
    public List<Alerta> listar() {
        return service.listar();
    }
}
