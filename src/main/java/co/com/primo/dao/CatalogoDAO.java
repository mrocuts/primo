/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.primo.dao;

import co.com.primo.entity.Catalogo;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface CatalogoDAO {
    public List<Catalogo> getCatalogo(String nombre_catalogo);
}
