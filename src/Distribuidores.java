import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
public class Distribuidores {
    
    static ArrayList <Distribuidor> al_distri = new ArrayList <Distribuidor>();
    
    static public void lectura(String fichero) throws IOException {
		//ArrayList <Distribuidor> al_distri = new ArrayList <Distribuidor> ();
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
	}
    
}    