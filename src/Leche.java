import java.io.IOException;
import java.util.Scanner;
public class Leche extends Producto {
    //propiedades
    private Double eurosLitro;
    
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

	@Override public Leche introducir() throws IOException {
		Scanner sc = new Scanner(System.in);
			System.out.println("\n	leche :");
			Leche lec = new Leche();
			System.out.println("\t\tTipo de leche:");
			lec.setTipo(sc.next());
			System.out.println("\t\tProcedencia:");
			lec.setProcedencia(sc.next());
			System.out.println("\t\teuro/litro:");
			lec.setEurosLitro(sc.nextDouble());
			System.out.println("\t\t\tIntroduce el nombre del distribuidor:");
			//cadena = sc.next();
			String cadena = "FastFood";
			System.out.println("\t\tIntroduce el codigo de barras:");
			lec.setCod_barras(sc.nextInt());	
			
			Distribuidor distri = new Distribuidor();
			lec.setDistribuidor(distri.busqueda_d(cadena));
			System.out.println("\t\tHas introducido el producto correctamente");
			
			return lec;	
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