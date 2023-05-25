package cl.awakelab.sprintfinalm4;


import java.text.SimpleDateFormat;

import java.time.LocalTime;

public class Capacitacion {

	private int identificador;
	private int rutCliente;
	private String dia;
	private LocalTime hora;
	private String lugar;
	private int duracion;
	private int cantidadAsistentes;

	public Capacitacion() {

	}

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

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public int getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

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

	@Override
	public String toString() {
		return "Capacitacion " + "identificador: " + identificador + ", rutCliente: " + rutCliente + ", dia: " + dia
				+ ", hora: '" + hora + '\'' + ", lugar: '" + lugar + '\'' + ", duracion: " + duracion
				+ ", cantidadAsistentes: " + cantidadAsistentes;
	}
}
