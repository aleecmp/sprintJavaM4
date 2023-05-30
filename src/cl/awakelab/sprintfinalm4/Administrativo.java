package cl.awakelab.sprintfinalm4;

/**
 * Clase que representa un Administrativo que hereda de la clase Usuario. Posee
 * su constructor, metodos get y set, metodos para mostrar sus datos y los datos
 * heredados de Usuario.
 *
 * @author Alexis Campusano
 * @author Fernanda Fajre
 * @author Christopher Figueroa
 * @author Carlos Torres
 * 
 */

public class Administrativo extends Usuario {

	/**
	 * Area en donde trabaja el administrativo.
	 */
	private String area;
	/**
	 * Experiencia previa de trabajo del administrativo.
	 */
	private String experienciaPrevia;

	/**
	 * Constructor sin parametros de administrativo.
	 */
	public Administrativo() {
		super();
	}

	/**
	 * Constructor con parametros para crear una instancia de Administrativo.
	 *
	 * @param nombre            El nombre del administrativo.
	 * @param fechaNacimiento   La fecha de nacimiento del administrativo.
	 * @param run               El RUN del administrativo.
	 * @param area              El área de trabajo del administrativo.
	 * @param experienciaPrevia La experiencia previa del administrativo.
	 */
	public Administrativo(String nombre, String fechaNacimiento, int run, String area, String experienciaPrevia) {
		super(nombre, fechaNacimiento, run);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

	/**
	 * Obtiene el área de trabajo del administrativo.
	 *
	 * @return el área de trabajo del administrativo
	 */
	public String getArea() {
		return area;
	}

	/**
	 * Establece el área de trabajo del administrativo.
	 *
	 * @param area el nuevo área de trabajo del administrativo
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * Obtiene la experiencia previa del administrativo.
	 *
	 * @return la experiencia previa del administrativo
	 */
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	/**
	 * Establece la experiencia previa del administrativo.
	 *
	 * @param experienciaPrevia la nueva experiencia previa del administrativo
	 */
	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	/**
	 * Muestra los detalles del usuario-administrativo, su nombre, su run, su area y
	 * su experiencia previa en cadenas de texto
	 */
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Área: " + area);
		System.out.println("Experiencia previa: " + experienciaPrevia);
	}

	/**
	 * Muestra los detalles del usuario-administrativo: area y experiencia previa.
	 * Sobreescribe el metodo heredado de Usuario.
	 * 
	 * @return una cadena de texto con los detalles del administrativo.
	 */
	@Override
	public String toString() {
		return "Administrativo area: " + area + ", experienciaPrevia: " + experienciaPrevia;
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
