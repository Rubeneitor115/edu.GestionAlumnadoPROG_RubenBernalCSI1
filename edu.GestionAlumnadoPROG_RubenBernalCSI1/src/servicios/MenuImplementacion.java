package servicios;

public class MenuImplementacion implements MenuInterfaz{

	@Override
	public void mostrarMenu() {
		
		System.out.println("---------------------------------");
		System.out.println("               MENU              ");
		System.out.println("---------------------------------");
		System.out.println("1. Cerrar menu");
		System.out.println("2. Dar de alta un nuevo alumno");
		System.out.println("3. Listar los alumnos");
		System.out.println("4. Eliminar un alumno");
		System.out.println("5. Modificar un alumno");
		System.out.println("---------------------------------");
		System.out.println("Seleccione una opcion: ");
		
	}

	
}
