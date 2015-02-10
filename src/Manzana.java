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
		ArrayList <Manzana> al_manza = new ArrayList <Manzana>();
		int cont = 0;
		System.out.println("¿Cuantos variedades de manzana?");
		int manzanas=sc.nextInt();
		for (int m=0; m<manzanas; m++)	{
			cont=m+1;
			System.out.println("\n	manzana "+cont+":");
			/*
			String tipoManzana, procedencia, color, 
			Double eurosKilo;
			Distribuidor distribuidor;
			*/
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
			cadena = "FastFood";
			System.out.println("	Introduce el codigo de barras:");
			manza.setCod_barras(sc.nextInt());
			//recorremos el ArrayList de distribuidores para buscar el introducido
			for(int j=0; j<al_distri.size(); j++){
				//si lo encontramos
				if (cadena.equalsIgnoreCase(al_distri.get(j).getNombre())){
					//le asignamos el valor del distribuidor al objeto leche
					manza.setDistribuidor(al_distri.get(j));
				}
			}
			//añadimos la manzana al ArrayList
			al_manza.add(manza);			
		}
	}
}