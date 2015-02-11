import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Manzana {
    //propiedades
    private String tipoManzana, procedencia, color;
    private Double eurosKilo;
    private Distribuidor distribuidor;
	private int cod_barras;

    //métodos getter y setter
	public void setTipoManzana(String tipoManzana) {
		this.tipoManzana = tipoManzana;
	}
	public String getTipoManzana() {
		return tipoManzana;
	}
	
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public String getProcedencia() {
		return procedencia;
	}

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

	public void setDistribuidor(Distribuidor distribuidor) {
		this.distribuidor = distribuidor;
	}
	public Distribuidor getDistribuidor() {
		return distribuidor;
	}	
	
	public void setCod_barras(int cod_barras) {
		this.cod_barras = cod_barras;
	}
	public int getCod_barras() {
		return cod_barras;
	}	
	static public void introducir() throws IOException {
		Scanner sc = new Scanner(System.in);
		ArrayList <Manzana> al_manza = new ArrayList <Manzana>();
			System.out.println("\n	manzana:");
			Manzana manza = new Manzana();
			System.out.println("		tipo de manzana:");
			manza.setTipoManzana(sc.next());
			System.out.println("		procedencia:");
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
			
			//añadimos la manzana al ArrayList
			al_manza.add(manza);			
		//}
	}//class
}