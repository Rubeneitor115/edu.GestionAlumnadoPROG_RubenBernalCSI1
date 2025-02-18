package dtos;

public class AlumnoDto {

	//Atributos
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	//Constructores
	public AlumnoDto(String nombre, String apellido1, String apellido2, String dni) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
	}
	public AlumnoDto() {
		
	}
	
	//Método ToString
	public String ToString(){
		return "Dni: " + dni + 
				"   Nombre: " + nombre;
	}
	
}
