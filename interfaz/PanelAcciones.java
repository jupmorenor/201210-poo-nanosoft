package interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PanelAcciones extends JPanel implements ActionListener {
	private JButton registrarEstudiante, editarEstudiante, agregarBus;
	private JButton asignarCupos, cargarDatos, generarInformes;
	private Ventana vent;
	public static final String REGISTRAR = "Registrar estudiante";
	public static final String EDITAR = "Editar estudiante";
	public static final String AGREGAR = "Agregar bus";
	public static final String ASIGNAR = "Asignar bus";
	public static final String CARGAR = "Cargar datos";
	public static final String GENERAR = "Generar datos";

	public PanelAcciones(Ventana v) {
		vent = v;

		setLayout(null);
		setBorder(new LineBorder(Color.GRAY));
		this.setBounds(350, 20, 340, 280);

		registrarEstudiante = new JButton("Registrar Estudiante");
		registrarEstudiante.addActionListener(this);
		registrarEstudiante.setActionCommand(REGISTRAR);

		editarEstudiante = new JButton("Editar Estudiante");
		editarEstudiante.addActionListener(this);
		editarEstudiante.setActionCommand(EDITAR);

		agregarBus = new JButton("Agregar Bus");
		agregarBus.addActionListener(this);
		agregarBus.setActionCommand(AGREGAR);

		asignarCupos = new JButton("Asignar Cupos");
		asignarCupos.addActionListener(this);
		asignarCupos.setActionCommand(ASIGNAR);

		cargarDatos = new JButton("Cargar Datos");
		cargarDatos.addActionListener(this);
		cargarDatos.setActionCommand(CARGAR);

		generarInformes = new JButton("Generar Informes");
		generarInformes.addActionListener(this);
		generarInformes.setActionCommand(GENERAR);

		add(registrarEstudiante);
		registrarEstudiante.setBounds(20, 10, 150, 50);
		add(editarEstudiante);
		editarEstudiante.setBounds(180, 10, 150, 50);
		add(agregarBus);
		agregarBus.setBounds(20, 80, 150, 50);
		add(asignarCupos);
		asignarCupos.setBounds(180, 80, 150, 50);
		add(cargarDatos);
		cargarDatos.setBounds(20, 150, 150, 100);
		add(generarInformes);
		generarInformes.setBounds(180, 150, 150, 100);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(REGISTRAR)) 
		{
			vent.registrarEstudiante();
		} 
		else if (e.getActionCommand().equals(EDITAR)) 
		{
			vent.editarEstudiante();
		}
		else if (e.getActionCommand().equals(AGREGAR)) {
			//TODO

		} else if (e.getActionCommand().equals(ASIGNAR)) {
			//TODO

		} else if (e.getActionCommand().equals(CARGAR)) {
			//TODO

		} else if (e.getActionCommand().equals(GENERAR)) {
			//TODO

		}

	}

}