// java  Archivos archi.uno   patito.txt
// Fernando Luque

import java.io.*;

public class Archivos {
	public static void main(String[] args) {
		try{
			FileReader entrada = new FileReader(args[0]);
			try{
				FileWriter salida = new FileWriter (args[1]);
				try{
					char bufer[] = new char[128];
					int caracteresLeidos;
					caracteresLeidos = entrada.read(bufer);		// primer bufer
					while(caracteresLeidos != -1) {
						salida.write(bufer, 0, caracteresLeidos );
						caracteresLeidos = entrada.read(bufer);		// siguiente
					}
				}
				finally{
					salida.close();
				}
			}
			finally{
				entrada.close();
			}
		}
		catch(IOException e) {
			System.out.println("Error al abrir archivo");
		}
	}	// main
}
