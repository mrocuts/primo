/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.primo.service;

import co.com.primo.dao.PersonaDAO;
import co.com.primo.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Usuario
 */
@Service
public class PersonaServiceImp implements PersonaService{

    /** Atributos de Clase **/
    @Autowired
    private PersonaDAO myPersonaDAO;
    
    @Transactional
    @Override
    public void agregarPersona(Persona myPersona) {
        myPersonaDAO.agregarPersona(myPersona);
    }    
}