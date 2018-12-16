import java.io.IOException;
import java.util.Scanner;

// Fernando Luque
public class Promedio {
	public static void main(String args[]) {
		int cont=0,calif=0;
		char existe='s';
		float acum=0.0f,promedio= 0.0f;
		Scanner sc = new Scanner(System.in);
		System.out.println("este programa saca promedio de calificaciones");
		System.out.println("hay alumnos? s/n");
		try{
			existe=(char) System.in.read();		// devuelve int
		}
		catch(IOException i) {
			existe= 'n';
			System.out.println("Error en el read existe" + i.toString() );
		}
//		System.out.println("existe." +existe);
		while(existe=='s' || existe=='S') {		/*inicio del ciclo*/
			System.out.println("teclee la calificacion");
			try{
				calif = sc.nextInt();
			}
			catch(NumberFormatException  i) {
				System.out.println("Error en el read calificacion" +i);
			}
			catch(Exception e) {		// cualquier otra
				System.out.println("Otra excepcion " + e.toString() );
			}
//			System.out.println("calif." +calif);
			cont++;
			acum=acum+calif;
			System.out.println("hay mas alumnos? ");
			try{
				existe=(char) System.in.read();		// devuelve int
			}
			catch(IOException i) {
				existe= 'n';
				System.out.println("Error en el read existe" + i.toString() );
			}
		}						/*fin de ciclo*/

		try{
			promedio= acum/cont;
		}
		catch(ArithmeticException a) {
			promedio= 0.0f;
			System.out.println("Division entre 0, no hay alumnos");
		}
		catch(Exception e) {	// cualquier otra
			promedio= 0.0f;
			System.out.println("Otra excepcion " + e.toString() );
		}
		finally {
			System.out.println("El promedio es: " + promedio);
		};
	} //main
}