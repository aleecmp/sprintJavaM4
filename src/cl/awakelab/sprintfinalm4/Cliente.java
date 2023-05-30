package cl.awakelab.sprintfinalm4;

/**
 * Esta clase representa a un Cliente, que es un tipo de Usuario.
 * 
 * Esta clase hereda de la clase Usuario y agrega propiedades y métodos
 * específicos para un Cliente.
 * 
 * @author Alexis Campusano
 * @author Fernanda Fajre
 * @author Christopher Figueroa
 * @author Carlos Torres
 *
 */
public class Cliente extends Usuario {
	/**
	 * Número de teléfono del cliente.
	 */
	private String telefono;
	/**
	 * AFP del cliente.
	 */
	private String afp;
	/**
	 * Sistema de salud del cliente.
	 */
	private int sistemaSalud;
	/**
	 * Dirección del cliente.
	 */
	private String direccion;
	/**
	 * Comuna del cliente.
	 */
	private String comuna;
	/**
	 * Edad del cliente.
	 */
	private int edad;

	/**
	 * Constructor sin parámetros de la clase Cliente.
	 */
	public Cliente() {
		super();
	}

	/**
	 * /** Crea una instancia de Cliente con los valores proporcionados para las
	 * propiedades.
	 *
	 * @param nombre          El nombre del cliente.
	 * @param fechaNacimiento La fecha de nacimiento del cliente.
	 * @param run             El RUN del cliente.
	 * @param telefono        El número de teléfono del cliente.
	 * @param afp             La AFP del cliente.
	 * @param sistemaSalud    El sistema de salud del cliente.
	 * @param direccion       La dirección del cliente.
	 * @param comuna          La comuna del cliente.
	 * @param edad            La edad del cliente.
	 */
	public Cliente(String nombre, String fechaNacimiento, int run, String telefono, String afp, int sistemaSalud,
			String direccion, String comuna, int edad) {
		super(nombre, fechaNacimiento, run);
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	/**
	 * Obtiene el número de teléfono del cliente.
	 * 
	 * @return Número de teléfono del cliente.
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Establece el número de teléfono del cliente.
	 * 
	 * @param telefono Número de teléfono del cliente.
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Obtiene la AFP del cliente.
	 * 
	 * @return AFP del cliente.
	 */
	public String getAfp() {
		return afp;
	}

	/**
	 * Establece la AFP del cliente.
	 * 
	 * @param afp AFP del cliente.
	 */
	public void setAfp(String afp) {
		this.afp = afp;
	}

	/**
	 * Obtiene el sistema de salud del cliente.
	 * 
	 * @return Sistema de salud del cliente.
	 */
	public int getSistemaSalud() {
		return sistemaSalud;
	}

	/**
	 * Establece el sistema de salud del cliente.
	 * 
	 * @param sistemaSalud Sistema de salud del cliente.
	 */
	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	/**
	 * Obtiene la dirección del cliente.
	 * 
	 * @return Dirección del cliente.
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Establece la dirección del cliente.
	 * 
	 * @param direccion Dirección del cliente.
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Obtiene la comuna del cliente.
	 * 
	 * @return Comuna del cliente.
	 */
	public String getComuna() {
		return comuna;
	}

	/**
	 * Establece la comuna del cliente.
	 * 
	 * @param comuna Comuna del cliente.
	 */
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	/**
	 * Obtiene la edad del cliente.
	 * 
	 * @return Edad del cliente.
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Establece la edad del cliente.
	 * 
	 * @param edad Edad del cliente.
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Realiza un análisis del cliente, mostrando su información básica y adicional.
	 */
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Dirección: " + direccion);
		System.out.println("Comuna: " + comuna);
	}

	/**
	 * Devuelve una representación en formato de cadena de texto del cliente.
	 * 
	 * @return Representación en formato de cadena de texto del cliente.
	 */
	@Override
	public String toString() {
		return "Cliente telefono: " + telefono + ", afp: " + afp + ", sistemaSalud: " + sistemaSalud + ", direccion: "
				+ direccion + ", comuna: " + comuna + ", edad: " + edad;
	}

	/**
	 * Obtiene el nombre del cliente en una frase.
	 * 
	 * @return Nombre del cliente en una frase.
	 */
	public String obtenerNombre() {
		return "El cliente se llama" + getNombre();
	}

	/**
	 * Obtiene el nombre del sistema de salud del cliente.
	 * 
	 * @return Nombre del sistema de salud del cliente.
	 */
	public String obtenerSistemaSalud() {
		if (sistemaSalud == 1) {
			return "Fonasa";
		} else if (sistemaSalud == 2) {
			return "Isapre";
		} else {
			return "Sistema de salud desconocido";
		}
	}

	/**
	 * Obtiene la información del usuario, incluyendo su nombre, fecha de nacimiento
	 * y RUN.
	 * 
	 * @return Información del usuario.
	 */
	public String getInformacionUsuario() {
		return super.toString();
	}

}
