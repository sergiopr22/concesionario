package com.concesionario.concesionario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.concesionario.concesionario.model.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {}
