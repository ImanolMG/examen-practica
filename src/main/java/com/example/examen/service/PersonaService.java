// PersonaService.java
package com.example.examen.service;

import com.example.examen.model.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaService {
    Persona agregarPersona(Persona persona);
    List<Persona> obtenerTodasLasPersonas();
    Optional<Persona> obtenerPersonaPorId(Long id);
    Persona actualizarPersona(Long id, Persona personaActualizada);
    void eliminarPersona(Long id);
}
