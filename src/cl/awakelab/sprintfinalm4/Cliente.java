package cl.awakelab.sprintfinalm4;

import java.time.LocalDate;

public class Cliente extends Usuario {

	private String telefono;
	private String afp;
	private int sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;

	public Cliente() {
		super();
	}

	public Cliente(String nombre, LocalDate fechaNacimiento, int run, String telefono, String afp, int sistemaSalud, String direccion, String comuna, int edad) {
		super(nombre, fechaNacimiento, run);
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public int getSistemaSalud() {
		return sistemaSalud;
	}

	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Teléfono: " + telefono);
		System.out.println("AFP: " + afp);
		System.out.println("Sistema de Salud: " + sistemaSalud);
		System.out.println("Dirección: " + direccion);
		System.out.println("Comuna: " + comuna);
		System.out.println("Edad: " + edad);
	}

	@Override
	public String toString() {
		return "Cliente telefono: " + telefono + ", afp: " + afp + ", sistemaSalud: " + sistemaSalud + ", direccion: "
				+ direccion + ", comuna: " + comuna + ", edad: " + edad;
	}
	
	public String obtenerNombre() {
		return "El cliente se llama" + getNombre();
	}
	
	public String obtenerSistemaSalud() {
		if (sistemaSalud == 1) {
			return "Fonasa";
		} else if (sistemaSalud == 2) {
			return "Isapre";
		} else {
			return "Sistema de salud desconocido";
		}
	}

}
