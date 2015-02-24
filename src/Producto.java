import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class Producto {
    //propiedades
    protected String tipo, procedencia;
    protected Distribuidor distribuidor;
	protected int cod_barras;
    
    //métodos getter y setter
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
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
	public Distribuidor getDistribuidor() {
		return distribuidor;
	}
	public int getCod_barras() {
		return cod_barras;
	}
	
	public Producto introducir() throws IOException{
		Producto producto = new Producto();
		return producto;
	};
	
	public String formatoProducto(){
		/*
		private String tipo, procedencia;
	    private Distribuidor distribuidor;
		private int cod_barras;
		*/
		String string_producto = 
		"--------------------------------\n"+
		"producto: " + this.tipo+"\n"+
		"procedencia: " + this.procedencia+"\n"+
		"distribuidor: \n"+
		"\t" + this.distribuidor.formatoDistribuidor()+"\n"+
		"codigo de barras: " + this.cod_barras+"\n"+
		"--------------------------------\n";
		
		return string_producto;
	}
}