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
}