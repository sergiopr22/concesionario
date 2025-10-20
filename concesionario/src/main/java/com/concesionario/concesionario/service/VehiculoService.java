package com.concesionario.concesionario.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.concesionario.concesionario.model.Vehiculo;
import com.concesionario.concesionario.repository.VehiculoRepository;

@Service
public class VehiculoService {

    private final VehiculoRepository vehiculoRepository;

    public VehiculoService(VehiculoRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }

    public List<Vehiculo> listarTodos() {
        return vehiculoRepository.findAll();
    }

    public Vehiculo guardar(Vehiculo v) {
        return vehiculoRepository.save(v);
    }
}
