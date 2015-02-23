public class Contacto {
    //añadid las propiedades convenientes
    private String nombre, apellido; 
    private int telefono;    
    
    //métodos getter y setter
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getTelefono() {
		return telefono;
	}  	
	
	public String formatoContacto(){
		String string_contacto = 
		"Nombre: " + this.nombre+
		" Apellido: " + this.apellido+
		" N.Telefono: " + this.telefono;
		
		return string_contacto;
    }

}
