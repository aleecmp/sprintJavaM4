package cl.awakelab.sprintfinalm4;

/**
 * Clase que representa un Profesional que hereda de la clase Usuario. Posee su
 * constructor, metodos get y set, metodos para mostrar sus datos y los datos
 * heredados de Usuario.
 * 
 * @author Alexis Campusano
 * @author Fernanda Fajre
 * @author Christopher Figueroa
 * @author Carlos Torres
 *
 */
public class Profesional extends Usuario {
	/**
	 * Titulo del profesional.
	 */
	private String titulo;
	/**
	 * Fecha de ingreso al trabajo del Profesional.
	 */
	private String fechaIngreso;

	/**
	 * Constructor sin parámetros de profesional.
	 */
	public Profesional() {
		super();
	}

	/**
	 * Constructor con parámetros para crear una instancia de Profesional.
	 *
	 * @param nombre          El nombre del profesional.
	 * @param fechaNacimiento La fecha de nacimiento del profesional.
	 * @param run             El RUN del profesional.
	 * @param titulo          El título del profesional.
	 * @param fechaIngreso    La fecha de ingreso del profesional al trabajo.
	 */
	public Profesional(String nombre, String fechaNacimiento, int run, String titulo, String fechaIngreso) {
		super(nombre, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * Obtiene el título del profesional.
	 *
	 * @return el título del profesional
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Establece el título del profesional.
	 *
	 * @param titulo el nuevo título del profesional
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Obtiene la fecha de ingreso del profesional.
	 *
	 * @return la fecha de ingreso del profesional
	 */
	public String getFechaIngreso() {
		return fechaIngreso;
	}

	/**
	 * Establece la fecha de ingreso del profesional.
	 *
	 * @param fechaIngreso la nueva fecha de ingreso del profesional
	 */
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * Muestra los detalles del usuario-profesional, su nombre, su run, su titulo y
	 * su fecha de ingreso.
	 */
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Título: " + titulo);
		System.out.println("Fecha de ingreso: " + fechaIngreso);
	}

	/**
	 * Muestra los detalles del usuario-administrativo: titulo y fecha de ingreso.
	 * Sobreescribe el metodo heredado de Usuario.
	 * 
	 * @return una cadena de texto con los detalles del profesional.
	 */
	@Override
	public String toString() {
		return "Profesional titulo: " + titulo + ", fechaIngreso: " + fechaIngreso;
	}

	/**
	 * Muestra los detalles heredados de usuario: nombre, fecha de nacimiento y run.
	 * 
	 * @return una cadena de texto con los detalles del usuario.
	 */
	public String getInformacionUsuario() {
		return super.toString();
	}

}