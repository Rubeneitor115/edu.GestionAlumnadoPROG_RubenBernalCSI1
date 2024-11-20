package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.AlumnoDto;
import servicios.MenuInterfaz;
import servicios.MenuImplementacion;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

/**
 * Clase controladora de la aplicacion
 * rbr - 201124
 */
public class Inicio {

	/**
	 * Creo un Scanner, una lista y un objeto Alumno a nivel global, es decir, a nivel de todo el proyecto
	 * rbr - 201124
	 */
	public static Scanner sc = new Scanner(System.in);
	public static List<AlumnoDto> listaAlumnos = new ArrayList<AlumnoDto>();
	public static AlumnoDto alumno = new AlumnoDto();

	/**
	 * Metodo de entrada de la aplicacion
	 * rbr - 201124
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		byte opcion;
		
		//Llamo a las interfaces y sus implementaciones (Instancias)
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		
		do {
			//Muestro el menu por pantalla
			mi.mostrarMenu();
			//Recojo la opcion deseada por el usuario
			opcion = sc.nextByte();
			//Accedo a la opcion seleccionada por el usuario
			switch(opcion) {
				case 1:
					System.out.println("Aplicacion cerrada correctamente...");
					break;
				case 2:
					System.out.println("Ha seleccionado la opcion " + opcion);
					oi.nuevoAlumno();
					System.out.println("Alumno dado de alta correctamente!!!!");
					break;
				case 3:
					System.out.println("Ha seleccionado la opcion " + opcion);
					oi.listarAlumnos();
					break;
				case 4:
					System.out.println("Ha seleccionado la opcion " + opcion);
					oi.eliminarAlumno();
					System.out.println("Alumno dado de baja correctamente!!!!");
					break;
				case 5:
					System.out.println("Ha seleccionado la opcion " + opcion);
					oi.modificarAlumno();
					System.out.println("Los datos han sido modificados correctamente!!!!");
					break;
				default:
					System.err.println("***ERROR*** Opcion no valida");
					System.err.println("Intentelo de nuevo...");
					break;
			}
		}while (opcion!=1);

		sc.close();
	}

}
