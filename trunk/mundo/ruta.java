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
 * Clase que representa una ruta del sistema
 */
public class Ruta 
{
	//-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
	/**
	 * cupos disponibles en la ruta
	 */
	private int cuposDisponibles;
	
	/**
	 * Identificador de la ruta
	 */
	private String idRuta;
	
	/**
	 * lista de los buses que circulan por esa ruta
	 */
	private ArrayList<Bus> buses;
	
	/**
	 * lista de estaciones donde para el bus en esa ruta
	 */
	private ArrayList<Estacion> estaciones;
	
	//-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------
	
	/**
	 * Crea una nueva ruta <br>
	 * <b>post: </b> La ruta tiene por defecto las estaciones que ingresan como parametro.
	 * @param idRuta Identificador de la ruta
	 * @param estaciones por defecto
	 */
	public Ruta(String idRuta, ArrayList<String> estaciones)
	{
		this.idRuta = idRuta;
		buses = new ArrayList<Bus>();
		this.estaciones = new ArrayList<Estacion>();
		cuposDisponibles = 0;
		
		for(int i=0; i<estaciones.size(); i++)
		{
			Estacion estacion = new Estacion(this.idRuta, estaciones.get(i));
			this.estaciones.add(estacion);
		}
		
	}
	
	/**
	 * Asigna un nuevo bus a la ruta
	 * @param idBus identificador del bus
	 * @param capacidad cantidad de pasajeros que puede llevar
	 */
	public void asignarBus(String idBus, int capacidad)
	{
		Bus bus = new Bus(idBus, capacidad, this.idRuta);
		buses.add(bus);
	}
	
	/**
	 * Devuelve la cantidad de cupos disponibles en la ruta obtenido de los buses
	 * @return cuposDisponibles
	 */
	public int darCuposDisponibles()
	{
		cuposDisponibles = 0;
		for(int i=0; i<buses.size(); i++)
		{
			cuposDisponibles += buses.get(i).darCuposDisponibles();
		}
		return cuposDisponibles;
	}
	
	/**
	 * Devuleve el identificador de la ruta
	 * @return idRuta dentificador de la ruta
	 */
	public String darIDRuta()
	{
		return idRuta;
	}
}