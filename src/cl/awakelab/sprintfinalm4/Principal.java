package cl.awakelab.sprintfinalm4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String patron = "HH:mm";
		DateTimeFormatter formato = DateTimeFormatter.ofPattern(patron);

		Contenedor contenedor = new Contenedor();

		int opcion;

		do {

			System.out.println("Indique el número de la acción a realizar:");
			System.out.println("1. Almacenar Cliente");
			System.out.println("2. Almacenar Profesional");
			System.out.println("3. Almacenar Administrativo");
			System.out.println("4. Almacenar Capacitación");
			System.out.println("5. Eliminar Usuario");
			System.out.println("6. Listar Usuarios");
			System.out.println("7. Listar Usuarios por tipo");
			System.out.println("8. Listar Capacitaciones");
			System.out.println("9. Salir del programa");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1: {
				Cliente cliente = new Cliente();
				System.out.println("Ingrese el nombre del cliente:");

				String nombre = sc.nextLine();
				while (nombre.length() < 10 || nombre.length() > 50 || nombre == null) {
					System.out.println("Este campo no puede estar vacío y debe contener entre 10 y 50 caracteres.");
					nombre = sc.nextLine();
				}
				cliente.setNombre(nombre);

				System.out.println("Ingrese la fecha de nacimiento (dd/mm/aaaa):");
				String fechaNacimiento = sc.nextLine();
				while (fechaNacimiento == null) {
					System.out.println("Este campo no puede estar vacío, ingrese una fecha válida:");
					fechaNacimiento = sc.nextLine();
				}
				LocalDate fechaNacimientoFormat = LocalDate.parse(fechaNacimiento, formatter);
				cliente.setFechaNacimiento(fechaNacimientoFormat);

				System.out.println("Ingrese el run del cliente: ");
				int run = sc.nextInt();
				sc.nextLine();
				while (run > 99999999) {
					System.out.println("El run ingresado debe ser menor a 99999999");
					run = sc.nextInt();
					sc.nextLine();
				}
				cliente.setRun(run);

				System.out.println("Ingrese el teléfono del cliente:");
				String telefono = sc.nextLine();
				while (telefono == null) {
					System.out.println("Este campo no puede estar vacío, ingrese un teléfono válido: ");
					telefono = sc.nextLine();
				}
				cliente.setTelefono(telefono);

				System.out.println("Ingrese la AFP del cliente: ");
				String afp = sc.nextLine();
				while (afp.length() < 4 || afp.length() > 30) {
					System.out.println("El nombre de la AFP debe contener entre 4 y 30 caracteres.");
					afp = sc.nextLine();
				}
				cliente.setAfp(afp);

				System.out.println("Ingrese sistema de salud del cliente (1 para Fonasa o 2 para Isapre):");
				int sistemaSalud = sc.nextInt();
				sc.nextLine();
				while (sistemaSalud != 1 && sistemaSalud != 2) {
					System.out.println("Ingrese un sistema de salud válido (1=Fonasa, 2=Isapre):");
					sistemaSalud = sc.nextInt();
					sc.nextLine();
				}
				cliente.setSistemaSalud(sistemaSalud);

				System.out.println("Ingrese la dirección del cliente: ");
				String direccion = sc.nextLine();
				while (direccion.length() > 70) {
					System.out.println("La dirección ingresada no puede exceder los 70 caracteres.");
					direccion = sc.nextLine();
				}
				cliente.setDireccion(direccion);

				System.out.println("Ingrese la comuna del cliente: ");
				String comuna = sc.nextLine();
				while (comuna.length() > 50) {
					System.out.println("La comuna ingresada no puede exceder los 50 caracteres");
					comuna = sc.nextLine();
				}
				cliente.setComuna(comuna);

				int edad;
				do {
					System.out.print("Ingrese la edad del cliente: ");
					while (!sc.hasNextInt()) {
						System.out.println("Debe ingresar un número entero.");
						sc.next();
					}
					edad = sc.nextInt();
					sc.nextLine();

					if (edad < 0 || edad > 150) {
						System.out.println("La edad ingresada debe ser igual o mayor a cero y menor a 150.");
						edad = sc.nextInt();
						sc.nextLine();
					}
				} while (edad < 0 || edad > 150);

				cliente.setEdad(edad);

				contenedor.almacenarCliente(cliente);
				break;
			}
			case 2: {
				Profesional profesional = new Profesional();
				
				System.out.println("Ingrese el nombre del profesional:");
				String nombre = sc.nextLine();
				while (nombre.length() < 10 || nombre.length() > 50 || nombre == null) {
					System.out.println("Este campo no puede estar vacío y debe contener entre 10 y 50 caracteres.");
					nombre = sc.nextLine();
				}
				profesional.setNombre(nombre);

				System.out.println("Ingrese la fecha de nacimiento (dd/mm/aaaa):");
				String fechaNacimiento = sc.nextLine();
				while (fechaNacimiento == null) {
					System.out.println("Este campo no puede estar vacío, ingrese una fecha válida:");
					fechaNacimiento = sc.nextLine();
				}
				LocalDate fechaNacimientoFormat = LocalDate.parse(fechaNacimiento, formatter);
				profesional.setFechaNacimiento(fechaNacimientoFormat);

				System.out.println("Ingrese el run del cliente: ");
				int run = sc.nextInt();
				sc.nextLine();
				while (run < 99999999) {
					System.out.println("El run ingresado debe ser menor a 99999999");
					run = sc.nextInt();
					sc.nextLine();
				}
				profesional.setRun(run);

				System.out.println("Ingrese el título del profesional:");
				String titulo = sc.nextLine();
				while (titulo.length() < 10 || titulo.length() > 50 || titulo == null) {
					System.out.println("Este campo no puede estar vacío y debe contener entre 10 y 50 caracteres.");
					titulo = sc.nextLine();
				}
				profesional.setTitulo(titulo);

				System.out.println("Ingrese la fecha de ingreso (dd/mm/aaaa):");
				String fechaIngreso = sc.nextLine();
				while (fechaIngreso == null) {
					System.out.println("Este campo no puede estar vacío, ingrese una fecha válida:");
					fechaIngreso = sc.nextLine();
				}
				LocalDate fechaIngresoFormat = LocalDate.parse(fechaIngreso, formatter);
				profesional.setFechaIngreso(fechaIngresoFormat);

				contenedor.almacenarProfesional(profesional);

				break;
			}
			case 3: {
				Administrativo administrativo = new Administrativo();

				System.out.println("Ingrese el nombre del administrativo: ");

				String nombre = sc.nextLine();
				while (nombre.length() < 10 || nombre.length() > 50 || nombre == null) {
					System.out.println("Este campo no puede estar vacío y debe contener entre 10 y 50 caracteres.");
					nombre = sc.nextLine();
				}
				administrativo.setNombre(nombre);

				System.out.println("Ingrese la fecha de nacimiento (dd/mm/aaaa): ");
				String fechaNacimiento = sc.nextLine();
				while (fechaNacimiento == null) {
					System.out.println("Este campo no puede estar vacío, ingrese una fecha válida: ");
					fechaNacimiento = sc.nextLine();
				}
				LocalDate fechaNacimientoFormat = LocalDate.parse(fechaNacimiento, formatter);
				administrativo.setFechaNacimiento(fechaNacimientoFormat);

				System.out.println("Ingrese el area del adiministrativo: ");
				String area = sc.nextLine();
				while (area.length() < 5 || area.length() > 30 || area == null) {
					System.out.println("Este campo no puede estar vacío y debe tener entre 5 y 30 caracteres");
					area = sc.nextLine();
				}
				administrativo.setArea(area);

				contenedor.almacenarAdministrativo(administrativo);
				break;
			}
			case 4: {
				Capacitacion capacitacion = new Capacitacion();

				int identificador;
				do {
					System.out.print("Ingrese el id de la capacitación: ");
					while (!sc.hasNextInt()) {
						System.out.println("Debe ingresar un número entero.");
						sc.next();
					}
					identificador = sc.nextInt();
					sc.nextLine();
				} while (identificador < 0);

				capacitacion.setIdentificador(identificador);

				int rutCliente;
				do {
					System.out.print("Ingrese el rut del cliente: ");
					while (!sc.hasNextInt()) {
						System.out.println("Debe ingresar un número entero.");
						sc.next();
					}
					rutCliente = sc.nextInt();
					sc.nextLine();

					if (rutCliente > 99999999) {
						System.out.println("La rut ingresado debe ser menor a 99999999.");
					}
				} while (rutCliente > 99999999);
				capacitacion.setRutCliente(rutCliente);

				System.out.println("Ingrese el día de la capacitación:");
				String dia = sc.nextLine();
				while (dia == null || dia != "lunes" || dia != "martes" || dia != "miercoles" || dia != "jueves"
						|| dia != "viernes" || dia != "sabado" || dia != "domingo") {
					System.out.println(
							"Este campo no puede estar vacío, ingrese un día válido (lunes, martes, miercoles, etc...):");
					dia = sc.nextLine();
				}
				capacitacion.setDia(dia);

				System.out.println("Ingrese la hora de la capacitación (hh:mm):");
				String hora = sc.nextLine();
				while (hora == null) {
					System.out.println("Este campo no puede estar vacío, ingrese una hora válida:");
					hora = sc.nextLine();
				}
				LocalTime horaFormat = LocalTime.parse(hora, formato);
				capacitacion.setHora(horaFormat);

				System.out.println("Ingrese el nombre del lugar de la capacitación: ");
				String lugar = sc.nextLine();
				while (lugar.length() < 10 || lugar.length() > 50 || lugar == null) {
					System.out.println(
							"El nombre del lugar no puede estar vacío y debe contener entre 10 y 50 caracteres");
					lugar = sc.nextLine();
				}

				capacitacion.setLugar(lugar);

				int cantidadAsistentes;
				do {
					System.out.print("Ingrese la cantidad de asistentes: ");
					while (!sc.hasNextInt()) {
						System.out.println("Debe ingresar un número entero.");
						sc.next();
					}
					cantidadAsistentes = sc.nextInt();

					if (cantidadAsistentes > 1000) {
						System.out.println("La cantidad de asistentes debe ser menor a 1000.");
					}
				} while (cantidadAsistentes > 99999999);
				capacitacion.setCantidadAsistentes(cantidadAsistentes);
				contenedor.almacenarCapacitacion(capacitacion);
				break;

			}

			case 5: {
				System.out.println("Ingrese el run del usuario a eliminar");
				int run = sc.nextInt();
				sc.nextLine();
				while (run < 99999999) {
					System.out.println("El run ingresado debe ser menor a 99999999");
					run = sc.nextInt();
					sc.nextLine();
				}

				contenedor.eliminarUsuario(run);
				break;
			}
			case 6: {
				contenedor.listarUsuarios();
				break;
			}
			case 7: {
				System.out.println(
						"Ingrese el tipo de usuario a listar (1: Cliente, 2: Profesional, 3: Administrativo):");
				int tipoUsuario = sc.nextInt();
				sc.nextLine();

				switch (tipoUsuario) {
				case 1: {
					System.out.println("Listado de Clientes:");
					contenedor.listarUsuariosPorTipo("Cliente");
					break;
				}
				case 2: {
					System.out.println("Listado de Profesionales:");
					contenedor.listarUsuariosPorTipo("Profesional");
					break;
				}
				case 3: {
					System.out.println("Listado de Administrativos:");
					contenedor.listarUsuariosPorTipo("Administrativo");
					break;
				}
				default: {
					System.out.println("Opción inválida. No se pudo listar usuarios por tipo.");
					break;
				}
				}
				break;

			}
			case 8: {
				contenedor.listarCapacitaciones();
				break;
			}

			case 9: {
				System.out.println("Saliendo del programa");
				break;
			}

			default: {
				System.out.println("Ingrese una opción válida");
				break;
			}
			}

		} while (opcion != 9);
		sc.close();
	}
}
