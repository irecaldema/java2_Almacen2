import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Productos {
    // gg wp
    private static ArrayList <Producto> al_producto = new ArrayList <Producto>();
    private static ArrayList <Producto> al_cesta = new ArrayList <Producto>();
    
    static public void setAl_producto(ArrayList <Producto> productos) {
		al_producto=productos;
	}
	
	static public ArrayList <Producto> getAl_producto(){
		return al_producto;
	}
	
	static public void addProducto(Producto producto){
		al_producto.add(producto);
	}
	
	static public Producto obtainProducto(int index){
		return al_producto.get(index);
	}
	
	static public void addCesta(Producto producto){
		al_cesta.add(producto);
	}
	
	static public Producto obtainCesta(int index){
		return al_cesta.get(index);
	}
	
	public Producto busqueda_p (int cod ) throws IOException {
		if (al_producto.size()==0) {
			lectura();
		}	
		Producto producto_encontrado = new Producto();
		
		for (int i=0; i<al_producto.size();i++){
    		if (cod==al_producto.get(i).getCod_barras()){
    		    producto_encontrado=al_producto.get(i);
    			break;
    		}
		}
		return producto_encontrado;
	}
	
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
		br3.close();
	}
	
    public static void mostrar(){
    	for(int x=0; x<Productos.al_producto.size(); x++){
            System.out.println(al_producto.get(x).formatoProducto());    
        }	
	}
	
	public static void introducir(Scanner sc){
		int producto=0;
		do { //while (producto!=0){
			System.out.println("\n\tIntroduce el numero correspondiente:");
			System.out.println("\t\t1: Manzana");
			System.out.println("\t\t2: Lechuga");
			System.out.println("\t\t3: Leche");	
			System.out.println("\t\t0: salir");
			try{
				producto = sc.nextInt();
			}catch(InputMismatchException ex){
	            System.out.println("Se han introducido caracteres no numéricos 2 "+ex+" 2 ");
	            producto = sc.nextInt();
	        }
			switch (producto) {
				case 1: //manzana	
					System.out.println("Introduce la informacion de los productos");
					System.out.println("¿Cuantos variedades de manzana?");
					int cont_manzanas=sc.nextInt();
					for(int i = 0;i<cont_manzanas;i++){
						Manzana manzana = new Manzana(sc);
						addProducto(manzana);
					}
					System.out.println();
					System.out.println("¿Quiere introducir mas productos?");
					break;
				case 2: //lechuga
					System.out.println("¿Cuantos variedades de leche?");
					int cont_lechugas=sc.nextInt();
					for(int i = 0;i<cont_lechugas;i++){
						Lechuga lechuga = new Lechuga(sc);
						addProducto(lechuga);
					}
					System.out.println();
					System.out.println("¿Quiere introducir mas productos?");
					break;
				case 3: //leche
					System.out.println("¿Cuantos variedades de leche?");
					int cont_leches=sc.nextInt();
					for(int i = 0;i<cont_leches;i++){
						Leche leche = new Leche(sc);
						addProducto(leche);
					}
					System.out.println();
					System.out.println("¿Quiere introducir mas productos?");
					break;
				case 0:
					break;
				default: 
					System.out.println("\n\tNo has seleccionado una opcion valida:");
			}//switch
		}while (producto!=0); //do{}while();
	}
	
}  