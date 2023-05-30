package cl.awakelab.sprintfinalm4;

/**
 * La clase Accidente representa un accidente ocurrido. Esta clase proporciona
 * métodos para acceder y modificar los atributos del accidente, así como
 * detalles del mismo y obtener su representación mediante cadenas de texto.
 * 
 * @author Alexis Campusano
 * @author Fernanda Fajre
 * @author Christopher Figueroa
 * @author Carlos Torres
 *
 */

class Accidente {
	/**
	 * Representa un número identificador para el accidente.
	 */
	private int identificador;
	/**
	 * Representa el rut del cliente que sufrió el accidente.
	 */
	private int rutCliente;
	/**
	 * Representa el día en el que ocurrió el accidente.
	 */
	private String dia;
	/**
	 * Representa la hora en la cual ocurrió el accidente.
	 */
	private String hora;
	/**
	 * Representa el lugar en el que ocurrió el accidente.
	 */
	private String lugar;
	/**
	 * Representa las causas del accidente.
	 */
	private String origen;
	/**
	 * Representa las consecuencias del accidente.
	 */
	private String consecuencias;

	/**
	 * Constructor sin parametros de accidente.
	 */
	public Accidente() {
	}

	/**
	 * Registra un accidente con sus campos específicos.
	 * 
	 * @param identificador el identificador del accidente
	 * @param rutCliente    el RUT del cliente que sufrió el accidente
	 * @param dia           el día en el que ocurrió el accidente
	 * @param hora          la hora en la que ocurrió el accidente
	 * @param lugar         el lugar en el que ocurrió el accidente
	 * @param origen        el origen del accidente
	 * @param consecuencias las consecuencias del accidente
	 */
	public Accidente(int identificador, int rutCliente, String dia, String hora, String lugar, String origen,
			String consecuencias) {
		this.identificador = identificador;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
	}

	/**
	 * Devuelve un número indentificativo asignado al accidente.
	 * 
	 * @return Un número que representa el número identificador.
	 */
	public int getIdentificador() {
		return identificador;
	}

	/**
	 * Devuelve el rut del cliente.
	 * 
	 * @return Un número que representa el rut del cliente.
	 */
	public int getRutCliente() {
		return rutCliente;
	}

	/**
	 * Devuelve el día en el que ocurrió el accidente.
	 * 
	 * @return Una cadena que representa el día en el que ocurrió el accidente.
	 */
	public String getDia() {
		return dia;
	}

	/**
	 * Devuelve la hora en la que ocurrió el accidente.
	 * 
	 * @return Una cadena que representa la hora en la que ocurrió el accidente.
	 */
	public String getHora() {
		return hora;
	}

	/**
	 * Devuelve el lugar en el que ocurrió el accidente.
	 * 
	 * @return Una cadena que representa el lugar en el que ocurrió el accidente.
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * Devuelve el origen del accidente.
	 * 
	 * @return Una cadena que representa el origen del accidente.
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * Devuelve las consecuencias del accidente.
	 * 
	 * @return Una cadena que representa las consecuencias del accidente.
	 */
	public String getConsecuencias() {
		return consecuencias;
	}

	/**
	 * Establece el identificador del accidente.
	 * 
	 * @param identificador Un número que contiende el identificador del accidente.
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	/**
	 * Establece el rut del cliente.
	 * 
	 * @param rutCliente Un número que contiene el rut del cliente que sufrió el
	 *                   accidente.
	 */
	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	/**
	 * Establece el día en el que ocurrió el accidente.
	 * 
	 * @param dia Una cadena que contiene el día en el que ocurrió el accidente.
	 */
	public void setDia(String dia) {
		this.dia = dia;
	}

	/**
	 * Establece la hora en la que ocurrió el accidente.
	 * 
	 * @param hora Una cadena que contiene la hora en la que ocurrió el accidente.
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}

	/**
	 * Establece el lugar en el que ocurrió el accidente.
	 * 
	 * @param lugar Una cadena que contiene el lugar en el que ocurrió el accidente.
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/**
	 * Establece el origen del accidente.
	 * 
	 * @param origen Una cadena que contiene el origen del accidente.
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * Establece las consecuencias del accidente.
	 * 
	 * @param consecuencias Una cadena que contiene las consecuencias del accidente.
	 */
	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}

	/**
	 * Muestra por consola los detalles del accidente.
	 */
	public void mostrarDetalle() {
		System.out.println("El accidente ocurrió en " + lugar + " a las " + hora + " del día " + dia
				+ ", y tuvo como origen " + origen);
	}

	/**
	 * Devuelve su representación mediante una cadena del objeto Accidente.
	 * 
	 * @return Una cadena de texto que representa el objeto Accidente y sus
	 *         atributos.
	 */
	@Override
	public String toString() {
		return "Accidente{" + "identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia='" + dia + '\''
				+ ", hora='" + hora + '\'' + ", lugar='" + lugar + '\'' + ", origen='" + origen + '\''
				+ ", consecuencias='" + consecuencias + '\'' + '}';
	}
}
