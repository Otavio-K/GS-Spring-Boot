package com.floodsafe.service;

import com.floodsafe.model.Alerta;
import com.floodsafe.repository.AlertaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlertaService {

    @Autowired
    private AlertaRepository repo;

    public Alerta emitir(String nivelRisco, String mensagem) {
        Alerta alerta = new Alerta();
        alerta.setNivelRisco(nivelRisco);
        alerta.setMensagem(mensagem);
        return repo.save(alerta);
    }

    public List<Alerta> listar() {
        return repo.findAll();
    }
}
