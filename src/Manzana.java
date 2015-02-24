import java.io.IOException;
import java.util.Scanner;
public class Manzana extends Producto {
    //propiedades
    private String color;
    private Double eurosKilo;

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

	@Override public Manzana introducir() throws IOException {
		Scanner sc = new Scanner(System.in);
			System.out.println("\n	manzana:");
			Manzana manza = new Manzana();
			System.out.println("\t\tTipo de manzana:");
			manza.setTipo(sc.next());
			System.out.println("\t\tProcedencia:");
			manza.setProcedencia(sc.next());
			System.out.println("\t\tcolor:");
			manza.setColor(sc.next());
			System.out.println("\t\teuro/kilo:");
			manza.setEurosKilo(sc.nextDouble());			
			System.out.println("\t\tIntroduce el nombre del distribuidor:");
			//cadena = sc.next();
			String cadena = "FastFood";
			System.out.println("\t\t\tIntroduce el codigo de barras:");
			manza.setCod_barras(sc.nextInt());
			
			Distribuidor distri = new Distribuidor();
			manza.setDistribuidor(distri.busqueda_d(cadena));
			System.out.println("\t\tHas introducido el producto correctamente");
			
			return manza;		
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