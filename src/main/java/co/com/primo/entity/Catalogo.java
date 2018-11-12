/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.primo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author GAOQ
 */
@Entity
@Table(name = "catalogos")
public class Catalogo implements Serializable{
    
    /* Atributos de Clase */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcatalogo;
    @Column(name = "nombrecatalogo")
    private String nombrecatalogo;
    @Column(name = "idcatalogoitem")
    private int idcatalogoitem;
    @Column(name = "itemcatalogo")
    private String itemcatalogo;
    @Column(name = "localizacion")
    private String localizacion;
    @Column(name = "descripcion")
    private String descripcion;

    /*
     * Constructor Vacío de la Clase Persona
     */
    public Catalogo(){
    }

    public Catalogo(int idcatalogo, String nombrecatalogo, int idcatalogoitem, String itemcatalogo, String localizacion, String descripcion) {
        this.idcatalogo = idcatalogo;
        this.nombrecatalogo = nombrecatalogo;
        this.idcatalogoitem = idcatalogoitem;
        this.itemcatalogo = itemcatalogo;
        this.localizacion = localizacion;
        this.descripcion = descripcion;
    }

    public int getIdcatalogo() {
        return idcatalogo;
    }

    public void setIdcatalogo(int idcatalogo) {
        this.idcatalogo = idcatalogo;
    }

    public String getNombrecatalogo() {
        return nombrecatalogo;
    }

    public void setNombrecatalogo(String nombrecatalogo) {
        this.nombrecatalogo = nombrecatalogo;
    }

    public int getIdcatalogoitem() {
        return idcatalogoitem;
    }

    public void setIdcatalogoitem(int idcatalogoitem) {
        this.idcatalogoitem = idcatalogoitem;
    }

    public String getItemcatalogo() {
        return itemcatalogo;
    }

    public void setItemcatalogo(String itemcatalogo) {
        this.itemcatalogo = itemcatalogo;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}