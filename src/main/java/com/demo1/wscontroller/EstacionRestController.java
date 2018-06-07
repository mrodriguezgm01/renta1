/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo1.wscontroller;

import com.demo1.service.EstacionService;
import com.demo1.service.dto.EstacionDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pc
 */

@RestController

@RequestMapping(value = {"/estaciones"})
public class EstacionRestController {
    @Autowired
    EstacionService estacionService;
    
    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<EstacionDTO> listar(){
            return estacionService.listar();
    }
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public EstacionDTO listar(@PathVariable("id") Long id){
            return estacionService.listar(id);
    }
}
