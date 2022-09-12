package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener, MouseListener{
	private Vista vista; 
	private Modelo modelo;
	
	public Controlador()  {
		super();
		this.vista = new Vista(this);
		this.modelo = new Modelo();
		vista.setVisible(true);
	}
	public Vista getVista() {
		return vista;
	}
	public void setVista(Vista vista) {
		this.vista = vista;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "Hola":
			System.out.println("HOLAA!!");
			break;
		case "Chau":
			System.out.println("CHAUU!!");
			break;

		default:
			break;
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getComponent().equals(getVista().getLblNewLabel()))
		{System.out.println("click en img");}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
