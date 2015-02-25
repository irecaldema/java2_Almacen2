import java.io.IOException;
import java.util.Scanner;
public class Lechuga extends Producto {
    //propiedades
    private String color;
    private Double eurosUnidad;


	public Lechuga(){}
	
	public Lechuga(Scanner sc){
		super();
		System.out.println("\t\tcolor:");
		setColor(sc.next());
		System.out.println("\t\teuro/unidad:");
		setEurosUnidad(sc.nextDouble());			
	}
	
	public Lechuga (String color, Double eurosUnidad) {
		super();
    	setColor(color);
    	setEurosUnidad(eurosUnidad);
    }

    //métodos getter y setter
	public void setColor(String color) {
		this.color = color;
	}
	public void setEurosUnidad(Double eurosUnidad) {
		this.eurosUnidad = eurosUnidad;
	}

	public String getColor() {
		return color;
	}
	public Double getEurosUnidad() {
		return eurosUnidad;
	}	
	
	@Override public double getPrecio() {
		return getEurosUnidad();
	}
	
	@Override public String formatoProducto(){
		/*
		private String tipo, procedencia;
	    private Distribuidor distribuidor;
		private int cod_barras;
		*/
		String string_producto = 
		"--------------------------------\n"+
		"producto: " + this.tipo+"\n"+
		"procedencia: " + this.procedencia+"\n"+
		"color: " + this.color+"\n"+
		"euros/unidad: " + this.eurosUnidad+"\n"+
		"distribuidor: \n"+
		"\t" + this.distribuidor.formatoDistribuidor()+"\n"+
		"codigo de barras: " + this.cod_barras+"\n"+
		"--------------------------------\n";
		
		return string_producto;
	}
}