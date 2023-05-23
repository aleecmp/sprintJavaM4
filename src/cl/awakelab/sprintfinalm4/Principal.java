package cl.awakelab.sprintfinalm4;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		

		Contenedor contenedor = new Contenedor();

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

		int opcion = sc.nextInt();
		sc.nextLine();

		switch (opcion) {
		case 1: {

			break;

		}
		case 2: {

		}
		case 3: {

		}
		case 4: {

		}
		case 5: {

		}
		case 6: {

		}
		case 7: {

		}
		case 8: {

		}
		case 9: {

		}

		}
	}
}
