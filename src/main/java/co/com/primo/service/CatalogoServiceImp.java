/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.primo.service;

import co.com.primo.dao.CatalogoDAO;
import co.com.primo.entity.Catalogo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Usuario
 */
@Service
public class CatalogoServiceImp implements CatalogoService{

    /** Atributos de Clase **/
    @Autowired
    private CatalogoDAO myCatalogoDAO;
    
    @Transactional
    @Override
    public List<Catalogo> getCatalogo(String nombre_catalogo) {
        return myCatalogoDAO.getCatalogo(nombre_catalogo);
    }
     
}