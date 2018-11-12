/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.primo.dao;

import co.com.primo.entity.Catalogo;
import co.com.primo.entity.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository
public class CatalogoDAOImp implements CatalogoDAO{
    
    /** Atributos de Clase */
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Catalogo> getCatalogo(String nombre_catalogo) {
        return em.createNamedQuery("").getResultList();
    }
}