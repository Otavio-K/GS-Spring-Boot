package com.floodsafe.service;

import com.floodsafe.model.SensorData;
import com.floodsafe.repository.SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SensorService {

    @Autowired
    private SensorDataRepository repo;

    public SensorData salvarLeitura(SensorData dado) {
        return repo.save(dado);
    }

    public List<SensorData> listar() {
        return repo.findAll();
    }
}
