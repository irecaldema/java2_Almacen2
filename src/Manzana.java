import java.io.IOException;
import java.util.Scanner;
public class Manzana extends Producto {
    //propiedades
    private String color;
    private Double eurosKilo;
	
	public Manzana(){}
	
	public Manzana(Scanner sc){
		super();
		System.out.println("\t\tcolor:");
		setColor(sc.next());
		System.out.println("\t\teuro/kilo:");
		setEurosKilo(sc.nextDouble());			
	}
	
	public Manzana (String color, Double eurosKilo) {
		super();
    	setColor(color);
    	setEurosKilo(eurosKilo);
    }
	
    //métodos getter y setter
	public void setColor(String color) {
		this.color = color;
	}
	public void setEurosKilo(Double eurosKilo) {
		this.eurosKilo = eurosKilo;
	}
	
	public String getColor() {
		return color;
	}
	public Double getEurosKilo() {
		return eurosKilo;
	}
	
	@Override public double getPrecio() {
		return getEurosKilo();
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
		"euros/kilo: " + this.eurosKilo+"\n"+
		"distribuidor: \n"+
		"\t" + this.distribuidor.formatoDistribuidor()+"\n"+
		"codigo de barras: " + this.cod_barras+"\n"+
		"--------------------------------\n";
		
		return string_producto;
	}
}