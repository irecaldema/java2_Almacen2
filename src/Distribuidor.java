public class Distribuidor {
    //propiedades
    private String nombre, CIF;
    private Direccion direccion;
    private Contacto personaContacto;
    //nombre,CIF,direccion,personaContacto
    
    //metodos getter y setter
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCIF(String CIF) {
		this.CIF = CIF;
	}	
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public void setPersonaContacto(Contacto personaContacto) {
		this.personaContacto = personaContacto;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getCIF() {
		return CIF;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public Contacto getPersonaContacto() {
		return personaContacto;
	}		
}