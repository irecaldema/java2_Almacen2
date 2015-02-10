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
	
	static public void lectura() throws IOException {
		ArrayList <Distribuidor> al_distri = new ArrayList <Distribuidor> ();
		FileReader fr = new FileReader("distribuidores.txt");
		BufferedReader br = new BufferedReader(fr); 
		String [] campos = null;
		String s;
		//ArrayList <Distribuidor> al_distri = new ArrayList <Distribuidor> ();		
		while((s = br.readLine()) != null) { 
			//creamos los objetos
			Distribuidor distri = new Distribuidor();
			Direccion dire = new Direccion();
			Contacto conta = new Contacto();	
						
			campos = s.split(",");
			    
			//introducimos los valores en los objetos para despues añadirlos al ArrayList
			//DISTRIBUIDOR
			distri.setNombre(campos[0]);
			distri.setCIF(campos[1]);
			//DIRECCION
			dire.setPais(campos[2]);
			dire.setCiudad(campos[3]);
			dire.setProvincia(campos[4]);
			dire.setDireccion(campos[5]);
			dire.setCodPostal(Integer.parseInt(campos[6]));
			//CONTACTO
			conta.setNombre(campos[3]);
			conta.setApellido(campos[4]);
			conta.setTelefono(Integer.parseInt(campos[5]));
			//completamos los datos del distribuidor con los objetos
			distri.setDireccion(dire);
			distri.setPersonaContacto(conta);
			//añadimos el objeto distribuidor al ArrayList
			al_distri.add(distri);
		}
	}	
}