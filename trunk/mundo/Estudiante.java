/**
 * -----------------------------------------------------------------
 * Universidad Distrital Francisco Jose de Caldas
 * Facultad de Ingenieria
 * Proyecto curricular de Ingenieria de Sistemas
 * 
 * Proyecto final de Programacion Orientada a Objetos
 * Presentado por:
 * Juan Pablo Moreno Rico - codigo: 20111020059
 * Andrés Felipe Rodriguez Rincón - codigo: 20112020034
 * Bajo el nombre de "NanoSoft - Gestion de Usuarios SitUD"
 * -----------------------------------------------------------------
 */
package mundo;

import java.util.ArrayList;

/**
 * Clase que representa un estudiante
 */
public class Estudiante 
{
    //-----------------------------------------------------------------
    // Constantes
    //-----------------------------------------------------------------

	public final static String HABILITADO = "habilitado";

	public final static String ESPERA = "en espera";

	public final static String INACTIVO = "inactivo";
	
	public final static String HABILITADO_COSTO = "habilitado con costo";
	
	//-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
	/**
	 * Nombre del estudiante
	 */
	private String nombre;
	
	/**
	 * Codigo del estudiante
	 */
	private String codigo;
	
	/**
	 * Estacion en la que el estudiante aborda el sistema
	 */
	private String estacion;
	
	/**
	 * Estado del estudiante dentro del sistema
	 */
	private String estado;
	
	/**
	 * Identificador de la ruta que usa el estudiante
	 */
	private String idRuta;
	
	/**
	 * Identificador del bus asignado para el estudiante
	 */
	private String idBus;
	
	/**
	 * Horario de uso del sistema por parte del estudiante
	 */
	private ArrayList<Horario> horario;
	
	/**
	 * Registro de uso del sistema por parte del estudiante
	 */
	private ArrayList<Historial> historial;
	
    //-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------
	
	/**
	 * Crea un nuevo estudiante
	 * <b>post: </b> El estudiante queda registrado con estado en espera <br> 
	 * mientras se le asigna un cupo en el sistema
	 */
	public Estudiante(String nombre, String codigo, String estacion, ArrayList horario)
	{
		this.nombre = nombre;
		this.codigo = codigo;
		this.estacion = estacion;
		this.horario = horario;
		estado = ESPERA;
	}
	
    //-----------------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------------
	
	/**
	 * Devuelve el nombre del estudiante
	 * @return nombre del estudiante
	 */
	public String darNombre()
	{
		return nombre;
	}
	
	/**
	 * Devuelve el codigo del estudiante
	 * @return codigo del estudiante
	 */
	public String darCodigo()
	{
		return codigo;
	}
	
	/**
	 * Devuelve la estacion en la que el estudiante aborda el sistema
	 * @return estacion de abordaje
	 */
	public String darEstacion()
	{
		return estacion;
	}
	
	/**
	 * Devuelve el horario que registra el estudiante
	 * @return horario del estudiante
	 */
	public ArrayList<Horario> darHorario()
	{
		return horario;
	}
	
	/**
	 * Asigna una ruta al estudiante por medio de su identificador
	 * @param idRuta identificador de la ruta
	 */
	public void asignarRuta(String idRuta)
	{
		this.idRuta = idRuta;
	}
	
	/**
	 * Asigna un bus al estudiante por medio de su identificador
	 * @param idBus identificador del bus
	 */
	public void asignarBus(String idBus)
	{
		this.idBus = idBus;
	}
	
	/**
	 * Cambia la estacion de abordaje del estudiante por una nuevaEstacion
	 * @param nuevaEstacion de abordaje
	 */
	public void cambiarEstacion(String nuevaEstacion)
	{
		estacion = nuevaEstacion;
	}
	
	/**
	 * Cambia el horario registrado por el estudiante por un nuevoHorario
	 * @param nuevoHorario del estudiante
	 */
	public void cambiarHorario(ArrayList<Horario> nuevoHorario)
	{
		horario = nuevoHorario;
	}
	
	/**
	 * Cambia el estado del estudiante por un nuevoEstado
	 * @param nuevoEstado del estudiante
	 */
	public void cambiarEstado(String nuevoEstado)
	{
		estado = nuevoEstado;
	}
}
