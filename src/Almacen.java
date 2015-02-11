import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Almacen {
	public static void main (String args[]) throws IOException 	{
		Scanner sc = new Scanner(System.in);		
		int seleccion=0;
		int producto=0;
		ArrayList <Cliente> al_cliente = new ArrayList <Cliente>();
		ArrayList <Distribuidor> al_distri = new ArrayList <Distribuidor> ();
		ArrayList <Leche> al_leche = new ArrayList <Leche>();
		ArrayList <Manzana> al_manza = new ArrayList <Manzana>();
		ArrayList <Lechuga> al_lechuga = new ArrayList <Lechuga>();

		//***leer distibuidores***
		al_distri=Distribuidor.lectura();

		// *****lectura clientes*****
		al_cliente=Cliente.lectura();
		
		// lectura de productos
		
		
		do { //while (seleccion!=0){
			System.out.println("\n	Introduce el numero correspondiente:");
			System.out.println("		1: visualizar distribuidores");
			System.out.println("		2: introducir productos");
			System.out.println("		3: visualizar clientes");
			System.out.println("		4: cesta de la compra");	
			System.out.println("		0: salir");			
			seleccion = sc.nextInt();
				
			switch (seleccion){
				case 1: {// ***lectura de distribuidores***	
				System.out.println("\nLista de distribuidores:");				
					for(int x=0; x<al_distri.size(); x++){
						System.out.println("--------------------------------");	
						//nombre,CIF,o_direccion,o_personaContacto
							System.out.println("nombre: " + al_distri.get(x).getNombre());
							System.out.println("C.I.F.: " + al_distri.get(x).getCIF());
							System.out.println("direccion: ");
								System.out.println("	" + al_distri.get(x).getDireccion().getPais());
								System.out.println("	" + al_distri.get(x).getDireccion().getProvincia());
								System.out.println("	" + al_distri.get(x).getDireccion().getCiudad());
								System.out.println("	" + al_distri.get(x).getDireccion().getDireccion());
								System.out.println("	" + al_distri.get(x).getDireccion().getCpostal());
							System.out.println("persona de contacto: ");
								System.out.println("	" + al_distri.get(x).getPersonaContacto().getNombre());
								System.out.println("	" + al_distri.get(x).getPersonaContacto().getApellido());
								System.out.println("	" + al_distri.get(x).getPersonaContacto().getTelefono());
						System.out.println("--------------------------------");       
					}   
					break;
				}//FIN 1 lectura de distribuidores
				case 2: {
					do { //while (producto!=0){
						System.out.println("\n	Introduce el numero correspondiente:");
						System.out.println("		1: Manzana");
						System.out.println("		2: Lechuga");
						System.out.println("		3: Leche");	
						System.out.println("		0: salir");			
						producto = sc.nextInt();
							
						switch (producto) {
							case 1: 			
								//***introduccion de productos***		
								System.out.println("Introduce la informacion de los productos");
								//manzana ********************
								System.out.println("¿Cuantos variedades de manzana?");
								int cont_manzanas=sc.nextInt();
								for(int i = 0;i<cont_manzanas;i++){
									al_manza.add(Manzana.introducir());
								}
								break;
							case 2: 
								//lechuga ********************
								System.out.println("¿Cuantos variedades de leche?");
								int cont_lechugas=sc.nextInt();
								for(int i = 0;i<cont_lechugas;i++){
									al_lechuga.add(Lechuga.introducir());
								}
								break;
							case 3: 
								//LECHE ********************
								System.out.println("¿Cuantos variedades de leche?");
								int cont_leches=sc.nextInt();
								for(int i = 0;i<cont_leches;i++){
									al_leche.add(Leche.introducir());
								}
								break;
							default: 
								System.out.println("\n	No has seleccionado una opcion valida:");
						}//switch
					}while (producto!=0); //do{}while();
			
					//***visualizacion de los productos***
					//manzana,lechuga y leche
					// *********************************************************************************
					System.out.println("****Manzana****");
					for(int i = 0;i<al_manza.size();i++)	{
						System.out.println("Tipo de manzana: "+(al_manza.get(i).getTipoManzana()));
						System.out.println("Prcedencia: "+(al_manza.get(i).getProcedencia()));
						System.out.println("Color: "+(al_manza.get(i).getColor()));
						System.out.println("euro/Kg: "+(al_manza.get(i).getEurosKilo()));
						System.out.println("***DISTRIBUIDOR***");
							System.out.println("NOMBRE: "+(al_manza.get(i).getDistribuidor().getNombre()));
							System.out.println("CIF:" + al_manza.get(i).getDistribuidor().getCIF());
							System.out.println("DIRECCION: " + al_manza.get(i).getDistribuidor().getDireccion().getPais());
							System.out.println("	" + al_manza.get(i).getDistribuidor().getDireccion().getProvincia());
							System.out.println("	" + al_manza.get(i).getDistribuidor().getDireccion().getCiudad());
							System.out.println("	" + al_manza.get(i).getDistribuidor().getDireccion().getDireccion());
							System.out.println("	" + al_manza.get(i).getDistribuidor().getDireccion().getCpostal());
							System.out.println("CONTACTO:" + al_manza.get(i).getDistribuidor().getPersonaContacto().getNombre() + " " + al_manza.get(i).getDistribuidor().getPersonaContacto().getApellido());
							System.out.println("TELEFONO:" + al_manza.get(i).getDistribuidor().getPersonaContacto().getTelefono());
						System.out.println("*********************************************************");
						System.out.println("Codigo de barras: "+(al_manza.get(i).getCod_barras()));						
					}
					// *********************************************************************************
					System.out.println("****Lechuga****");
					for(int i = 0;i<al_lechuga.size();i++)	{
						System.out.println("Tipo de lechuga: "+(al_lechuga.get(i).getTipoLechuga()));
						System.out.println("Prcedencia: "+(al_lechuga.get(i).getProcedencia()));
						System.out.println("Color: "+(al_lechuga.get(i).getColor()));
						System.out.println("euro/Unidad: "+(al_lechuga.get(i).getEurosUnidad()));
						System.out.println("***DISTRIBUIDOR***");
							System.out.println("NOMBRE: "+(al_lechuga.get(i).getDistribuidor().getNombre()));
							System.out.println("CIF:" + al_lechuga.get(i).getDistribuidor().getCIF());
							System.out.println("DIRECCION:" + al_lechuga.get(i).getDistribuidor().getDireccion().getPais());
							System.out.println("	" + al_lechuga.get(i).getDistribuidor().getDireccion().getProvincia());
							System.out.println("	" + al_lechuga.get(i).getDistribuidor().getDireccion().getCiudad());
							System.out.println("	" + al_lechuga.get(i).getDistribuidor().getDireccion().getDireccion());
							System.out.println("	" + al_lechuga.get(i).getDistribuidor().getDireccion().getCpostal());
							System.out.println("CONTACTO:" + al_lechuga.get(i).getDistribuidor().getPersonaContacto().getNombre() + " " + al_lechuga.get(i).getDistribuidor().getPersonaContacto().getApellido());
							System.out.println("TELEFONO:" + al_lechuga.get(i).getDistribuidor().getPersonaContacto().getTelefono());
						System.out.println("*********************************************************");
						System.out.println("Codigo de barras: "+(al_lechuga.get(i).getCod_barras()));						
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
							System.out.println("DIRECCION:" + al_leche.get(i).getDistribuidor().getDireccion().getPais());
							System.out.println("	" + al_leche.get(i).getDistribuidor().getDireccion().getProvincia());
							System.out.println("	" + al_leche.get(i).getDistribuidor().getDireccion().getCiudad());
							System.out.println("	" + al_leche.get(i).getDistribuidor().getDireccion().getDireccion());
							System.out.println("	" + al_leche.get(i).getDistribuidor().getDireccion().getCpostal());
							System.out.println("CONTACTO:" + al_leche.get(i).getDistribuidor().getPersonaContacto().getNombre() + " " + al_leche.get(i).getDistribuidor().getPersonaContacto().getApellido());
							System.out.println("TELEFONO:" + al_leche.get(i).getDistribuidor().getPersonaContacto().getTelefono());
						System.out.println("*********************************************************");
						System.out.println("Codigo de barras: "+(al_leche.get(i).getCod_barras()));
					}

					/*
					// ***escritura de productos***
					FileWriter escritor = new FileWriter("productos.txt");
					String linea="";
					
					for(int w = 0;w<al_leche.size();w++)	{
						//escritor.append(al_leche.get(w));
						linea="*"+al_leche.get(w).getCod_barras()+","+al_leche.get(w).getEurosLitro()+"*";
						escritor.append(linea);
					}
					if (al_leche.size()>0;)
						escritor.append(";");
					for(int w = 0;w<al_lechuga.size();w++)	{
						//escritor.append(al_lechuga.get(w));
						linea="*"+al_lechuga.get(w).getCod_barras()+","+al_lechuga.get(w).getEurosUnidad()+"*";						
						escritor.append(linea);
					}
					if (al_lechuga.size()>0;)
						escritor.append(";");
					for(int w = 0;w<al_manza.size();w++)	{
						//escritor.append(al_manza.get(w));
						linea="*"+al_manza.get(w).getCod_barras()+","+al_manza.get(w).getEurosKilo()+"*";						
						escritor.append(linea);
					}
					
					System.out.println("productos guardados");
					escritor.close();
					//escritura de productos
			    	*/
					break;
				}//case 2 FIN
				//visualizacion de los productos
				case 3: {			
					System.out.println("\nLos clientes:");
					//mostrar los clientes por pantalla
					for(int x=0; x<al_cliente.size(); x++){
						System.out.println("--------------------------------");	
						//  String nombre, apellidos, DNI; Direccion direccion; Double num_socio, dto;
							System.out.println("Nombre: " + al_cliente.get(x).getNombre());
							System.out.println("Apellidos: " + al_cliente.get(x).getApellidos());
							System.out.println("DNI: " + al_cliente.get(x).getDNI());
							System.out.println("Direccion: ");
								System.out.println("	" + al_cliente.get(x).getDireccion().getPais());
								System.out.println("	" + al_cliente.get(x).getDireccion().getProvincia());
								System.out.println("	" + al_cliente.get(x).getDireccion().getCiudad());
								System.out.println("	" + al_cliente.get(x).getDireccion().getDireccion());
								System.out.println("	" + al_cliente.get(x).getDireccion().getCpostal());
							System.out.println("Numero de socio: " + al_cliente.get(x).getNum_socio());
							System.out.println("Descuento: " + al_cliente.get(x).getDto());				
						System.out.println("--------------------------------");       
					}  	

					break;
				}//case 3 FIN
				//introducir clientes
				// *****cesta*****
				case 4: {
					System.out.println("\n	Introduce el numero de productos a comprar:");
					int num_compras = sc.nextInt();
					double suma=0, precio=0;
					for (int k = 0; k<num_compras; k++){
						// ***lectura de productos***
						al_lechuga.clear();
						al_manza.clear();
						al_leche.clear();
						FileReader fr3 = new FileReader("productos.txt");
						BufferedReader br3 = new BufferedReader(fr3); 
						String [] campos3 = null;
						String [] campos4 = null;
						String [] campos5 = null;
						System.out.println("Los productos:");
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
									/*
									String tipoManzana, procedencia, color, 
									Double eurosKilo;
									Distribuidor distribuidor;
									int cod_barras;
									*/
										Manzana manza = new Manzana();
										System.out.println("-----manzana "+(p+1)+"-----");
										System.out.println("Producto: "+campos5[0]);manza.setTipoManzana(campos5[0]);
										System.out.println("Prcedencia: "+campos5[1]);manza.setProcedencia(campos5[1]);
										System.out.println("Color: "+campos5[2]);manza.setColor(campos5[2]);
										System.out.println("Euros/kilo: "+campos5[3]);manza.setEurosKilo(Double.parseDouble(campos5[3]));
										System.out.println("Distribuidor: "+campos5[4]);
											for(int j=0; j<al_distri.size(); j++){
												//si lo encontramos
												if (campos5[4].equalsIgnoreCase(al_distri.get(j).getNombre())){
												//le asignamos el valor del distribuidor al objeto leche
													manza.setDistribuidor(al_distri.get(j));
													break;
												}
											}
										System.out.println("Codigo de barras: "+campos5[5]);manza.setCod_barras(Integer.parseInt(campos5[5]));
										System.out.println("---------------------------");al_manza.add(manza);
									}	
									else if(o==1){
									/*
									String tipoLechuga, procedencia, color;
									Double eurosUnidad;
									Distribuidor distribuidor;
									int cod_barras;
									*/
									if (campos5[0].equalsIgnoreCase("nulo")){}
									else
									{
										Lechuga lechuga = new Lechuga();
										System.out.println("-----lechuga "+(p+1)+"-----");
										System.out.println("Producto: "+campos5[0]);lechuga.setTipoLechuga(campos5[0]);
										System.out.println("Prcedencia: "+campos5[1]);lechuga.setProcedencia(campos5[1]);
										System.out.println("Color: "+campos5[2]);lechuga.setColor(campos5[2]);
										System.out.println("Euros/unidad: "+campos5[3]);lechuga.setEurosUnidad(Double.parseDouble(campos5[3]));
										System.out.println("Distribuidor: "+campos5[4]);
											for(int j=0; j<al_distri.size(); j++){
												//si lo encontramos
												if (campos5[4].equalsIgnoreCase(al_distri.get(j).getNombre())){
												//le asignamos el valor del distribuidor al objeto leche
													lechuga.setDistribuidor(al_distri.get(j));
													break;
												}
											}
										System.out.println("Codigo de barras: "+campos5[5]);lechuga.setCod_barras(Integer.parseInt(campos5[5]));
										System.out.println("---------------------------");al_lechuga.add(lechuga);
									}	
									}
									else if(o==2){
									/*
			    					String tipo, procedencia;
									Double eurosLitro;
									Distribuidor distribuidor;
									int cod_barras;
									*/
									if (campos5[0].equalsIgnoreCase("nulo")){}
									else
									{
										Leche leche = new Leche();
										System.out.println("-----leche "+(p+1)+"-----");
										System.out.println("Producto: "+campos5[0]);leche.setTipo(campos5[0]);
										System.out.println("Euros/litro: "+campos5[1]);leche.setEurosLitro(Double.parseDouble(campos5[1]));
										System.out.println("Distribuidor: "+campos5[2]);
											for(int j=0; j<al_distri.size(); j++){
												//si lo encontramos
												if (campos5[2].equalsIgnoreCase(al_distri.get(j).getNombre())){
												//le asignamos el valor del distribuidor al objeto leche
													leche.setDistribuidor(al_distri.get(j));
													break;
												}
											}
										System.out.println("Codigo de barras: "+campos5[3]);leche.setCod_barras(Integer.parseInt(campos5[3]));
										System.out.println("---------------------------");al_leche.add(leche);
									}	
										
									}//else if
								}//for	
							} //for
						}//while
						// lectura de productos
					//***comprar prductos segun el codigo de barras***	
						System.out.println("\n	Introduce el codigo de barras del producto:");
						int cod_barras=sc.nextInt();
						//*** busqueda del producto en manzanas	***
						for (int i=0; i<al_manza.size();i++){
							if (al_manza.get(i).getCod_barras()==cod_barras){
		    	    			System.out.println("Producto:"+al_manza.get(i).getCod_barras()+" Codigo de barras: "+ al_manza.get(i).getCod_barras() +" precio: "+al_manza.get(i).getEurosKilo() );
								System.out.println("Introduce la cantidad que quiere comprar");
								double cantidad = sc.nextDouble();
								precio=al_manza.get(i).getEurosKilo();
								break;
							}
						}//busqueda del producto en manzanas
						//***busqueda del producto en lechugas***
						for (int i=0; i<al_lechuga.size();i++){
							if (al_lechuga.get(i).getCod_barras()==cod_barras){
		    	    			System.out.println("Producto:"+al_lechuga.get(i).getCod_barras()+" Codigo de barras: "+ al_lechuga.get(i).getCod_barras() +" precio: "+al_lechuga.get(i).getEurosUnidad() );
								System.out.println("Introduce la cantidad que quiere comprar");
								double cantidad = sc.nextDouble();
								precio=al_lechuga.get(i).getEurosUnidad()*cantidad;
								break;
							}
						}//busqueda del producto en lechugas
						//***busqueda del producto en leches***
						for (int i=0; i<al_leche.size();i++){
							if (al_leche.get(i).getCod_barras()==cod_barras){
		    	    			System.out.println("Producto:"+al_leche.get(i).getCod_barras()+" Codigo de barras: "+ al_leche.get(i).getCod_barras() +" precio: "+al_leche.get(i).getEurosLitro() );
								System.out.println("Introduce la cantidad que quiere comprar");
								double cantidad = sc.nextDouble();
								precio=al_leche.get(i).getEurosLitro()*cantidad;
								break;
							}
						}
						suma=suma+precio;
					}//busqueda del producto en leches
					System.out.println("Introduce el DNI del cliente");
					String DNI_clie = sc.next();
					double descuento=0;
					for(int j=0; j<al_cliente.size(); j++) {
						//si lo encontramos
						if (DNI_clie.equalsIgnoreCase(al_cliente.get(j).getDNI())){
							//le asignamos el valor del distribuidor al objeto leche
							descuento=al_cliente.get(j).getDto();
							break;
						}
					}
					double total =suma-suma*descuento/100;
					System.out.println("total a pagar: "+total);
						
					break;
				}//case 4 FIN
				// cesta	
			
				default: {
					System.out.println("\n	No has seleccionado una opcion valida:");
				}//default
			}//switch
		}while (seleccion!=0); //do{}while();
		System.out.println("Adios");
	}//ejecucion
}//class	