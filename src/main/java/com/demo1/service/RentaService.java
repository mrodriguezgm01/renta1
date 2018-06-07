/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo1.service;

import com.demo1.persistencia.model.Estacion;
import com.demo1.persistencia.model.Renta;
import com.demo1.service.dto.EstacionDTO;
import com.demo1.service.dto.RentaDTO;
import com.demo1.wscontroller.RentaMessageResponse;
import java.util.List;

/**
 *
 * @author pc
 */
public interface RentaService {
    void crear(Renta renta);
    void cancelar(Long codRenta);
    void cambiarDevolucion(Long codRenta,Long codEstacionDevolucion);
    List<RentaDTO> listarHistorico();
    public RentaDTO recuperar(Long codRenta);
    
}
