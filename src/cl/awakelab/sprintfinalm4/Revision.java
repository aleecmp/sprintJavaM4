package cl.awakelab.sprintfinalm4;

/**
 * Esta clase representa una revisión realizada en el programa.
 * 
 * Una revisión tiene un identificador, un ID de visita en terreno, un nombre
 * alusivo, un detalle a revisar y un estado.
 * 
 * @author Alexis Campusano
 * @author Fernanda Fajre
 * @author Christopher Figueroa
 * @author Carlos Torres
 *
 */

public class Revision {
	/**
	 * Identificador de la revisión, es un numero entero.
	 */
	private int identificador;
	/**
	 * Identificador de la visita a terreno correspondiente, es un numero entero.
	 */
	private int idVisitaTerreno;
	/**
	 * Nombre dado a la revisión.
	 */
	private String nombreAlusivo;
	/**
	 * Informacion a revisar en la revisión.
	 */
	private String detalleRevisar;
	/**
	 * Estado de la revisión.
	 */
	private int estado;

	/**
	 * Constructor vacío para la clase Revision.
	 */
	public Revision() {
	}

	/**
	 * Crea una nueva instancia de la clase Revision con los valores especificados.
	 * 
	 * @param identificador   El identificador de la revisión.
	 * @param idVisitaTerreno El ID de la visita en terreno asociada a la revisión.
	 * @param nombreAlusivo   El nombre alusivo de la revisión.
	 * @param detalleRevisar  El detalle a revisar de la revisión.
	 * @param estado          El estado de la revisión.
	 */
	public Revision(int identificador, int idVisitaTerreno, String nombreAlusivo, String detalleRevisar, int estado) {
		this.identificador = identificador;
		this.idVisitaTerreno = idVisitaTerreno;
		this.nombreAlusivo = nombreAlusivo;
		this.detalleRevisar = detalleRevisar;
		this.estado = estado;
	}

	/**
	 * Obtiene el identificador de la revisión.
	 * 
	 * @return el identificador de la revisión
	 */
	public int getIdentificador() {
		return identificador;
	}

	/**
	 * Establece el identificador de la revisión.
	 * 
	 * @param identificador el identificador de la revisión a establecer
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	/**
	 * Obtiene el ID de la visita en terreno asociada a la revisión.
	 * 
	 * @return el ID de la visita en terreno
	 */
	public int getIdVisitaTerreno() {
		return idVisitaTerreno;
	}

	/**
	 * Establece el ID de la visita en terreno asociada a la revisión.
	 * 
	 * @param idVisitaTerreno el ID de la visita en terreno a establecer
	 */
	public void setIdVisitaTerreno(int idVisitaTerreno) {
		this.idVisitaTerreno = idVisitaTerreno;
	}

	/**
	 * Obtiene el nombre alusivo de la revisión.
	 * 
	 * @return el nombre alusivo de la revisión
	 */
	public String getNombreAlusivo() {
		return nombreAlusivo;
	}

	/**
	 * Establece el nombre alusivo de la revisión.
	 * 
	 * @param nombreAlusivo el nombre alusivo de la revisión a establecer
	 */
	public void setNombreAlusivo(String nombreAlusivo) {
		this.nombreAlusivo = nombreAlusivo;
	}

	/**
	 * Obtiene el detalle a revisar de la revisión.
	 * 
	 * @return el detalle a revisar de la revisión
	 */
	public String getDetalleRevisar() {
		return detalleRevisar;
	}

	/**
	 * Establece el detalle a revisar de la revisión.
	 * 
	 * @param detalleRevisar el detalle a revisar de la revisión a establecer
	 */
	public void setDetalleRevisar(String detalleRevisar) {
		this.detalleRevisar = detalleRevisar;
	}

	/**
	 * Obtiene el estado de la revisión.
	 * 
	 * @return el estado de la revisión
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * Establece el estado de la revisión.
	 * 
	 * @param estado el estado de la revisión a establecer
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

	/**
	 * Devuelve una representación en forma de cadena de la revisión.
	 * 
	 * @return la representación en forma de cadena de la revisión
	 */
	@Override
	public String toString() {
		return "Identificador: " + identificador + "\n" + "ID Visita en Terreno: " + idVisitaTerreno + "\n"
				+ "Nombre alusivo: " + nombreAlusivo + "\n" + "Detalle a revisar: " + detalleRevisar + "\n" + "Estado: "
				+ getEstadoString() + "\n";
	}

	/**
	 * Obtiene el estado de la revisión en forma de cadena.
	 * 
	 * @return el estado de la revisión en forma de cadena
	 */
	public String getEstadoString() {
		switch (estado) {
		case 1:
			return "Sin problemas";
		case 2:
			return "Con observaciones";
		case 3:
			return "No aprueba";
		default:
			return "Desconocido";
		}
	}
}