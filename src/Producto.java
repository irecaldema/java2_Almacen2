import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
public class Producto {
    //propiedades
    protected String tipo, procedencia;
    protected Distribuidor distribuidor;
	protected int cod_barras;
	protected double precio;
    
    public Producto(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\tMarca:");
		setTipo(sc.next());
		System.out.println("\t\tProcedencia:");
		setProcedencia(sc.next());
		System.out.println("\t\tIntroduce el nombre del distribuidor:");
		//cadena = sc.next();
		String cadena = "FastFood";
		try{
		setDistribuidor(Distribuidor.busqueda_d(cadena));
		}catch(IOException e){}
		System.out.println("\t\t\tIntroduce el codigo de barras:");
		setCod_barras(sc.nextInt());
	}
	
	public Producto (    
		String tipo, String procedencia,
	    Distribuidor distribuidor,
		int cod_barras,
		double precio
	) throws IOException{
		setTipo(tipo);
		setProcedencia(procedencia);
		setDistribuidor(distribuidor);
		setCod_barras(cod_barras);
		setPrecio(precio);
	};
    
    //métodos getter y setter
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public void setDistribuidor(Distribuidor distribuidor) {
		this.distribuidor = distribuidor;
	}
	public void setCod_barras(int cod_barras) {
		this.cod_barras = cod_barras;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getTipo() {
		return tipo;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public Distribuidor getDistribuidor() {
		return distribuidor;
	}
	public int getCod_barras() {
		return cod_barras;
	}
	
	public double getPrecio(){
		return precio;
	}
	
	public String formatoProducto(){
		/*
		private String tipo, procedencia;
	    private Distribuidor distribuidor;
		private int cod_barras;
		*/
		String string_producto = 
		"--------------------------------\n"+
		"producto: " + this.tipo+"\n"+
		"procedencia: " + this.procedencia+"\n"+
		"distribuidor: \n"+
		"\t" + this.distribuidor.formatoDistribuidor()+"\n"+
		"codigo de barras: " + this.cod_barras+"\n"+
		"--------------------------------\n";
		
		return string_producto;
	}
	
	public Producto busqueda_p (int cod ) throws IOException {
		if (Productos.getAl_producto().size()==0) {
			Productos.lectura();
		}	
		Producto producto_encontrado = new Producto();
		
		for (int i=0; i<Productos.getAl_producto().size();i++){
    		if (cod==Productos.getAl_producto().get(i).getCod_barras()){
    		    producto_encontrado=Productos.getAl_producto().get(i);
    			break;
    		}
		}
		return producto_encontrado;
	}
}