/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo1.service.impl;

import com.demo1.persistencia.model.Estacion;
import com.demo1.persistencia.model.Renta;
import com.demo1.persistencia.repository.RentaRepository;
import com.demo1.service.RentaService;
import com.demo1.service.dto.EstacionDTO;
import com.demo1.service.dto.RentaDTO;
import com.demo1.wscontroller.RentaMessageResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pc
 */
@Service
public class RentaServiceImpl implements RentaService{
@Autowired
private RentaRepository rentaRepository;

    @Override
    public void crear(Renta renta) {
        rentaRepository.save(renta);
        
    }

    @Override
    public void cancelar(Long codRenta) {
       Renta renta=rentaRepository.findOne(codRenta);
        renta.setEstado("CANCELADO");
        renta.setFechaCancelacion(new Date());        
        rentaRepository.save(renta); 
    }

    @Override
    public void cambiarDevolucion(Long codRenta,Long codEstacionDevolucion) {
        Renta renta=rentaRepository.findOne(codRenta);
        renta.setCodEstacionDevolucion(codEstacionDevolucion);
        //renta.setCodRenta(codRenta);
        rentaRepository.save(renta);
    }

    @Override
    public List<RentaDTO> listarHistorico() {
         List<Renta> rentaList= rentaRepository.findAll();
         
        List<RentaDTO> rentaDTOList = new ArrayList<>();
        for(Renta renta: rentaList) {
                rentaDTOList.add(new RentaDTO(renta.getCodRenta(),
                        renta.getCodEstacionOrigen(),
                        renta.getCodEstacionDevolucion(),
                        renta.getCodBicicleta(),
                        renta.getEstado(),
                        renta.getFechaSolicitud(),
                        renta.getFechaDevolucion(),
                        renta.getFechaCancelacion()
                )
                );
        }

        return rentaDTOList;
    }

    @Override
    public RentaDTO recuperar(Long codRenta) {
        Renta renta= rentaRepository.findOne(codRenta);


        return (new RentaDTO( renta.getCodRenta(),
                            renta.getCodEstacionOrigen(),
                            renta.getCodEstacionDevolucion(),
                            renta.getCodBicicleta(),
                            renta.getEstado(),
                            renta.getFechaSolicitud(),
                            renta.getFechaDevolucion(),
                            renta.getFechaCancelacion()
                    )
                );

    }

    
}
