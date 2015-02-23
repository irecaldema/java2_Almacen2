public class Direccion {
    //añadid las propiedades convenientes
    private String pais, provincia, ciudad, direccion;
	private int cpostal;


	//métodos getter y setter
	public void setPais(String dato){
	    	this.pais = dato;
    }
    public void setProvincia(String dato){
    	this.provincia = dato;
    }
	public void setCiudad(String dato){
    	this.ciudad = dato;
	}
	public void setDireccion(String dato){
	    this.direccion = dato;
    }
	public void setCpostal(int dato){
	    	this.cpostal = dato;
    }

//*************************************
	public String getPais(){
		return this.pais;
    }
	public String getProvincia(){
		return this.provincia;
	}
	public String getCiudad(){
		return this.ciudad;
	}
	public String getDireccion(){
		return this.direccion;
    }	
	public int getCpostal(){
		return this.cpostal;
    }
    
    public String formatoDireccion(){
		String string_direccion = 
		"Pais: " + this.pais+
		" Provincia: " + this.provincia+
		" Ciudad: " + this.ciudad+
		" Direccion: " + this.direccion+
		" C.P.: " + this.cpostal;
		
		return string_direccion;
    }
}
