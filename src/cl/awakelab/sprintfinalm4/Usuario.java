package cl.awakelab.sprintfinalm4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Clase Usuario base que implementa de la interfaz IAsesoria con su
 * constructor, metodos Get y set, metodos para mostrar la edad del usuario y
 * sus datos.
 * 
 * @author Alexis Campusano
 * @author Fernanda Fajre
 * @author Christopher Figueroa
 * @author Carlos Torres
 *
 */
public class Usuario implements IAsesoria {
	/**
	 * Nombre del usuario, por ejemplo: "Luis"
	 */
	private String nombre;
	/**
	 * Fecha de nacimiento del usuario, por ejemplo: "02/04/1980"
	 */
	private String fechaNacimiento;
	/**
	 * Run del usuario, por ejemplo: "13.567.833-6"
	 */
	private int run;

	/**
	 * Constructor sin parametros para crear una instancia de Usuario
	 */
	public Usuario() {
	}

	/**
	 * Constructor para crear una instancia de Usuario.
	 *
	 * @param nombre          el nombre del usuario.
	 * @param fechaNacimiento la fecha de nacimiento del usuario en formato
	 *                        "dd/MM/yyyy".
	 * @param run             el RUN del usuario.
	 */
	public Usuario(String nombre, String fechaNacimiento, int run) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}

	/**
	 * Obtiene el nombre del usuario.
	 *
	 * @return el nombre del usuario
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del usuario.
	 *
	 * @param nombre el nuevo nombre del usuario
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene la fecha de nacimiento del usuario.
	 *
	 * @return la fecha de nacimiento del usuario
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Establece la fecha de nacimiento del usuario.
	 *
	 * @param fechaNacimiento la nueva fecha de nacimiento del usuario
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Obtiene el RUN (Rol Único Nacional) del usuario.
	 *
	 * @return el RUN del usuario
	 */
	public int getRun() {
		return run;
	}

	/**
	 * Establece el RUN (Rol Único Nacional) del usuario.
	 *
	 * @param run el nuevo RUN del usuario
	 */
	public void setRun(int run) {
		this.run = run;
	}

	/**
	 * Muestra la edad del usuario calculada con su fecha de macimiento
	 * 
	 * @return una cadena de texto con la edad en años del usuario
	 */
	public String mostrarEdad() {
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNacimientoFormat = LocalDate.parse(fechaNacimiento, formatoFecha);
		LocalDate fechaActual = LocalDate.now();
		int edad = fechaActual.minusYears(fechaNacimientoFormat.getYear()).getYear();

		return nombre + " tiene " + edad + " años";

	}

	/**
	 * Muestra los detalles del usuario, su nombre y su run, en cadenas de texto
	 */
	public void analizarUsuario() {
		System.out.println("Nombre de usuario: " + nombre);
		System.out.println("Su run es: " + run);

	}

	/**
	 * Muestra los detalles del usuario: nombre, fecha de nacimiento y run.
	 * 
	 * @return una cadena de texto con los detalles del usuario
	 */
	@Override
	public String toString() {
		return "Usuario nombre: " + nombre + ", fechaNacimiento: " + fechaNacimiento + ", run: " + run;
	}

}
