/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo1.persistencia.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;

/**
 *
 * @author pc
 */
@Entity
public class Bicicleta {
    private Long codBicicleta;
    private String numero;    
    private String estado;
    private Long codEstacion;

    public Bicicleta(){}
    
    public Bicicleta(String numero, String estado, Long codEstacion) {
        this.numero = numero;
        this.estado = estado;
        this.codEstacion = codEstacion;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)    
    public Long getCodBicicleta() {
        return codBicicleta;
    }

    public void setCodBicicleta(Long codBicicleta) {
        this.codBicicleta = codBicicleta;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
        public Long getCodEstacion() {
        return codEstacion;
    }

    public void setCodEstacion(Long codEstacion) {
        this.codEstacion = codEstacion;
    }
        
}
