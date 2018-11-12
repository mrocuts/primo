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
 * @author GAOQ
 */
@Entity
@Table(name = "correo")
public class Correo implements Serializable{
    
    /* Atributos de Clase */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcorreo;
    @Column(name = "idpersona")
    private int idpersona;
    @Column(name = "strcorreo")
    private String strCorreo;
    @Column(name = "bitprimario")
    private boolean bitPrimario;
    @Column(name = "bitactivo")
    private boolean bitActivo;

    /*
     * Constructor Vacío de la Clase Persona
     */
    public Correo(){
    }

    public Correo(int idcorreo, int idpersona, String strCorreo, boolean bitPrimario, boolean bitActivo) {
        this.idcorreo = idcorreo;
        this.idpersona = idpersona;
        this.strCorreo = strCorreo;
        this.bitPrimario = bitPrimario;
        this.bitActivo = bitActivo;
    }

    public int getIdcorreo() {
        return idcorreo;
    }

    public void setIdcorreo(int idcorreo) {
        this.idcorreo = idcorreo;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getStrCorreo() {
        return strCorreo;
    }

    public void setStrCorreo(String strCorreo) {
        this.strCorreo = strCorreo;
    }

    public boolean isBitPrimario() {
        return bitPrimario;
    }

    public void setBitPrimario(boolean bitPrimario) {
        this.bitPrimario = bitPrimario;
    }

    public boolean isBitActivo() {
        return bitActivo;
    }

    public void setBitActivo(boolean bitActivo) {
        this.bitActivo = bitActivo;
    }
}