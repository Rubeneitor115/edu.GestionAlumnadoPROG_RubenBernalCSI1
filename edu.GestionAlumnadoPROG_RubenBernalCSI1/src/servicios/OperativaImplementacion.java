package servicios;

import controladores.Inicio;
import dtos.AlumnoDto;

/**
 * Implementacion de la interfaz Operativa
 * rbr - 201124
 */
public class OperativaImplementacion implements OperativaInterfaz{

	/**
	 * Método para dar de alta un nuevo alumno
	 * rbr - 201124
	 */
	public void nuevoAlumno() {
		
		//Solicito los datos del alumno
		System.out.println("Introduzca el nombre del alumno: ");
		Inicio.alumno.setNombre(Inicio.sc.next());
		System.out.println("Introduzca el primer apellido del alumno: ");
		Inicio.alumno.setApellido1(Inicio.sc.next());
		System.out.println("Introduzca el segundo apellido del alumno: ");
		Inicio.alumno.setApellido2(Inicio.sc.next());
		System.out.println("Introduzca el dni del alumno: ");
		Inicio.alumno.setDni(Inicio.sc.next());
		
		//Guardo el alumno en la lista de alumnos registrados
		Inicio.listaAlumnos.add(Inicio.alumno);
		
	}

	/**
	 * Metodo para eliminar un alumno dado de alta
	 * rbr - 201124
	 */
	public void eliminarAlumno() {
		
		//Variables
		String dni;
		AlumnoDto alumnoAuxiliar = new AlumnoDto();
		
		//Solicito el dni del alumno para realizar su busqueda
		System.out.println("Introduzca el dni del alumno con la letra mayuscula: ");
		dni = Inicio.sc.next();
		
		//Busco al alumno en la lista de alumnos dados de alta
		for(AlumnoDto alumno : Inicio.listaAlumnos) {
			//Localizo al alumno en cuestion
			if(dni.equals(Inicio.alumno.getDni())) {
				alumnoAuxiliar = alumno;
			}
		}
		
		//Elimino al alumno de la lista de alumnos registrados
		Inicio.listaAlumnos.remove(alumnoAuxiliar);
		
	}

	/**
	 * Metodo que mostrará por pantalla el listado de todos los alumnos dados de alta
	 * rbr - 201124
	 */
	public void listarAlumnos() {
		
		System.out.println("Listado de alumnos dados de alta:");
		//Muesto el listado de los alumnos
		for(AlumnoDto alumno : Inicio.listaAlumnos) {
			System.out.println(alumno.ToString());
		}
	}

	/**
	 * Metodo para modificar los datos de un alumno dado de alta
	 * rbr - 201124
	 */
	public void modificarAlumno() {
		//Variables
		String dni;
		AlumnoDto alumnoAuxiliar = new AlumnoDto();
		
		//Solicito el dni del alumno para realizar su busqueda
		System.out.println("Introduzca el dni del alumno con la letra mayuscula: ");
		dni = Inicio.sc.next();
		
		//Busco al alumno en la lista de alumnos dados de alta
		for(AlumnoDto alumno : Inicio.listaAlumnos) {
			//Localizo al alumno en cuestion
			if(dni.equals(Inicio.alumno.getDni())) {
				alumnoAuxiliar = alumno;
			}
		}
		
		//Modifico sus datos
		System.out.println("Introduzca el nombre del alumno: ");
		alumnoAuxiliar.setNombre(Inicio.sc.next());
		System.out.println("Introduzca el primer apellido del alumno: ");
		alumnoAuxiliar.setApellido1(Inicio.sc.next());
		System.out.println("Introduzca el segundo apellido del alumno: ");
		alumnoAuxiliar.setApellido2(Inicio.sc.next());
		System.out.println("Introduzca el dni del alumno: ");
		alumnoAuxiliar.setDni(Inicio.sc.next());
	}

}
