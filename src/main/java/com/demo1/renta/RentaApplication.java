package com.demo1.renta;

import com.demo1.persistencia.model.Estacion;
import com.demo1.persistencia.repository.EstacionRepository;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.demo1")
//@ComponentScan({"com.delivery.request"})
@EntityScan("com.demo1.persistencia.model")
@EnableJpaRepositories("com.demo1.persistencia.repository")

public class RentaApplication {


    public static void main(String[] args) {
       SpringApplication.run(RentaApplication.class, args);

    }        
 
}
