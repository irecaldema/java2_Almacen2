import java.io.IOException;
import java.util.Scanner;
public class Leche {
    //propiedades
    private String tipo, procedencia;
    private Double eurosLitro;
    private Distribuidor distribuidor;
	private int cod_barras;
    
    //métodos getter y setter
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public void setEurosLitro(Double eurosLitro) {
		this.eurosLitro = eurosLitro;
	}
	public void setDistribuidor(Distribuidor distribuidor) {
		this.distribuidor = distribuidor;
	}
	public void setCod_barras(int cod_barras) {
		this.cod_barras = cod_barras;
	}
	
	public String getTipo() {
		return tipo;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public Double getEurosLitro() {
		return eurosLitro;
	}

	public Distribuidor getDistribuidor() {
		return distribuidor;
	}
	public int getCod_barras() {
		return cod_barras;
	}		
	
	static public Leche introducir() throws IOException {
		Scanner sc = new Scanner(System.in);
			System.out.println("\n	leche :");
			Leche lec = new Leche();
			System.out.println("		Tipo de leche:");
			lec.setTipo(sc.next());
			System.out.println("		Procedencia:");
			lec.setProcedencia(sc.next());
			System.out.println("		euro/litro:");
			lec.setEurosLitro(sc.nextDouble());
			System.out.println("	Introduce el nombre del distribuidor:");
			//cadena = sc.next();
			String cadena = "FastFood";
			System.out.println("	Introduce el codigo de barras:");
			lec.setCod_barras(sc.nextInt());	
			
			Distribuidor distri = new Distribuidor();
			lec.setDistribuidor(distri.busqueda_d(cadena));
			System.out.println("	Has introducido el producto correctamente");
			
			return lec;	
	}
}