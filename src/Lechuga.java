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
			System.out.println("		Tipo de lechuga:");
			lechu.setTipo(sc.next());
			System.out.println("		Procedencia:");
			lechu.setProcedencia(sc.next());
			System.out.println("		Color:");
			lechu.setColor(sc.next());
			System.out.println("		euro/unidad:");
			lechu.setEurosUnidad(sc.nextDouble());	
			System.out.println("	Introduce el nombre del distribuidor:");
			//cadena = sc.next();
			String cadena = "FastFood";
			System.out.println("	Introduce el codigo de barras:");
			lechu.setCod_barras(sc.nextInt());
			
			Distribuidor distri = new Distribuidor();
			lechu.setDistribuidor(distri.busqueda_d(cadena));
			System.out.println("	Has introducido el producto correctamente");
			
			return lechu;
	}
}