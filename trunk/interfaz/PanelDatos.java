package ud.poo.interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class PanelDatos extends JPanel {
	public JLabel labelEregistrados, labelEespera;
	public JTextField txtRegistrados, txtEspera;
	
	public PanelDatos(){
		setLayout(null);
		setBorder( new LineBorder( Color.gray ) );
		this.setBounds(350, 280, 340, 150);
		
		labelEregistrados=new JLabel("Estudiantes Registrados");
		labelEespera=new JLabel("Estudiantes en espera");
		txtRegistrados=new JTextField();
		txtRegistrados.setEditable(false);
		txtEspera=new JTextField();
		txtEspera.setEditable(false);
		
		add(labelEregistrados);
		labelEregistrados.setBounds(20, 10, 150, 50);		
		add(txtRegistrados);
		txtRegistrados.setBounds(180, 25, 150, 20);
		add(labelEespera);
		labelEespera.setBounds(20, 80, 150, 50);
		add(txtEspera);
		txtEspera.setBounds(180, 95, 150, 20);
	}
	
	public void consultarRegistrados(String a){
		txtRegistrados.setText(a);
	}
	
	public void  darEstudiantesEnEspera(String b){
		txtEspera.setText(b);
	}

}
