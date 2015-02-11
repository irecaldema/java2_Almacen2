import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Lechuga {
    //propiedades
    private String tipoLechuga, procedencia, color;
    private Double eurosUnidad;
    private Distribuidor distribuidor;
	private int cod_barras;
    
    //métodos getter y setter
	public void setTipoLechuga(String tipoLechuga) {
		this.tipoLechuga = tipoLechuga;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setEurosUnidad(Double eurosUnidad) {
		this.eurosUnidad = eurosUnidad;
	}
	public void setDistribuidor(Distribuidor distribuidor) {
		this.distribuidor = distribuidor;
	}
	public void setCod_barras(int cod_barras) {
		this.cod_barras = cod_barras;
	}
	
	public String getTipoLechuga() {
		return tipoLechuga;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public String getColor() {
		return color;
	}
	public Double getEurosUnidad() {
		return eurosUnidad;
	}	
	public Distribuidor getDistribuidor() {
		return distribuidor;
	}
	public int getCod_barras() {
		return cod_barras;
	}	
	static public void introducir() throws IOException {
		Scanner sc = new Scanner(System.in);
		ArrayList <Lechuga> al_lechuga = new ArrayList <Lechuga>();
		System.out.println("\n	lechuga:");
			Lechuga lechu = new Lechuga();
			System.out.println("\n	Lechuga:");						
			System.out.println("		tipo de lechuga:");
			lechu.setTipoLechuga(sc.next());
			System.out.println("		procedencia:");
			lechu.setProcedencia(sc.next());
			System.out.println("		color:");
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
			
			//añadimos la manzana al ArrayList
			al_lechuga.add(lechu);
		//}
	}//class
}