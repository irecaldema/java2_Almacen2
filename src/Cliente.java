import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class Cliente {
    //propiedades
    private String nombre, apellidos, DNI;
    private Direccion direccion;
    private Double num_socio, dto; //descuento

    //métodos getter y setter
    public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}	
    public void setDNI(String DNI) {
		this.DNI = DNI;
	}	
    public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
    public void setNum_socio(Double num_socio) {
		this.num_socio = num_socio;
	}
    public void setDto(Double dto) {
		this.dto = dto;
	}	
	
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public String getDNI() {
		return DNI;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public Double getNum_socio() {
		return num_socio;
	}
	public Double getDto() {
		return dto;
	}
	static public ArrayList lectura() throws IOException {
		// *****lectura clientes*****
		//lectura del archivo y añadir los datos a un arraylist
		ArrayList <Cliente> al_cliente = new ArrayList <Cliente>();
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
		return al_cliente;
	}//class
}