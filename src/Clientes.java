import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class Clientes {
    //propiedades
    static ArrayList <Cliente> al_cliente = new ArrayList <Cliente>();

    //métodos getter y setter

	public static void lectura() throws IOException {
		// *****lectura clientes*****
		//lectura del archivo y añadir los datos a un arraylist
		FileReader fr2 = new FileReader("clientes.txt");
		BufferedReader br2 = new BufferedReader(fr2); 
		String [] campos2 = null;
		String s2;
		while((s2 = br2.readLine()) != null) { 
			//creamos los objetos
			Cliente cliente = new Cliente();
			Direccion dire2 = new Direccion();
			
			campos2 = s2.split(",");
					    
			//introducimos los valores en los objetos para despues añadirlos al ArrayList
	 		//Cliente
	 		cliente.setNombre(campos2[0]);
	 		cliente.setApellidos(campos2[1]);
	 		cliente.setDNI(campos2[2]);
	 		//DIRECCION
	 		dire2.setPais(campos2[3]);//pais
	 		dire2.setProvincia(campos2[4]);//provincia
	 		dire2.setCiudad(campos2[5]);//ciudad
	 		dire2.setDireccion(campos2[6]);//direccion
	 		dire2.setCpostal(Integer.parseInt(campos2[7]));//cpostal
	 		//Cliente
	 		cliente.setNum_socio(Double.parseDouble(campos2[8]));
	 		cliente.setDto(Double.parseDouble(campos2[9]));
	 		//completamos los datos del cliente con los objetos
			cliente.setDireccion(dire2);
			//añadimos el objeto distribuidor al ArrayList
			al_cliente.add(cliente);
		}
	}
	
	public static void mostrar(){
		System.out.println("\nLos clientes:");
		//mostrar los clientes por pantalla
		for(int x=0; x<al_cliente.size(); x++){
			System.out.println("--------------------------------");	
			//  String nombre, apellidos, DNI; Direccion direccion; Double num_socio, dto;
				System.out.println("Nombre: " + al_cliente.get(x).getNombre());
				System.out.println("Apellidos: " + al_cliente.get(x).getApellidos());
				System.out.println("DNI: " + al_cliente.get(x).getDNI());
				System.out.println("Direccion: ");
				System.out.println("\t" + al_cliente.get(x).getDireccion().formatoDireccion());
				System.out.println("Numero de socio: " + al_cliente.get(x).getNum_socio());
				System.out.println("Descuento: " + al_cliente.get(x).getDto());				
			System.out.println("--------------------------------");       
		}  
	}
}
