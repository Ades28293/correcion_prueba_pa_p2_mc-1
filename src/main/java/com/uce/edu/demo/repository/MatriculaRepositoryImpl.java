package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{

	@Override
	public void crear(Matricula ma) {
		// TODO Auto-generated method stub
		System.out.println("Se crea la matricula: "+ma);
		
	}

}
