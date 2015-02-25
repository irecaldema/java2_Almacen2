import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
public class Almacen {
	public static void main (String args[]) throws IOException 	{
		Scanner sc = new Scanner(System.in);		
		int seleccion=0;
		try {//***leer distibuidores***
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
					Productos.comprar(sc);
					break;
				case 0: 
					break;
				default: 
					System.out.println("\n\tNo has seleccionado una opcion valida:");
			}//switch (seleccion)
		}while (seleccion!=0); //do{}while();
		System.out.println("Adios piltrafilla");
	}//ejecucion
}//class	