/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo1.service;

import com.demo1.persistencia.model.Estacion;
import com.demo1.service.dto.EstacionDTO;
import java.util.List;

/**
 *
 * @author pc
 */
public interface EstacionService {
    List<EstacionDTO> listar();
    EstacionDTO listar(Long id);
}
