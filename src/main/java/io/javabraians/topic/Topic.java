package io.javabraians.topic;

public class Topic {

	public int id;
	public String nombre;
	public Topic(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public Topic() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
