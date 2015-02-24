import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
public class Productos {
    // gg wp
    static ArrayList <Producto> al_producto = new ArrayList <Producto>();
    
    public static void lectura() throws IOException {
		FileReader fr3 = new FileReader("productos.txt");
		BufferedReader br3 = new BufferedReader(fr3); 
		String [] campos3 = null;
		String [] campos4 = null;
		String [] campos5 = null;
		String s3;
		while((s3 = br3.readLine()) != null) {
			campos3 = s3.split(";");
												//	System.out.println(campos3[2]+"  c3: " +campos3.length);
			for (int o = 0; o<campos3.length;o++){
												//	System.out.println("o: "+o);								
				campos4 = campos3[o].split("#");
												//	System.out.println(campos4[1]+"  c4: "+campos4.length);
				for (int p = 0; p<campos4.length;p++){
													//System.out.println("p: "+p);									
					campos5 = campos4[p].split(",");
													//System.out.println(campos5[0]+" c5: "+campos5.length);
					if(o==0){
						Manzana manza = new Manzana();
						manza.setTipo(campos5[0]);
						manza.setProcedencia(campos5[1]);
						manza.setColor(campos5[2]);
						manza.setEurosKilo(Double.parseDouble(campos5[3]));
						Distribuidor distri = new Distribuidor();
						manza.setDistribuidor(distri.busqueda_d(campos5[4]));
						manza.setCod_barras(Integer.parseInt(campos5[5]));
						al_producto.add(manza);
					}	
					else if(o==1){
						if (campos5[0].equalsIgnoreCase("nulo")){}
						else {
							Lechuga lechuga = new Lechuga();
							lechuga.setTipo(campos5[0]);
							lechuga.setProcedencia(campos5[1]);
							lechuga.setColor(campos5[2]);
							lechuga.setEurosUnidad(Double.parseDouble(campos5[3]));
							Distribuidor distri = new Distribuidor();
							lechuga.setDistribuidor(distri.busqueda_d(campos5[4]));
							lechuga.setCod_barras(Integer.parseInt(campos5[5]));
							al_producto.add(lechuga);
						}	
					}
					else if(o==2) {
						if (campos5[0].equalsIgnoreCase("nulo")){}
						else {
							Leche leche = new Leche();
							leche.setTipo(campos5[0]);
							leche.setProcedencia(campos5[1]);
							leche.setEurosLitro(Double.parseDouble(campos5[2]));
							Distribuidor distri = new Distribuidor();
							leche.setDistribuidor(distri.busqueda_d(campos5[3]));
							leche.setCod_barras(Integer.parseInt(campos5[4]));
							al_producto.add(leche);
						}
					}//else if
				}//for	
			} //for
		}//while
	}
	
    public static void mostrar(){
    	for(int x=0; x<Productos.al_producto.size(); x++){
            System.out.println(al_producto.get(x).formatoProducto());    
        }	
	}
	
}  