package ud.poo.interfaz;


import java.awt.BorderLayout;

import javax.swing.JFrame;


public class Ventana extends JFrame {
	public PanelDatos panelDatos;
	public PanelAcciones panelAcciones;
	public PanelImagen panelImagen;
	
	public Ventana(){
		setLayout(null);
		setTitle("Nanosoft Getios de usuarios SiTUD");
		setSize(700,480);
		setResizable(false);
		this.setLocationRelativeTo(null);
		
		panelDatos=new PanelDatos();
		panelAcciones=new PanelAcciones(this);
		panelImagen=new PanelImagen();
	
		
		add(panelDatos);		
		add(panelAcciones);
		add(panelImagen);
		
	}
	
	//public void registrarEstudiante(String nombre, String estacion, Horario horario){
		
	//}
	
	public void cargarEstudiantes(String ubicacion){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventana v = new Ventana();
		v.setVisible(true);
	}
}
