package com.portfolio.mgb.Interface;

import com.portfolio.mgb.Entity.Persona;
import java.util.List;


public interface IPersonaService {
//Traer una lista de persona
public List<Persona> getPersona();

//Guardar un objeto de tipo persona
public void savePersona(Persona persona);

//Eliminar un objeto pero lo buscamos po Id
public void deletePersona(Long id);

//Buscar una persona por Id
public Persona findPersona (Long id);

    
}
