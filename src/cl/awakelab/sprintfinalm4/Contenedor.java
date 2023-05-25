package cl.awakelab.sprintfinalm4;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Contenedor {
	private List<IAsesoria> asesorias;
	private List<Capacitacion> capacitaciones;

	Scanner sc = new Scanner(System.in);

	public Contenedor() {
		asesorias = new ArrayList<>();
		capacitaciones = new ArrayList<>();
	}

	public void almacenarCliente(Cliente cliente) {
		asesorias.add(cliente);
	}

	public void almacenarProfesional(Profesional profesional) {
		asesorias.add(profesional);
	}

	public void almacenarAdministrativo(Administrativo administrativo) {
		asesorias.add(administrativo);
	}

	public void almacenarCapacitacion(Capacitacion capacitacion) {
		capacitaciones.add(capacitacion);
	}

	public void eliminarUsuario(int run) {
		for (IAsesoria asesoria : asesorias) {
			if (((Usuario) asesoria).getRun() == run) {
				asesorias.remove(asesoria);
				break;
			}
		}
	}

//	public void listarUsuarios() {
//		for (IAsesoria asesoria : asesorias) {
//			System.out.println((Usuario) asesorias.super.toString());
//	}

	

	public void listarUsuariosPorTipo(String tipo) {
		for (IAsesoria asesoria : asesorias) {
			if (asesoria.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
				System.out.println(asesoria);
			}
		}
	}

	public void listarCapacitaciones() {
		for (Capacitacion capacitacion : capacitaciones) {
			System.out.println(capacitacion);
			// Mostrar datos del cliente asociado a la capacitación
			for (IAsesoria asesoria : asesorias) {
				if (asesoria.getClass().getSimpleName().equalsIgnoreCase("Cliente")
						&& ((Cliente) asesoria).getRun() == capacitacion.getRutCliente()) {
					System.out.println("Datos del cliente asociado:");
					System.out.println(asesoria);
					break;
				}
			}
			System.out.println();
		}
	}


}
