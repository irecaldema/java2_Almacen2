import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
public class Distribuidor {
    //propiedades
    private String nombre, CIF;
    private Direccion direccion;
    private Contacto personaContacto;
    static ArrayList <Distribuidor> al_distri = new ArrayList <Distribuidor>();
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
	
	static public ArrayList <Distribuidor> lectura(String fichero) throws IOException {
		ArrayList <Distribuidor> al_distri = new ArrayList <Distribuidor> ();
		FileReader fr = new FileReader(fichero);
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
			dire.setProvincia(campos[3]);
			dire.setCiudad(campos[4]);
			dire.setDireccion(campos[5]);
			dire.setCpostal(Integer.parseInt(campos[6]));
			//CONTACTO
			conta.setNombre(campos[7]);
			conta.setApellido(campos[8]);
			conta.setTelefono(Integer.parseInt(campos[9]));
			//completamos los datos del distribuidor con los objetos
			distri.setDireccion(dire);
			distri.setPersonaContacto(conta);
			//añadimos el objeto distribuidor al ArrayList
			al_distri.add(distri);
		}
		return al_distri;
	}
	
	public Distribuidor busqueda_d (String cadena ) throws IOException {
		ArrayList <Distribuidor> al_distri = new ArrayList <Distribuidor> ();
		al_distri=Distribuidor.lectura("distribuidores.txt");
		Distribuidor distribuidor_encontrado = new Distribuidor();
		for(int j=0; j<al_distri.size(); j++) {
			//si lo encontramos
			if (cadena.equalsIgnoreCase(al_distri.get(j).getNombre())){
				//le asignamos el valor del distribuidor al objeto leche
				distribuidor_encontrado=al_distri.get(j);
			}
			break; //una vez encontrado salimos del bucle
		}
		return distribuidor_encontrado;
	}
}