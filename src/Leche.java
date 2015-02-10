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
}