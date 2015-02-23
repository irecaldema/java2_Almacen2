import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
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
	
	public Distribuidor busqueda_d (String cadena ) throws IOException {
		if (Distribuidores.al_distri.size()==0) {
			Distribuidores.lectura("distribuidores.txt");
		}	
		Distribuidor distribuidor_encontrado = new Distribuidor();
		for(int j=0; j<Distribuidores.al_distri.size(); j++) {
			//si lo encontramos
			if (cadena.equalsIgnoreCase(Distribuidores.al_distri.get(j).getNombre())){
				//le asignamos el valor del distribuidor al objeto leche
				distribuidor_encontrado=Distribuidores.al_distri.get(j);
			}
			break; //una vez encontrado salimos del bucle
		}
		return distribuidor_encontrado;
	}
}