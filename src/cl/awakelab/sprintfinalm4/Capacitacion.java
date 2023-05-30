package cl.awakelab.sprintfinalm4;

import java.text.SimpleDateFormat;
import java.time.LocalTime;

/**
 * La clase Capacitación representa el registro de una capacitación. Esta clase
 * proporciona métodos para acceder y modificar los atributos de la
 * capacitación, así como los detalles de la misma y obtener su reprentación
 * mediante cadenas de texto.
 * 
 * @author Alexis Campusano
 * @author Fernanda Fajre
 * @author Christopher Figueroa
 * @author Carlos Torres
 *
 */

public class Capacitacion {
	/**
	 * Representa un número identificador para la capacitación.
	 */
	private int identificador;
	/**
	 * Representa el rut del cliente que registra la capacitación.
	 */
	private int rutCliente;
	/**
	 * Representa el día en el que se hará la capacitación.
	 */
	private String dia;
	/**
	 * Representa la hora en la que se hará la capacitación.
	 */
	private LocalTime hora;
	/**
	 * Representa el lugar donde se hará la capacitación.
	 */
	private String lugar;
	/*
	 * Representa la duración de la capacitación.
	 */
	private int duracion;
	/**
	 * Representa la cantidad de asistentes que podrán asistir a la capacitación.
	 */
	private int cantidadAsistentes;

	/**
	 * Constructor vacío para la clase Capacitacion.
	 */
	public Capacitacion() {

	}

	/**
	 * Registra una capacitación con sus campos específicos.
	 *
	 * @param identificador      El número identificador de la capacitación.
	 * @param rutCliente         El rut del cliente que registra la capacitación.
	 * @param dia                El día en que se realizará la capacitación.
	 * @param hora               La hora en que se realizará la capacitación.
	 * @param lugar              El lugar donde se realizará la capacitación.
	 * @param duracion           La duración de la capacitación en minutos.
	 * @param cantidadAsistentes La cantidad de asistentes permitidos en la
	 *                           capacitación.
	 */
	public Capacitacion(int identificador, int rutCliente, String dia, LocalTime hora, String lugar, int duracion,
			int cantidadAsistentes) {
		this.identificador = identificador;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}

	/**
	 * Devuelve un número indentificativo asignado a la capacitación.
	 * 
	 * @return Un número que representa el número identificador.
	 */
	public int getIdentificador() {
		return identificador;
	}

	/**
	 * Establece el identificador de la capacitación.
	 * 
	 * @param identificador Un número que contiende el identificador de la
	 *                      capacitación.
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	/**
	 * Devuelve el rut del cliente.
	 * 
	 * @return Un número que representa el rut del cliente que registra la
	 *         capacitación.
	 */
	public int getRutCliente() {
		return rutCliente;
	}

	/**
	 * Establece el rut del cliente.
	 * 
	 * @param rutCliente Un número que contiene el rut del cliente que registra la
	 *                   capacitación.
	 */
	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	/**
	 * Devuelve el día de la capacitación.
	 * 
	 * @return Una cadena que representa el día de la capacitación.
	 */
	public String getDia() {
		return dia;
	}

	/**
	 * Establece el día de la capacitación.
	 * 
	 * @param dia Una cadena que contiene el día de la capacitación.
	 */
	public void setDia(String dia) {
		this.dia = dia;
	}

	/**
	 * Devuelve la hora de la capacitación.
	 * 
	 * @return hora La hora que representa la hora de la capacitación.
	 */
	public LocalTime getHora() {
		return hora;
	}

	/**
	 * Establece la hora de la capacitación.
	 * 
	 * @param hora La hora que contiene la hora de la capacitación.
	 */
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	/**
	 * Devuelve el lugar de la capacitación.
	 * 
	 * @return Una cadena que representa el lugar de la capacitación.
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * Establece el lugar de la capacitación.
	 * 
	 * @param lugar Una cadena que contiene el lugar de la capacitación.
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/**
	 * Devuelve la duración de la capacitación.
	 * 
	 * @return Un número que representa la duración de la capacitación.
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * Establece la duración de la capacitación.
	 * 
	 * @param duracion Un número que establece la duración de la capacitación.
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	/**
	 * Devuelve la cantidad de asistentes de la capacitación.
	 * 
	 * @return Un número que representa la cantidad de asistentes para la
	 *         capacitación.
	 */
	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	/**
	 * Establece la cantidad de asistentes de la capacitacióñ.
	 * 
	 * @param cantidadAsistentes Un número que contiene la cantidad de asistentes de
	 *                           la capacitación.
	 */
	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

	/**
	 * Muestra por consola los detalles del accidente.
	 */
	public void mostrarDetalle() {
		SimpleDateFormat fechaFormato = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat horaFormato = new SimpleDateFormat("HH:mm");

		String fecha = fechaFormato.format(dia);
		String horaInicio = horaFormato.format(dia);
		String lugarCapacitacion = lugar;
		int duracionMinutos = duracion;

		String mensaje = "La capacitación será en " + lugarCapacitacion + " a las " + horaInicio + " del día " + fecha
				+ ", y durará " + duracionMinutos + " minutos.";

		System.out.println(mensaje);
	}

	/**
	 * Devuelve su representación mediante una cadena del objeto Capacitacion.
	 * 
	 * @return Una cadena de texto que representa el objeto Capacitacion y sus
	 *         atributos.
	 */
	@Override
	public String toString() {
		return "Capacitacion " + "identificador: " + identificador + ", rutCliente: " + rutCliente + ", dia: " + dia
				+ ", hora: '" + hora + '\'' + ", lugar: '" + lugar + '\'' + ", duracion: " + duracion
				+ ", cantidadAsistentes: " + cantidadAsistentes;
	}
}
