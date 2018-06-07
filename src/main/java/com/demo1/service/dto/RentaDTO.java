/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo1.service.dto;

import java.util.Date;

/**
 *
 * @author pc
 */
public class RentaDTO {
    private Long codRenta;
    private Long codEstacionOrigen;
    private Long codEstacionDevolucion;
    private Long codBicicleta;
    private String estado;
    private Date fechaSolicitud;
    private Date fechaDevolucion;
    private Date fechaCancelacion;

    public RentaDTO(){}
    public RentaDTO(Long codRenta, Long codEstacionOrigen, Long codEstacionDevolucion, Long codBicicleta, String estado, Date fechaSolicitud, Date fechaDevolucion, Date fechaCancelacion) {
        this.codRenta = codRenta;
        this.codEstacionOrigen = codEstacionOrigen;
        this.codEstacionDevolucion = codEstacionDevolucion;
        this.codBicicleta = codBicicleta;
        this.estado = estado;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaDevolucion = fechaDevolucion;
        this.fechaCancelacion = fechaCancelacion;
    }

    
    
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

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Date getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(Date fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }
    
    
}
