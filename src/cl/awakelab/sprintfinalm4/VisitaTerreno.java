package cl.awakelab.sprintfinalm4;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa una visita en terreno realizada en el programa.
 * 
 * Una visita en terreno tiene un identificador, un RUT de cliente, un día, una
 * hora, un lugar, comentarios y una lista de revisiones asociadas.
 * 
 * @author Alexis Campusano
 * @author Fernanda Fajre
 * @author Christopher Figueroa
 * @author Carlos Torres
 *
 */
public class VisitaTerreno {
	/**
	 * El identificador de la visita en terreno
	 */
	private int idVisitaTerreno;
	/**
	 * El RUT del cliente asociado a la visita
	 */
	private int rutCliente;
	/**
	 * El día de la visita
	 */
	private String dia;
	/**
	 * La hora de la visita
	 */
	private String hora;
	/**
	 * El lugar de la visita
	 */
	private String lugar;
	/**
	 * Los comentarios de la visita
	 */
	private String comentarios;
	/**
	 * Lista de revisiones
	 */
	private List<Revision> revisiones;

	/**
	 * Crea una nueva instancia de la clase VisitaTerreno sin valores iniciales.
	 */
	public VisitaTerreno() {
		revisiones = new ArrayList<>();
	}

	/**
	 * Crea una nueva instancia de la clase VisitaTerreno con los valores
	 * especificados.
	 * 
	 * @param idVisitaTerreno El identificador de la visita en terreno.
	 * @param rutCliente      El RUT del cliente asociado a la visita.
	 * @param dia             El día de la visita.
	 * @param hora            La hora de la visita.
	 * @param lugar           El lugar de la visita.
	 * @param comentarios     Los comentarios de la visita.
	 */
	public VisitaTerreno(int idVisitaTerreno, int rutCliente, String dia, String hora, String lugar,
			String comentarios) {
		this.idVisitaTerreno = idVisitaTerreno;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
		revisiones = new ArrayList<>();
	}

	/**
	 * Obtiene el identificador de la visita en terreno.
	 * 
	 * @return el identificador de la visita en terreno
	 */
	public int getIdentificador() {
		return idVisitaTerreno;
	}

	/**
	 * Establece el identificador de la visita en terreno.
	 * 
	 * @param idVisitaTerreno el identificador de la visita en terreno a establecer
	 */
	public void setIdentificador(int idVisitaTerreno) {
		this.idVisitaTerreno = idVisitaTerreno;
	}

	/**
	 * Obtiene el RUT del cliente asociado a la visita en terreno.
	 * 
	 * @return el RUT del cliente
	 */
	public int getRutCliente() {
		return rutCliente;
	}

	/**
	 * Establece el RUT del cliente asociado a la visita en terreno.
	 * 
	 * @param rutCliente el RUT del cliente a establecer
	 */
	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	/**
	 * Obtiene el día de la visita en terreno.
	 * 
	 * @return el día de la visita
	 */
	public String getDia() {
		return dia;
	}

	/**
	 * Establece el día de la visita en terreno.
	 * 
	 * @param dia el día de la visita a establecer
	 */
	public void setDia(String dia) {
		this.dia = dia;
	}

	/**
	 * Obtiene la hora de la visita en terreno.
	 * 
	 * @return la hora de la visita
	 */
	public String getHora() {
		return hora;
	}

	/**
	 * Establece la hora de la visita en terreno.
	 * 
	 * @param hora la hora de la visita a establecer
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}

	/**
	 * Obtiene el lugar de la visita en terreno.
	 * 
	 * @return el lugar de la visita
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * Establece el lugar de la visita en terreno.
	 * 
	 * @param lugar el lugar de la visita a establecer
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/**
	 * Obtiene los comentarios de la visita en terreno.
	 * 
	 * @return los comentarios de la visita
	 */
	public String getComentarios() {
		return comentarios;
	}

	/**
	 * Establece los comentarios de la visita en terreno.
	 * 
	 * @param comentarios los comentarios de la visita a establecer
	 */
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	/**
	 * Obtiene la lista de revisiones asociadas a la visita en terreno.
	 * 
	 * @return la lista de revisiones de la visita
	 */
	public List<Revision> getRevisiones() {
		return revisiones;
	}

	/**
	 * Establece la lista de revisiones asociadas a la visita en terreno.
	 * 
	 * @param revisiones la lista de revisiones de la visita a establecer
	 */
	public void setRevisiones(List<Revision> revisiones) {
		this.revisiones = revisiones;
	}

	/**
	 * Agrega una revisión a la visita en terreno.
	 * 
	 * @param revision la revisión a agregar
	 */
	public void agregarRevision(Revision revision) {
		revisiones.add(revision);
	}

	/**
	 * Devuelve una representación en forma de cadena de la visita en terreno.
	 * 
	 * @return la representación en forma de cadena de la visita en terreno
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Identificador visita a terreno: ").append(idVisitaTerreno).append("\n");
		builder.append("RUT Cliente: ").append(rutCliente).append("\n");
		builder.append("Día: ").append(dia).append("\n");
		builder.append("Hora: ").append(hora).append("\n");
		builder.append("Lugar: ").append(lugar).append("\n");
		builder.append("Comentarios: ").append(comentarios).append("\n");

		if (!revisiones.isEmpty()) {
			builder.append("Revisiones: \n");
			for (Revision revision : revisiones) {
				builder.append(revision);
			}
		}

		return builder.toString();
	}
}
