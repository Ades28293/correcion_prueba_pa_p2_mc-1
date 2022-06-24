package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.service.IMatriculaGestorService;
import com.uce.edu.demo.service.IPropietarioService;
import com.uce.edu.demo.service.IVehiculoService;

@SpringBootApplication
public class CorrecionPruebaPaP2Mc1Application implements CommandLineRunner{
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	
	@Autowired
	private IMatriculaGestorService gestorService;
	
	public static void main(String[] args) {
		SpringApplication.run(CorrecionPruebaPaP2Mc1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Vehiculo v=new Vehiculo();
		v.setMarca("Totota");
		v.setPlaca("PCT8976");
		v.setPrecio(new BigDecimal(50000));
		v.setTipo("L");
		this.iVehiculoService.insertar(v);
		
		//2
		v.setPrecio(new BigDecimal(40000));
		v.setMarca("Toyota");
		this.iVehiculoService.actualizar(v);
		
		//3
		Propietario pro=new Propietario();
		pro.setApellido("Cen");
		pro.setNombre("Michael");
		pro.setFecha(LocalDateTime.now());
		pro.setCedula("1216416516");
		this.iPropietarioService.crear(pro);
		
		//
		
		this.gestorService.generar("1216416516", "PCT8976");
		
	}

}
