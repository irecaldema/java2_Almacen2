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
	public String getColor() {
		return color;
	}

	public void setEurosKilo(Double eurosKilo) {
		this.eurosKilo = eurosKilo;
	}
	public Double getEurosKilo() {
		return eurosKilo;
	}

	@Override public Manzana introducir() throws IOException {
		Scanner sc = new Scanner(System.in);
			System.out.println("\n	manzana:");
			Manzana manza = new Manzana();
			System.out.println("		Tipo de manzana:");
			manza.setTipo(sc.next());
			System.out.println("		Procedencia:");
			manza.setProcedencia(sc.next());
			System.out.println("		color:");
			manza.setColor(sc.next());
			System.out.println("		euro/kilo:");
			manza.setEurosKilo(sc.nextDouble());			
			System.out.println("	Introduce el nombre del distribuidor:");
			//cadena = sc.next();
			String cadena = "FastFood";
			System.out.println("	Introduce el codigo de barras:");
			manza.setCod_barras(sc.nextInt());
			
			Distribuidor distri = new Distribuidor();
			manza.setDistribuidor(distri.busqueda_d(cadena));
			System.out.println("	Has introducido el producto correctamente");
			
			return manza;		
	}
}