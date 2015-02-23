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
	
	public Cliente busqueda_c (String dni_clie ) throws IOException {
		if (Clientes.al_cliente.size()==0) {
			Clientes.lectura();
		}	
		Cliente cliente_encontrado = new Cliente();
		for(int j=0; j<Clientes.al_cliente.size(); j++) {
			//si lo encontramos
			if (dni_clie.equalsIgnoreCase(Clientes.al_cliente.get(j).getDNI())){
				//le asignamos el valor del distribuidor al objeto leche
				cliente_encontrado=Clientes.al_cliente.get(j);
				break;
			}
		}
		return cliente_encontrado;
	}
}