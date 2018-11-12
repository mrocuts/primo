/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.primo.dao;

import co.com.primo.entity.Correo;
import co.com.primo.entity.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository
public class CorreoDAOImp implements CorreoDAO{
    
    /** Atributos de Clase */
    @PersistenceContext
    private EntityManager em;

    @Override
    public void agregarCorreo(Correo myCorreo) {
        em.persist(myCorreo);
    }

    @Override
    public void actualizarCorreo(Correo myCorreo) {
       em.persist(myCorreo);
    }

    @Override
    public List<Correo> getAllCorreos(int idPersona) {
        Query q = em.createNamedQuery("");
        return q.getResultList();
    }

    @Override
    public Correo getCorreo(int idPersona, int idCorreo) {
        Query q = em.createNamedQuery("");
        return (Correo) q.getSingleResult();
    }
}