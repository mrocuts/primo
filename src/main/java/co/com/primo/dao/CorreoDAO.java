/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.primo.dao;

import co.com.primo.entity.Correo;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface CorreoDAO {
    public void agregarCorreo(Correo myCorreo);
    public void actualizarCorreo(Correo myCorreo);
    public List<Correo> getAllCorreos(int idPersona);
    public Correo getCorreo(int idPersona, int idCorreo);
}
