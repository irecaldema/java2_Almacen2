import java.io.IOException;
import java.util.Scanner;
public class Lechuga extends Producto {
    //propiedades
    private String color;
    private Double eurosUnidad;

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

	@Override public Lechuga introducir() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n	lechuga:");
			Lechuga lechu = new Lechuga();
			System.out.println("\n	Lechuga:");						
			System.out.println("\t\tTipo de lechuga:");
			lechu.setTipo(sc.next());
			System.out.println("\t\tProcedencia:");
			lechu.setProcedencia(sc.next());
			System.out.println("\t\tColor:");
			lechu.setColor(sc.next());
			System.out.println("\t\teuro/unidad:");
			lechu.setEurosUnidad(sc.nextDouble());	
			System.out.println("\t\t\tIntroduce el nombre del distribuidor:");
			//cadena = sc.next();
			String cadena = "FastFood";
			System.out.println("\t\tIntroduce el codigo de barras:");
			lechu.setCod_barras(sc.nextInt());
			
			Distribuidor distri = new Distribuidor();
			lechu.setDistribuidor(distri.busqueda_d(cadena));
			System.out.println("\t\tHas introducido el producto correctamente");
			
			return lechu;
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