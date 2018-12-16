import java.io.IOException;
import java.util.Scanner;

// Fernando Luque
public class Lector {
	static Scanner sc ;
	public static void main(String args[]) {
		boolean bandera=false;
		sc = new Scanner(System.in);
		System.out.println("teclea true o false en minusculas");
		try{
			bandera= sc.nextBoolean();
		}
/*		catch(IOException i) {
			System.out.println("Error en el read bandera");
		}		*/
		catch(Exception e) {		// cualquier otra
			System.out.println("Otra excepcion " + e.toString() );
		}
		if(bandera) 
			System.out.println("tecleaste verdadero");
		else
			System.out.println("tecleaste falso");
	} //main
}