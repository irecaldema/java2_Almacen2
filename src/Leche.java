import java.io.IOException;
import java.util.Scanner;
public class Leche extends Producto {
    //propiedades
    private Double eurosLitro;
    
	public Leche(){}
	
	public Leche(Scanner sc){
		super();
		System.out.println("\t\teuro/litro:");
		setEurosLitro(sc.nextDouble());			
	}
	
	public Leche (Double eurosLitro) {
		super();
    	setEurosLitro(eurosLitro);
    }    

    
    //métodos getter y setter
	public void setEurosLitro(Double eurosLitro) {
		this.eurosLitro = eurosLitro;
	}

	public Double getEurosLitro() {
		return eurosLitro;
	}
	
	@Override public double getPrecio() {
		return getEurosLitro();
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
		"euros/litro: " + this.eurosLitro+"\n"+
		"distribuidor: \n"+
		"\t" + this.distribuidor.formatoDistribuidor()+"\n"+
		"codigo de barras: " + this.cod_barras+"\n"+
		"--------------------------------\n";
		
		return string_producto;
	}
}