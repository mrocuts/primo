/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.primo.service;

import co.com.primo.dao.CorreoDAO;
import co.com.primo.entity.Correo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Usuario
 */
@Service
public class CorreoServiceImp implements CorreoService{

    /** Atributos de Clase **/
    @Autowired
    private CorreoDAO myCorreoDAO;
    
    @Transactional
    @Override
    public void agregarCorreo(Correo myCorreo) {
        myCorreoDAO.agregarCorreo(myCorreo);
    }

    @Transactional
    @Override
    public void actualizarCorreo(Correo myCorreo) {
        myCorreoDAO.actualizarCorreo(myCorreo);
    }

    @Transactional
    @Override
    public List<Correo> getAllCorreos(int idPersona) {
        return myCorreoDAO.getAllCorreos(idPersona);
    }

    @Transactional
    @Override
    public Correo getCorreo(int idPersona, int idCorreo) {
        return myCorreoDAO.getCorreo(idPersona, idCorreo);
    }
    
}