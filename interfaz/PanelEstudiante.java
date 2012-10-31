package interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import mundo.Estudiante;
import mundo.Horario;


public class PanelEstudiante extends JPanel implements ActionListener 
{
	
	private static final String ACEPTAR = "ACEPTAR";
	private static final String CANCELAR = "CANCELAR";
	private static final String HORARIO = "HORARIO";

	private DialogoEstudiante ventana;
	private ArrayList<Horario> horarios;
	
	private JLabel labelNombre;
	private JLabel labelCodigo;
	private JLabel labelEstacion;
	private JLabel labelHorario;

	private JTextField txtNom;
	private JTextField txtCod;
	private JTextField txtEst;

	private JButton aceptar;
	private JButton cancelar;
	private JButton hor;
	
	public PanelEstudiante(DialogoEstudiante v)
	{
		setLayout(new GridLayout(5,2));
		ventana = v;
		
		labelNombre = new JLabel("Nombre del Estudiante: ");
		txtNom = new JTextField();
		labelCodigo = new JLabel("Codigo del Estudiante: ");
		txtCod = new JTextField();
		labelEstacion = new JLabel("Estracion de abordaje: ");
		txtEst = new JTextField();
		
		labelHorario = new JLabel("Horario");
		hor = new JButton("Generar Horario");
		hor.setActionCommand(HORARIO);
		hor.addActionListener(this);
		
		aceptar = new JButton("Aceptar");
		aceptar.setActionCommand(ACEPTAR);
		aceptar.addActionListener(this);
		
		cancelar = new JButton("Cancelar");
		cancelar.setActionCommand(CANCELAR);
		cancelar.addActionListener(this);
		
		add(labelNombre); add(txtNom);
		add(labelCodigo); add(txtCod);
		add(labelEstacion); add(txtEst);
		add(labelHorario); add(hor);
		add(aceptar); add(cancelar);	
	}
	
	public Estudiante agregar()
	{
		horario = new ArrayList<Horario>();
		//TODO agregar los horarios
		return new Estudiante(txtNom.getText(), txtCod.getText(), txtEst.getText(), horario);
	}
	
	public void cambiar(Estudiante estudiante)
	{
		estudiante.cambiarEstacion(txtEst.getText());
		estudiante.cambiarHorario(null);
		//TODO
	}
	
	public boolean esValido()
	{
		if(txtNom.getText().length()==0)
		{
			JOptionPane.showMessageDialog( this, "Debe ingresar el nombre del estudiante", "Error", JOptionPane.ERROR_MESSAGE );
            return false;
		}
		if(txtCod.getText().length()==0)
		{
			JOptionPane.showMessageDialog( this, "Debe ingresar el codigo del estudiante", "Error", JOptionPane.ERROR_MESSAGE );
            return false;
		}
		if(txtEst.getText().length()==0)
		{
			JOptionPane.showMessageDialog( this, "Debe ingresar la estacion de abordaje del estudiante", "Error", JOptionPane.ERROR_MESSAGE );
            return false;
		}
		/*if(horarios.isEmpty())
		{
			JOptionPane.showMessageDialog( this, "Debe ingresar al menos un horario del estudiante", "Error", JOptionPane.ERROR_MESSAGE );
            return false;
		}*/
		return true;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand().equals(ACEPTAR))
		{
			ventana.aceptar();
		}
		else
		{
			ventana.cancelar();
		}
	}
	
	public void bloquearNombre()
	{
		txtNom.setEditable(false);
	}
	
	public void buscarEstudiante(String cod)
	{
		//TODO
	}

}
