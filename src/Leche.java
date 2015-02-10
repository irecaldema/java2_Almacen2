import java.io.IOException;
import java.util.ArrayList;
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
	
	static public void introducir() throws IOException {
		//leche
		//ArrayList <Leche> al_leche = new ArrayList <Leche>();
		ArrayList <Leche> al_leche = new ArrayList <Leche>();
		cont=0;
		System.out.println("¿Cuantos variedades de leche?");
		int leches=sc.nextInt();
		for (int l=0; l<leches; l++)
		{
			cont=l+1;
			System.out.println("\n	leche "+cont+":");
			/*
			String tipo, procedencia;
			Double eurosLitro;
			Distribuidor distribuidor;
			*/
			Leche lec = new Leche();
			//lec.setTipo(sc.next());
			System.out.println("		tipo de leche:");
			lec.setTipo(sc.next());
			System.out.println("		procedencia:");
			lec.setProcedencia(sc.next());
			System.out.println("		euro/litro:");
			lec.setEurosLitro(sc.nextDouble());
			System.out.println("	Introduce el nombre del distribuidor:");
			//cadena = sc.next();
			cadena = "FastFood";
			System.out.println("	Introduce el codigo de barras:");
			lec.setCod_barras(sc.nextInt());			
			//recorremos el ArrayList de distribuidores para buscar el introducido
			for(int j=0; j<al_distri.size(); j++)
			{
				//si lo encontramos
				if (cadena.equalsIgnoreCase(al_distri.get(j).getNombre())){
					//le asignamos el valor del distribuidor al objeto leche
					lec.setDistribuidor(al_distri.get(j));
					break;//una vez encontrado salimos del bucle
				}
			}
			//añadimos la leche al ArrayList
			al_leche.add(lec);	
		}
	}
}