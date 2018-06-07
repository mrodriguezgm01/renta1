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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author pc
 */
@Entity
public class Renta {
    private Long codRenta;
    private Long codEstacionOrigen;
    private Long codEstacionDevolucion;
    private Long codBicicleta;
    private String estado;
    private Date fechaSolicitud;
    private Date fechaDevolucion;
    private Date fechaCancelacion;

    @Id
    @GeneratedValue(strategy = IDENTITY) 
    public Long getCodRenta() {
        return codRenta;
    }

    public void setCodRenta(Long codRenta) {
        this.codRenta = codRenta;
    }

    public Long getCodEstacionOrigen() {
        return codEstacionOrigen;
    }

    public void setCodEstacionOrigen(Long codEstacionOrigen) {
        this.codEstacionOrigen = codEstacionOrigen;
    }

    public Long getCodEstacionDevolucion() {
        return codEstacionDevolucion;
    }

    public void setCodEstacionDevolucion(Long codEstacionDevolucion) {
        this.codEstacionDevolucion = codEstacionDevolucion;
    }

    public Long getCodBicicleta() {
        return codBicicleta;
    }

    public void setCodBicicleta(Long codBicicleta) {
        this.codBicicleta = codBicicleta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(Date fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }
    
    
    
}
