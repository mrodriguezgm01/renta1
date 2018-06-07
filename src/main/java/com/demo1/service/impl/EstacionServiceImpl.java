/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo1.service.impl;

import com.demo1.persistencia.model.Estacion;
import com.demo1.persistencia.repository.EstacionRepository;
import com.demo1.service.EstacionService;
import com.demo1.service.dto.EstacionDTO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pc
 */
@Service
public class EstacionServiceImpl implements EstacionService{
@Autowired
private EstacionRepository estacionRepository;

@Override
public List<EstacionDTO> listar() {
    
    List<Estacion> estacionList= estacionRepository.findAll();


    List<EstacionDTO> estacionDTOList = new ArrayList<>();
    for(Estacion estacion: estacionList) {
            estacionDTOList.add(new EstacionDTO( estacion.getCodEstacion(),estacion.getNombre(),
            estacion.getLatitud(),estacion.getLongitud(),estacion.getCantidadDisponible(),
            estacion.getEstado(),estacion.getFechaCrea())
            );
    }

    return estacionDTOList;

}

@Override
public EstacionDTO listar(Long id) {
    Estacion estacion= estacionRepository.findOne(id);


    return (new EstacionDTO( estacion.getCodEstacion(),estacion.getNombre(),
            estacion.getLatitud(),estacion.getLongitud(),estacion.getCantidadDisponible(),
            estacion.getEstado(),estacion.getFechaCrea()));

}
    
}
