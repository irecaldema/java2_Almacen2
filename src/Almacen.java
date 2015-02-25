import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
public class Almacen {
	public static void main (String args[]) throws IOException 	{
		Scanner sc = new Scanner(System.in);		
		int seleccion=0;
		//int producto=0;
		//***leer distibuidores***
		try {
			//Distribuidores.lectura("distribuidores.txt");
			Distribuidores.lectura(args[0]);//no existe
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
				case 1: // ***mostrar distribuidores***	
					System.out.println("\nLista de distribuidores:");
					Distribuidores.mostrar();
					break;
				case 2: //***introduccion de productos*** 
					Productos.introducir(sc);
					//***visualizacion de los productos***
					Productos.mostrar();
					break;
				//case 2 FIN
				case 3: 			
					Clientes.mostrar();
					break;
				case 4: // *****cesta*****
					System.out.println("\n\tIntroduce el numero de productos a comprar:");
					int num_compras = sc.nextInt();
					double suma=0, precio=0, cantidad=0;
					for (int k = 0; k<num_compras; k++){
						//Productos mostrar
						System.out.println("Los productos:");
						Productos.mostrar();

					//***comprar prductos segun el codigo de barras***	
						System.out.println("\n\tIntroduce el codigo de barras del producto:");
						int cod_barras=sc.nextInt();
						
						Producto p_comprado = new Producto();
						Productos.addCesta(p_comprado.busqueda_p(cod_barras));
						
						System.out.println("Introduce la cantidad que quiere comprar");
						cantidad = sc.nextDouble();
						precio=Productos.obtainCesta(k).getPrecio()*cantidad;
						
						suma=suma+precio;
					}//fin bucle num de compras
					System.out.println("Introduce el DNI del cliente");
					Cliente comprador = new Cliente();
					double descuento=comprador.busqueda_c(sc.next()).getDto();
					double total =suma-suma*descuento/100;
					System.out.println("total a pagar: "+total);
					break;
				//case 4: cesta FIN 
				case 0: 
					break;
				default: 
					System.out.println("\n\tNo has seleccionado una opcion valida:");
			}//switch (seleccion)
		}while (seleccion!=0); //do{}while();
		System.out.println("Adios piltrafilla");
	}//ejecucion
}//class	