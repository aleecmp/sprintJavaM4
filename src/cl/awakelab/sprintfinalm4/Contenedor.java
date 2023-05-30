package cl.awakelab.sprintfinalm4;

import java.util.ArrayList;

import java.util.List;

/**
 * La clase Contenedor permite crear dos tipos de listas para almacenar los
 * datos ingresados. Una Lista asesorias donde se ingresan tres tipos de
 * usuarios: cliente, profesional y administrativo. Y una lista donde se
 * almacenan las capacitaciones. Posee metodos para eliminar usuarios, mostrar
 * usuarios, mostrar usuarios por tipo y mostrar capacitaciones.
 * 
 * @author Alexis Campusano
 * @author Fernanda Fajre
 * @author Christopher Figueroa
 * @author Carlos Torres
 *
 *
 */

public class Contenedor {
	/**
	 * Lista de asesorias (usuarios)
	 */
	private List<IAsesoria> asesorias;
	/**
	 * Lista de capacitaciones
	 */
	private List<Capacitacion> capacitaciones;

	/**
	 * Crea un nuevo objeto Contenedor inicializando las listas de asesorías y
	 * capacitaciones.
	 */
	public Contenedor() {
		asesorias = new ArrayList<>();
		capacitaciones = new ArrayList<>();
	}

	/**
	 * Almacena un objeto Cliente en la lista de asesorías.
	 *
	 * @param cliente el cliente a almacenar
	 */
	public void almacenarCliente(Cliente cliente) {
		asesorias.add(cliente);
	}

	/**
	 * Almacena un objeto Profesional en la lista de asesorías.
	 *
	 * @param profesional el profesional a almacenar
	 */
	public void almacenarProfesional(Profesional profesional) {
		asesorias.add(profesional);
	}

	/**
	 * Almacena un objeto Administrativo en la lista de asesorías.
	 *
	 * @param administrativo el administrativo a almacenar
	 */
	public void almacenarAdministrativo(Administrativo administrativo) {
		asesorias.add(administrativo);
	}

	/**
	 * Almacena una capacitación en la lista de capacitaciones.
	 *
	 * @param capacitacion la capacitación a almacenar
	 */
	public void almacenarCapacitacion(Capacitacion capacitacion) {
		capacitaciones.add(capacitacion);
	}

	/**
	 * Elimina un usuario de la lista de asesorías según su RUN.
	 *
	 * @param run el RUN del usuario a eliminar
	 */
	public void eliminarUsuario(int run) {
		for (IAsesoria asesoria : asesorias) {
			if (((Usuario) asesoria).getRun() == run) {
				asesorias.remove(asesoria);
				System.out.println("El run: " + run + " ha sido eliminado exitosamente.");
				break;
			} else {
				System.out.println("El run ingresado no existe.");
			}
		}
	}

	/**
	 * Lista todos los usuarios registradosy su informacion (nombre, fecha de
	 * nacimiento y run). Si no hay usuarios registrados, muestra un mensaje
	 * indicando que no hay usuarios.
	 */
	public void listarUsuarios() {
		if (asesorias.isEmpty()) {
			System.out.println("No hay usuarios registrados.");
		} else {
			for (IAsesoria asesoria : asesorias) {
				if (asesoria.getClass().getSimpleName().equalsIgnoreCase("cliente")) {
					System.out.println(((Cliente) asesoria).getInformacionUsuario());
				}
				if (asesoria.getClass().getSimpleName().equalsIgnoreCase("profesional")) {
					System.out.println(((Profesional) asesoria).getInformacionUsuario());
				}
				if (asesoria.getClass().getSimpleName().equalsIgnoreCase("Administrativo")) {
					System.out.println(((Administrativo) asesoria).getInformacionUsuario());
				}
			}
		}
	}

	/**
	 * Lista los usuarios por tipo. Si no hay usuarios registrados o no se encuentra
	 * ningún usuario del tipo especificado, muestra un mensaje indicando que no hay
	 * usuarios del tipo especificado.
	 *
	 * @param tipo el tipo de usuario a listar
	 */
	public void listarUsuariosPorTipo(String tipo) {
		int contador = 0;
		if (asesorias.isEmpty()) {
			System.out.println("No hay usuarios registrados.");
		} else {
			for (IAsesoria asesoria : asesorias) {
				if (asesoria.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
					System.out.println(asesoria);
					contador = contador + 1;
				}
			}
			if (contador == 0) {
				System.out.println("No hay usuario del tipo: " + tipo);
			}
		}
	}

	/**
	 * Lista todas las capacitaciones registradas junto con la información del
	 * cliente asociado. Si no hay capacitaciones registradas, muestra un mensaje
	 * indicando que no hay capacitaciones.
	 */
	public void listarCapacitaciones() {
		if (capacitaciones.isEmpty()) {
			System.out.println("No hay capacitaciones registradas.");
		} else {
			for (Capacitacion capacitacion : capacitaciones) {
				System.out.println(capacitacion);
				for (IAsesoria asesoria : asesorias) {
					if (asesoria.getClass().getSimpleName().equalsIgnoreCase("Cliente")
							&& ((Cliente) asesoria).getRun() == capacitacion.getRutCliente()) {
						System.out.println("Datos del cliente asociado:");
						System.out.println(asesoria);
						break;
					}
				}

			}
		}
	}

}
