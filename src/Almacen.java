import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
public class Almacen {
	public static void main (String args[]) throws IOException 	{
		Scanner sc = new Scanner(System.in);		
		int seleccion=0;
		int producto=0;
		
		ArrayList <Leche> al_leche = new ArrayList <Leche>();
		ArrayList <Manzana> al_manza = new ArrayList <Manzana>();
		ArrayList <Lechuga> al_lechuga = new ArrayList <Lechuga>();

		//***leer distibuidores***
		try {
			//Distribuidores.lectura("distribuidores.txt");
			Distribuidores.lectura("m.txt");//no existe
		} catch (FileNotFoundException errorifico) {
			System.out.println("Error en la lectura: "+errorifico+" (try catch)");
			System.out.println("Escriba el nombre del archivo de distribuidores correcto");
			Distribuidores.lectura(sc.next());
		} finally {
			System.out.println("Lectura realizada");
		}
		// *****lectura clientes*****
		Clientes.lectura();
		
		// *****lectura productos*****
		Productos.lectura();

		do { //while (seleccion!=0){
			System.out.println("\n	Introduce el numero correspondiente:");
			System.out.println("\t\t1: visualizar distribuidores");
			System.out.println("\t\t2: introducir productos");
			System.out.println("\t\t3: visualizar clientes");
			System.out.println("\t\t4: cesta de la compra");	
			System.out.println("\t\t0: salir");		
			try{
				seleccion = sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Se han introducido caracteres no numéricos "+e);
				seleccion = sc.nextInt();
			}	
			switch (seleccion){
				case 1: // ***lectura de distribuidores***	
					System.out.println("\nLista de distribuidores:");
					Distribuidores.mostrar();
					break;
				//FIN 1 lectura de distribuidores
				case 2: 
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
							case 1: 			
								//***introduccion de productos***		
								System.out.println("Introduce la informacion de los productos");
								//manzana ********************
								System.out.println("¿Cuantos variedades de manzana?");
								int cont_manzanas=sc.nextInt();
								for(int i = 0;i<cont_manzanas;i++){
									Manzana manzana = new Manzana();
									al_manza.add(manzana.introducir());
									//al_producto.add(manzana.introducir())
								}
								System.out.println();
								System.out.println("¿Quiere introducir mas productos?");
								break;
							case 2: 
								//lechuga ********************
								System.out.println("¿Cuantos variedades de leche?");
								int cont_lechugas=sc.nextInt();
								for(int i = 0;i<cont_lechugas;i++){
									Lechuga lechuga = new Lechuga();
									al_lechuga.add(lechuga.introducir());
									//al_producto.add(lechuga.introducir())
								}
								System.out.println();
								System.out.println("¿Quiere introducir mas productos?");
								break;
							case 3: 
								//LECHE ********************
								System.out.println("¿Cuantos variedades de leche?");
								int cont_leches=sc.nextInt();
								for(int i = 0;i<cont_leches;i++){
									Leche leche = new Leche();
									al_leche.add(leche.introducir());
									//al_producto.add(leche.introducir())
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
			
					//***visualizacion de los productos***
					//manzana,lechuga y leche
					// *********************************************************************************
					System.out.println("****Manzana****");
					for(int i = 0;i<al_manza.size();i++)	{
						System.out.println("Tipo de manzana: "+(al_manza.get(i).getTipo()));
						System.out.println("Prcedencia: "+(al_manza.get(i).getProcedencia()));
						System.out.println("Color: "+(al_manza.get(i).getColor()));
						System.out.println("euro/Kg: "+(al_manza.get(i).getEurosKilo()));
						System.out.println("***DISTRIBUIDOR***");
							System.out.println("NOMBRE: "+(al_manza.get(i).getDistribuidor().getNombre()));
							System.out.println("CIF:" + al_manza.get(i).getDistribuidor().getCIF());
							System.out.println("DIRECCION: ");
							System.out.println("\t" + al_manza.get(i).getDistribuidor().getDireccion().getPais());
							System.out.println("\t" + al_manza.get(i).getDistribuidor().getDireccion().getProvincia());
							System.out.println("\t" + al_manza.get(i).getDistribuidor().getDireccion().getCiudad());
							System.out.println("\t" + al_manza.get(i).getDistribuidor().getDireccion().getDireccion());
							System.out.println("\t" + al_manza.get(i).getDistribuidor().getDireccion().getCpostal());
							System.out.println("CONTACTO:" + al_manza.get(i).getDistribuidor().getPersonaContacto().getNombre() + " " + al_manza.get(i).getDistribuidor().getPersonaContacto().getApellido());
							System.out.println("TELEFONO:" + al_manza.get(i).getDistribuidor().getPersonaContacto().getTelefono());
						System.out.println("Codigo de barras: "+(al_manza.get(i).getCod_barras()));	
						System.out.println("*********************************************************");
					}
					// *********************************************************************************
					System.out.println("****Lechuga****");
					for(int i = 0;i<al_lechuga.size();i++)	{
						System.out.println("Tipo de lechuga: "+(al_lechuga.get(i).getTipo()));
						System.out.println("Prcedencia: "+(al_lechuga.get(i).getProcedencia()));
						System.out.println("Color: "+(al_lechuga.get(i).getColor()));
						System.out.println("euro/Unidad: "+(al_lechuga.get(i).getEurosUnidad()));
						System.out.println("***DISTRIBUIDOR***");
							System.out.println("NOMBRE: "+(al_lechuga.get(i).getDistribuidor().getNombre()));
							System.out.println("CIF:" + al_lechuga.get(i).getDistribuidor().getCIF());
							System.out.println("DIRECCION:");
							System.out.println("\t" + al_lechuga.get(i).getDistribuidor().getDireccion().getPais());
							System.out.println("\t" + al_lechuga.get(i).getDistribuidor().getDireccion().getProvincia());
							System.out.println("\t" + al_lechuga.get(i).getDistribuidor().getDireccion().getCiudad());
							System.out.println("\t" + al_lechuga.get(i).getDistribuidor().getDireccion().getDireccion());
							System.out.println("\t" + al_lechuga.get(i).getDistribuidor().getDireccion().getCpostal());
							System.out.println("CONTACTO:" + al_lechuga.get(i).getDistribuidor().getPersonaContacto().getNombre() + " " + al_lechuga.get(i).getDistribuidor().getPersonaContacto().getApellido());
							System.out.println("TELEFONO:" + al_lechuga.get(i).getDistribuidor().getPersonaContacto().getTelefono());
						System.out.println("Codigo de barras: "+(al_lechuga.get(i).getCod_barras()));
						System.out.println("*********************************************************");
					}
					// *********************************************************************************
					System.out.println("****Leche****");
					for(int i = 0;i<al_leche.size();i++)	{
						System.out.println("Tipo de leche: "+(al_leche.get(i).getTipo()));
						System.out.println("Prcedencia: "+(al_leche.get(i).getProcedencia()));
						System.out.println("euro/litro: "+(al_leche.get(i).getEurosLitro()));
						System.out.println("***DISTRIBUIDOR***");					
							System.out.println("NOMBRE: "+(al_leche.get(i).getDistribuidor().getNombre()));
							System.out.println("CIF:" + al_leche.get(i).getDistribuidor().getCIF());
							System.out.println("DIRECCION:");
							System.out.println("\t" + al_leche.get(i).getDistribuidor().getDireccion().getPais());
							System.out.println("\t" + al_leche.get(i).getDistribuidor().getDireccion().getProvincia());
							System.out.println("\t" + al_leche.get(i).getDistribuidor().getDireccion().getCiudad());
							System.out.println("\t" + al_leche.get(i).getDistribuidor().getDireccion().getDireccion());
							System.out.println("\t" + al_leche.get(i).getDistribuidor().getDireccion().getCpostal());
							System.out.println("CONTACTO:" + al_leche.get(i).getDistribuidor().getPersonaContacto().getNombre() + " " + al_leche.get(i).getDistribuidor().getPersonaContacto().getApellido());
							System.out.println("TELEFONO:" + al_leche.get(i).getDistribuidor().getPersonaContacto().getTelefono());
						System.out.println("Codigo de barras: "+(al_leche.get(i).getCod_barras()));
						System.out.println("*********************************************************");
					}
					break;
				//case 2 FIN
				//visualizacion de los productos
				case 3: 			
					Clientes.mostrar();
					break;
				//case 3 FIN
				//introducir clientes
				// *****cesta*****
				case 4: 
					System.out.println("\n\tIntroduce el numero de productos a comprar:");
					int num_compras = sc.nextInt();
					double suma=0, precio=0, cantidad=0;
					for (int k = 0; k<num_compras; k++){
						// ***lectura de productos***
						//Productos mostrar
						System.out.println("Los productos:");
						Productos.mostrar();

						// lectura de productos
					//***comprar prductos segun el codigo de barras***	
						System.out.println("\n\tIntroduce el codigo de barras del producto:");
						int cod_barras=sc.nextInt();
						
						Producto p_comprado = new Producto();
						Cesta.al_cesta.add(p_comprado.busqueda_p(cod_barras));
						
						System.out.println("Introduce la cantidad que quiere comprar");
						cantidad = sc.nextDouble();
						//precio=al_cesta.get(k).getEurosKilo()*cantidad;
						precio=Cesta.al_cesta.get(k).getPrecio()*cantidad;
						
						suma=suma+precio;
					}//busqueda del producto en leches
					System.out.println("Introduce el DNI del cliente");
					Cliente comprador = new Cliente();
					double descuento=comprador.busqueda_c(sc.next()).getDto();
					double total =suma-suma*descuento/100;
					System.out.println("total a pagar: "+total);
						
					break;
				//case 4 FIN
				// cesta	
				case 0: 
					break;
				default: 
					System.out.println("\n\tNo has seleccionado una opcion valida:");
				//default
			}//switch
		}while (seleccion!=0); //do{}while();
		System.out.println("Adios piltrafilla");
	}//ejecucion
}//class	