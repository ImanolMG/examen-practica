package com.example.examen.service;

import com.example.examen.model.Persona;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {

    private final List<Persona> personas = new ArrayList<>();
    private long contadorId = 1;

    @Override
    public Persona agregarPersona(Persona persona) {
        persona.setIdpersona(contadorId++);
        personas.add(persona);
        return persona;
    }
    //Se probo con Postman
    //http://localhost:8080/api/personas
    //Metodo POST, tipo de contenido: application/json, body:  raw

    @Override
    public List<Persona> obtenerTodasLasPersonas() {
        return new ArrayList<>(personas);
    }
    //http://localhost:8080/api/personas
    //Metodo GET: http://localhost:8080/api/personas se obtiene toda la lista de personas

    @Override
    public Optional<Persona> obtenerPersonaPorId(Long id) {
        return personas.stream()
                .filter(persona -> persona.getIdpersona().equals(id))
                .findFirst();
    }
    //http://localhost:8080/api/personas
    //Metodo GET: http://localhost:8080/api/personas/{id}


    @Override
    public Persona actualizarPersona(Long id, Persona personaActualizada) {
        for (int i = 0; i < personas.size(); i++) {
            Persona persona = personas.get(i);
            if (persona.getIdpersona().equals(id)) {
                personas.set(i, personaActualizada);
                return personaActualizada;
            }
        }
        return null;
    }
    //http://localhost:8080/api/personas
    //Metodo PUT: http://localhost:8080/api/personas/{id}, tipo de contenido: application/json, body: raw

    @Override
    public void eliminarPersona(Long id) {
        personas.removeIf(persona -> persona.getIdpersona().equals(id));
    }
    //http://localhost:8080/api/personas
    //Metodo DELETE: http://localhost:8080/api/personas/{id}


}
