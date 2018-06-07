/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo1.persistencia.repository;

import com.demo1.persistencia.model.Renta;
import java.util.List;
import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pc
 */
@Repository
public interface RentaRepository extends JpaRepository<Renta, Long>{

}
