package com.utn.modelo;

public class Paciente extends Persona {

	private String usuario;
	private String contrase�a;
	private String tipodetratamiento;
    private int id;
    
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	public String getTipodetratamiento() {
		return tipodetratamiento;
	}
	public void setTipodetratamiento(String tipodetratamiento) {
		this.tipodetratamiento = tipodetratamiento;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Paciente(String nombre, String apellido, int dni, int edad, String telefono, String mail,
			FechaDeNacimiento fechadenacimiento, String localidad, String sexo, String usuario, String contrase�a,
			String tipodetratamiento, int id) {
		super(nombre, apellido, dni, edad, telefono, mail, fechadenacimiento, localidad, sexo);
		this.usuario = usuario;
		this.contrase�a = contrase�a;
		this.tipodetratamiento = tipodetratamiento;
		this.id = id;
	}
	public Paciente(String nombre, String apellido, int dni, int edad, String telefono, String mail,
			FechaDeNacimiento fechadenacimiento, String localidad, String sexo) {
		super(nombre, apellido, dni, edad, telefono, mail, fechadenacimiento, localidad, sexo);
	}
	public Paciente(String nombre, String apellido, int dni, int edad, String telefono, String mail,
			FechaDeNacimiento fechadenacimiento, String localidad, String sexo, int id) {
		super(nombre, apellido, dni, edad, telefono, mail, fechadenacimiento, localidad, sexo);
		this.id = id;
	}
	public Paciente(String nombre, String apellido, int id) {
		super(nombre, apellido);
		this.id= id ;
		// TODO Auto-generated constructor stub
	}
	
	
    

    	
    }