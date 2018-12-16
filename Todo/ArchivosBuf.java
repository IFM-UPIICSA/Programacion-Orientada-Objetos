// java  ArchivosBuf	archi.uno	patito.txt
// Fernando Luque

import java.io.*;

public class ArchivosBuf {
	public static void main(String[] args) {
		try{
			FileReader entrada = new FileReader(args[0]);
			BufferedReader entBuf= new BufferedReader(entrada );
			try{
				FileWriter salida = new FileWriter (args[1]);
				BufferedWriter salBuf= new BufferedWriter (salida );
				try{
					String linea;
					linea = entBuf.readLine();			// primer linea
					while(linea != null) {
						salBuf.write(linea , 0, linea.length() );
						salBuf.newLine();
						linea = entBuf.readLine();			// siguiente
					}
				}
				finally{
					salBuf.close();
				}
			}
			finally{
				entBuf.close();
			}
		}
		catch(IOException e) {
			System.out.println("Error al abrir archivo");
		}
	}	// main
}
