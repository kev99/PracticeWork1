package com.utn.factory;

import java.sql.*;
import java.util.*;

import com.utn.dao.IConnection;
import com.utn.dao.IMethodsDataBase;
import com.utn.modelo.Paciente;

public class PacienteFactory implements IMethodsDataBase<Paciente>  {

	private IConnection connex;
	
	public PacienteFactory() {
		this.connex = new ConnectionFactory();
	}
	
	@Override
	public Paciente getPaciente(int id) {

		Paciente paciente = null;

		try {

			Statement st = connex.getConnection().createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM pacientes WHERE id = " + id);

			while (rs.next()) {

				paciente = new Paciente(rs.getString("nombre"), rs.getString("apellido"), rs.getInt("id"));
}
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		return paciente;}

	
	
	@Override
	public List<Paciente> getPacientes() {
		
		List<Paciente> lista = new ArrayList<>();
		try {
			
			Statement st = (Statement) connex.getConnection().createStatement();
			ResultSet rs =  st.executeQuery("select * from pacientes");
	
			while(rs.next()) {
				lista.add(new Paciente(rs.getString("nombre"), rs.getString("apellido"), rs.getInt("id")));
			}
			
           } catch (Exception e) {

   			System.out.println(e.getMessage());
   		}
   	
		return lista;
	}

	@Override
	public boolean insertPaciente(Paciente tobject) {
		boolean res = false;
		try {
			String sql = "insert into pacientes () values ()";
			PreparedStatement ps = (PreparedStatement) connex.getConnection().prepareStatement(sql);
			ps.
			
			res = ps.execute();
			
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		return res;
	}
	
	}


	
	
	
	

