package com.floodsafe.controller;

import com.floodsafe.model.AcaoControle;
import com.floodsafe.service.AcaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/acao")
public class AcaoController {

    @Autowired
    private AcaoService service;

    @PostMapping
    public AcaoControle acionar(@RequestParam String acao) {
        return service.executarAcao(acao);
    }

    @GetMapping
    public List<AcaoControle> listar() {
        return service.listar();
    }
}
