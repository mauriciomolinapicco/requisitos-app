package Requisitos;

public class Requisito {
	
	private String nombre;
	private String descripcion;
	private Integer prioridad;
	private String tipo;
	
	public Requisito(String nombre, String descripcion, int prioridad, String tipo) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.prioridad = prioridad;
		this.tipo = tipo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getPrioridad() {
		return prioridad;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
