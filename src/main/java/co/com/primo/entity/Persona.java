/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.primo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "persona")
public class Persona implements Serializable{
    
    /* Atributos de Clase */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersona;
    @Column(name = "strnumerodocumento")
    private String strNumeroDocumento;
    @Column(name = "strnombre")
    private String strNombre;
    @Column(name = "strapellido")
    private String strApellido;
    @Column(name = "bitactivo")
    private boolean bitActivo;
    @Column(name = "dtmfechacreacion")
    private Date dtmFechaCreacion;

    /*
     * Constructor Vacío de la Clase Persona
     */
    public Persona(){
    }

    /**
     * Constructor de la clase Persona
     * @param strNumeroDocumento
     * @param strNombre
     * @param strApellido
     * @param bitActivo
     * @param dtmFechaCreacion 
     */
    public Persona(String strNumeroDocumento,String strNombre,String strApellido,boolean bitActivo,
                   Date dtmFechaCreacion){
        this.strNumeroDocumento = strNumeroDocumento;
        this.strNombre = strNombre;
        this.strApellido = strApellido;
        this.bitActivo = bitActivo;
        this.dtmFechaCreacion = dtmFechaCreacion;
    }
    
    /**
     * @return the idPersona
     */
    public int getIdPersona() {
        return idPersona;
    }

    /**
     * @return the strNumeroDocumento
     */
    public String getStrNumeroDocumento() {
        return strNumeroDocumento;
    }

    /**
     * @return the strNombre
     */
    public String getStrNombre() {
        return strNombre;
    }

    /**
     * @return the strApellido
     */
    public String getStrApellido() {
        return strApellido;
    }

    /**
     * @return the bitActivo
     */
    public boolean isBitActivo() {
        return bitActivo;
    }

    /**
     * @return the dtmFechaCreacion
     */
    public Date getDtmFechaCreacion() {
        return dtmFechaCreacion;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * @param strNumeroDocumento the strNumeroDocumento to set
     */
    public void setStrNumeroDocumento(String strNumeroDocumento) {
        this.strNumeroDocumento = strNumeroDocumento;
    }

    /**
     * @param strNombre the strNombre to set
     */
    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    /**
     * @param strApellido the strApellido to set
     */
    public void setStrApellido(String strApellido) {
        this.strApellido = strApellido;
    }

    /**
     * @param bitActivo the bitActivo to set
     */
    public void setBitActivo(boolean bitActivo) {
        this.bitActivo = bitActivo;
    }

    /**
     * @param dtmFechaCreacion the dtmFechaCreacion to set
     */
    public void setDtmFechaCreacion(Date dtmFechaCreacion) {
        this.dtmFechaCreacion = dtmFechaCreacion;
    }
}