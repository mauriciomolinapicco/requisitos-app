package Requisitos;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class RequisitoTableModel extends AbstractTableModel {
	private static final int COLUMNA_NOMBRE= 0;
	private static final int COLUMNA_DESCRIPCION = 1;
	private static final int COLUMNA_PRIORIDAD = 2;
	private static final int COLUMNA_TIPO = 3;
	
	private String[] nombreColumnas = {"Nombre","Descripcion","Prioridad","Tipo"};
	private Class[] tiposColumnas = {String.class,String.class, Integer.class, String.class};
	
	private List<Requisito> contenido;
	
	public RequisitoTableModel() {
		contenido = new ArrayList<Requisito>();
	}
	
	public RequisitoTableModel(List <Requisito> contenidoInicial) {
		contenido = contenidoInicial;
	}
	
	public int getColumnCount() {
		return nombreColumnas.length;
	}
	
	public int getRowCount() {
		return contenido.size();
	}
	
	public String getColumnName(int col) {
		return nombreColumnas[col];
	}
	

	public Class getColumnClass(int col) {
		return tiposColumnas[col];
	}


	public Object getValueAt(int rowIndex, int columnIndex) {
		Requisito u = contenido.get(rowIndex);
		
		Object result = null;
		switch(columnIndex) {
		case COLUMNA_NOMBRE:
			result = u.getNombre();
			break;
		case COLUMNA_DESCRIPCION:
			result = u.getDescripcion();
			break;
		case COLUMNA_PRIORIDAD:
			result = u.getPrioridad();
			break;
		case COLUMNA_TIPO:
			result = u.getTipo();
			break;
		default:
			result = new String("");
		}
		return result;
	}
	
	public List<Requisito> getContenido(){
		return contenido;
	}
	
	public void setContenido(List<Requisito> contenido) {
		this.contenido = contenido;
	}

}
