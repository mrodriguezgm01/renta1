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
public class EstacionDTO {
  private Long codEstacion;
    private String nombre;
    private String latitud;
    private String longitud;
    private Integer cantidadDisponible;
    private String estado;
    private Date fechaCrea;

    public EstacionDTO(){};
    public EstacionDTO(Long codEstacion, String nombre, String latitud, String longitud, Integer cantidadDisponible, String estado, Date fechaCrea) {
        this.codEstacion = codEstacion;
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
        this.cantidadDisponible = cantidadDisponible;
        this.estado = estado;
        this.fechaCrea = fechaCrea;
    }

    
    
    public Long getCodEstacion() {
        return codEstacion;
    }

    public void setCodEstacion(Long codEstacion) {
        this.codEstacion = codEstacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public Integer getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(Integer cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaCrea() {
        return fechaCrea;
    }

    public void setFechaCrea(Date fechaCrea) {
        this.fechaCrea = fechaCrea;
    }
    
    
}
