package Requisitos;

import javax.swing.JFrame;

public class Principal {
	public static void main(String[] args) {
		JFrame j = new JFrame("Prueba tablas");
		j.getContentPane().add(new TablaRequisitosPanel());
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.pack();
		j.setVisible(true);
	}

}
