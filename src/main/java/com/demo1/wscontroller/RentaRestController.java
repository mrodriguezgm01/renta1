/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo1.wscontroller;

import com.demo1.persistencia.model.Renta;
import com.demo1.service.EstacionService;
import com.demo1.service.RentaService;
import com.demo1.service.dto.EstacionDTO;
import com.demo1.service.dto.RentaDTO;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pc
 */

@RestController
@RequestMapping(value = {"/rentas"})
public class RentaRestController {
    @Autowired
    RentaService rentaService;
    
    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<RentaDTO> listar(){
		return rentaService.listarHistorico();
	}
        
    @PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public RentaMessageResponse crear(@RequestBody Renta renta) {
         
            RentaMessageResponse message = new RentaMessageResponse();

            try {
                    renta.setFechaSolicitud(new Date());
                    rentaService.crear(renta);
                    message.setCode(1);
                    message.setMessage("Renta fue creada correctamente.");

            }catch(Exception ex) {
                    message.setCode(-1);
                    message.setMessage("Hubo un error al crear una Renta.");
                    message.setError(ex.getMessage());

            }

            return message;

    }
    
    @PutMapping(value = "/{codrenta}/{codestacion}",produces =  MediaType.APPLICATION_JSON_UTF8_VALUE,
                    consumes =  MediaType.APPLICATION_JSON_UTF8_VALUE)
    public RentaMessageResponse cambiarDevolucion(@PathVariable("codrenta") Long codrenta,@PathVariable("codestacion") Long codestacion) {

            RentaMessageResponse message = new RentaMessageResponse();
            try {
                    rentaService.cambiarDevolucion(codrenta, codestacion);
                    message.setCode(1);
                    message.setMessage("Estacion a devolver fue modificada correctamente.");

            }catch(Exception ex) {
                    message.setCode(-1);
                    message.setMessage("Hubo un error al modificar la estación a devolver.");
                    message.setError(ex.getMessage());

            }

            return message;
    }
    
    @DeleteMapping(value = "/{codrenta}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public RentaMessageResponse cancelar(@PathVariable("codrenta") Long codrenta) {

            RentaMessageResponse message = new RentaMessageResponse();

            try {

                    rentaService.cancelar(codrenta);
                    message.setCode(1);
                    message.setMessage("Renta fue cancelada correctamente.");

            }catch(Exception ex) {
                    message.setCode(-1);
                    message.setMessage("Hubo un error al cancelar la Renta.");
                    message.setError(ex.getMessage());
            }

            return message;
    }
}
