package com.utn.controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.sql.Connection;

import com.utn.dao.IConnection;
import com.utn.dao.IMethodsDataBase;
import com.utn.factory.PacienteFactory;
import com.utn.modelo.Paciente;


public class PacienteController {

private PacienteFactory pf;
	
	public PacienteController() {
		this.pf=new PacienteFactory();
	}
	
	
	public void insertoMateria(Paciente materia)
	{
		try {
			pf.insertPaciente(materia);
		}  catch (Exception e) {

   			System.out.println(e.getMessage());
   		}
	}
	
	
	public void muestroMPacienteCargadas() {
		try {
			for (Paciente item : pf.getPacientes()) {
				System.out.println(item);
			};
		}  catch (Exception e) {

   			System.out.println(e.getMessage());
   		}
	}
	
	
}
