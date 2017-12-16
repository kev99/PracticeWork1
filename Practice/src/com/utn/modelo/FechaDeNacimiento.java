package com.utn.modelo;

public class FechaDeNacimiento {

	private int dia; 
	private int mes;
	private int año ;
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public FechaDeNacimiento(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	public String getFechadenac() {
		
		return dia + "/" + mes + "/" + año ;
	}
    
	public String toString () {
		
		return dia + "/" + mes + "/" + año ;
	}
	
	
	
}
