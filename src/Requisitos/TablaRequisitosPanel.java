package Requisitos;

import java.util.*;
import java.util.List;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TablaRequisitosPanel extends JPanel implements ActionListener {
	private JTable tablaRequisitos;
	private RequisitoTableModel modelo;
	
	private JScrollPane scrollPaneParaTabla;
	private JButton botonAgregar;
	private JButton botonBorrar;
	
	public TablaRequisitosPanel() {
		super();
		armarPanel();
	}
	
	private void armarPanel() {
		this.setLayout(new FlowLayout());
		
		modelo = new RequisitoTableModel();
		tablaRequisitos = new JTable(modelo);
		
		scrollPaneParaTabla = new JScrollPane(tablaRequisitos);
		this.add(scrollPaneParaTabla);
		
		botonBorrar = new JButton("Borrar fila");
		botonBorrar.addActionListener(this);
		this.add(botonBorrar);
		
		botonAgregar = new JButton("Cargar fila");
		botonAgregar.addActionListener(this);
		this.add(botonAgregar);

		
		Requisito r1 = new Requisito("prueba","ejemplo",3,"no funcional");
		Requisito r2 = new Requisito("prueba2","ejemplo2",3,"no funcional");
		List<Requisito> lista = new ArrayList<Requisito>();
		lista.add(r1);
		lista.add(r2);
		
		modelo.setContenido(lista);
		
		modelo.fireTableDataChanged();
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botonAgregar) {
			Random r = new Random();
			int x = r.nextInt(100);
			Random y = new Random();
			int prioridad = y.nextInt(100);
		
			Requisito r1 = new Requisito("Requisito"+x, "Descripcion"+x, prioridad, "Funcional");
			modelo.getContenido().add(r1);
			modelo.fireTableDataChanged();
		} else if (e.getSource() == botonBorrar) {
			//Obtengo la fila seleccionada (o sea la que se quiere borrar)
			int filaSeleccionada = this.tablaRequisitos.getSelectedRow();
			Requisito requisito = this.modelo.getContenido().get(filaSeleccionada);
			System.out.println(requisito);
			this.modelo.getContenido().remove(filaSeleccionada);
			modelo.fireTableDataChanged();
		}
	}

}
