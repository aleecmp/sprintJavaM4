package cl.awakelab.sprintfinalm4;

import java.time.LocalDate;

public class Usuario implements IAsesoria {

	private String nombre;
	private LocalDate fechaNacimiento;
	private int run;


	// Constructor sin parámetros
	public Usuario() {

	}

	// Constructor con parametros
	public Usuario(String nombre, LocalDate fechaNacimiento, int run) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public String mostrarEdad() {
		LocalDate fechaActual = LocalDate.now();
		int edad = fechaActual.minusYears(fechaNacimiento.getYear()).getYear();

		return nombre + " tiene " + edad + " años";

	}

	public void analizarUsuario() {
		System.out.println("Nombre de usuario: " + nombre);
		System.out.println("Su run es: " + run);

	}

	@Override
	public String toString() {
		return "Usuario nombre: " + nombre + ", fechaNacimiento: " + fechaNacimiento + ", run: " + run;
	}

}
