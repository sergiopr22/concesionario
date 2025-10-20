package com.concesionario.concesionario.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.concesionario.concesionario.model.Venta;
import com.concesionario.concesionario.repository.VentaRepository;

@Service
public class VentaService {

    private final VentaRepository ventaRepository;

    public VentaService(VentaRepository ventaRepo) {
        this.ventaRepository = ventaRepo;
    }

    public List<Venta> listarTodas() {
        return ventaRepository.findAll();
    }

    public Venta guardar(Venta v) {
        return ventaRepository.save(v);
    }
}
