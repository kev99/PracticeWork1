package com.utn.dao;

import java.sql.SQLException;
import java.util.List;

import com.utn.modelo.Paciente;

public interface IMethodsDataBase<T> {

		 public List <T> getPacientes  ()  ;
	  
	 public boolean insertPaciente ( T tobject) ;

	T getPaciente(int id);
	  
	
	 
}
