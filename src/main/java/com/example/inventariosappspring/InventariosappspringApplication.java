package com.example.inventariosappspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.inventariosappspring.controlador.ProductoControlador;
import com.example.inventariosappspring.modelo.ProductoRepositorio;

import com.example.inventariosappspring.vista.VistaPrincipal;

@SpringBootApplication
public class InventariosappspringApplication {

	@Autowired
	ProductoRepositorio productoRepositorio;



	public static void main(String[] args) {
		// SpringApplication.run(InventariosappspringApplication.class, args);
	
	SpringApplicationBuilder builder = new SpringApplicationBuilder(InventariosappspringApplication.class);
    builder.headless(false);
    ConfigurableApplicationContext context = builder.run(args);
}

	@Bean
	public void applicationRunner(){
		
		VistaPrincipal vista = new VistaPrincipal(productoRepositorio);
		 new ProductoControlador(
			productoRepositorio, 
			vista
			);
		

	}
}


