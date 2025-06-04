package com.floodsafe.service;

import com.floodsafe.model.AcaoControle;
import com.floodsafe.repository.AcaoControleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AcaoService {

    @Autowired
    private AcaoControleRepository repo;

    public AcaoControle executarAcao(String descricao) {
        AcaoControle acao = new AcaoControle();
        acao.setAcao(descricao);
        return repo.save(acao);
    }

    public List<AcaoControle> listar() {
        return repo.findAll();
    }
}
