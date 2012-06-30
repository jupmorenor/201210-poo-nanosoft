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

/**
 * Clase que representa un Bus
 */
public class Bus 
{
	/**
	 * Identificador del bus
	 */
	private String idBus;
	
	/**
	 * Cupos disponibles en el bus
	 */
	private int cuposDisponibles;
	
	/**
	 * Capacidad total del bus
	 */
	private int capacidadTotal;
	
	/**
	 * Identificador de la ruta a la que pertenece el bus
	 */
	private String idRuta;
	
	/**
	 * Crea un nuevo bus con una capadidad dada en la ruta indicada
	 * @param idBus
	 * @param capacidad
	 * @param idRuta
	 */
	public Bus(String idBus, int capacidad, String idRuta)
	{
		this.idBus = idBus;
		capacidadTotal = cuposDisponibles = capacidad;
		this.idRuta = idRuta;
	}
	
	/**
	 * Devuelve la cantidad de cupos disponibles que tiene el bus
	 * @return cuposDisponibles del bus
	 */
	public int darCuposDisponibles()
	{
		return cuposDisponibles;
	}
	
	/**
	 * Devuelve la capacidad total de pasajeros que tiene el bus
	 * @return capacidadTotal del bus
	 */
	public int darCapacidad()
	{
		return capacidadTotal;
	}
	
	/**
	 * Devuelve el identificador del bus
	 * @return idBus identificador del bus
	 */
	public String darIDBus()
	{
		return idBus;
	}
	
	/**
	 * Devuleve el identificador de la ruta a la que pertenece el bus
	 * @return idRuta dentificador de la ruta
	 */
	public String darIDRuta()
	{
		return idRuta;
	}
	
	/**
	 * Resta de los cupos disponibles los cupos que han sido asignados
	 * @param cantidad a asignar
	 */
	public void asignarCupos(int cantidad)
	{
		cuposDisponibles -= cantidad;
	}
}
