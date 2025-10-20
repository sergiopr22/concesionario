package com.concesionario.concesionario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.concesionario.concesionario.model.Vehiculo;
import com.concesionario.concesionario.service.VehiculoService;

@Controller
@RequestMapping("/vehiculos")
public class VehiculoController {

    private final VehiculoService vehiculoService;

    public VehiculoController(VehiculoService vehiculoService) {
        this.vehiculoService = vehiculoService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("vehiculos", vehiculoService.listarTodos());
        model.addAttribute("vehiculo", new Vehiculo());
        return "vehiculos";
    }

    @PostMapping("/agregar")
    public String agregar(@ModelAttribute Vehiculo vehiculo) {
        vehiculoService.guardar(vehiculo);
        return "redirect:/vehiculos";
    }
}
