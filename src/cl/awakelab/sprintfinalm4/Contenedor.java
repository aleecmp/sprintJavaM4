package cl.awakelab.sprintfinalm4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Contenedor {
	private List<IAsesoria> asesorias;
	private List<Capacitacion> capacitaciones;

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

//    public void eliminarUsuario(int run) {
//        for (IAsesoria asesoria : asesorias) {
//            if (asesoria.getRun() == run) {
//                asesorias.remove(asesoria);
//                break;
//            }
//        }
//    }
	

	public void eliminarUsuario(int run) {
		Iterator<IAsesoria> iterator = asesorias.iterator();
		while (iterator.hasNext()) {
			IAsesoria asesoria = iterator.next();
			if (asesoria instanceof Usuario && ((Usuario) asesoria).getRun() == run) {
				iterator.remove();
				break;
			}
		}
	}

	public void listarUsuarios() {
		for (IAsesoria asesoria : asesorias) {
			System.out.println(asesoria);
		}
	}

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

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Contenedor contenedor = new Contenedor();

		// Ejemplo de uso de los métodos de la clase Contenedor
		Cliente cliente = new Cliente();
		cliente.setRun(12345678);
		cliente.setNombre("Juan");
		cliente.setTelefono("123456789");
		cliente.setAfp("AFP Provida");
		cliente.setSistemaSalud(1);
		cliente.setDireccion("Calle 123");
		cliente.setComuna("Santiago");
		contenedor.almacenarCliente(cliente);

		Profesional profesional = new Profesional();
		profesional.setNombre("María");
		profesional.setFechaNacimiento("01/01/1990");
		profesional.setRun(98765432);
		profesional.setTitulo("Ingeniera");
		profesional.setFechaIngreso("01/01/2020");
		contenedor.almacenarProfesional(profesional);

		Administrativo administrativo = new Administrativo();
		administrativo.setNombre("Pedro");
		administrativo.setFechaNacimiento("01/01/1995");
		administrativo.setRun(13579246);
		administrativo.setArea("Recursos Humanos");
		administrativo.setExperienciaPrevia("3 años en administración");
		contenedor.almacenarAdministrativo(administrativo);

		contenedor.listarUsuarios();

		Capacitacion capacitacion = new Capacitacion();
		capacitacion.setIdentificador(1);
		capacitacion.setRutCliente(12345678);
		capacitacion.setDia("Lunes");
		capacitacion.setHora("09:00");
		capacitacion.setLugar("Oficina Central");
		capacitacion.setDuracion("120 minutos");
		capacitacion.setCantidadAsistentes(50);
		contenedor.almacenarCapacitacion(capacitacion);

		contenedor.listarCapacitaciones();

		System.out.print("Ingrese el RUN del usuario a eliminar: ");
		int runEliminar = scanner.nextInt();
		contenedor.eliminarUsuario(runEliminar);

		contenedor.listarUsuarios();
	}
}
