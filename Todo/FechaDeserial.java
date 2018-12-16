import java.io.*;
import java.util.*;
// Fernando Luque

public class FechaDeserial	{
	public static void main ( String args[] )	{
		new FechaDeserial();
	}

	FechaDeserial()	{
		Date fecha;
		try	{
			FileInputStream fis = new FileInputStream ("fecha.ser");	// nombre del archivo
			ObjectInputStream ois = new ObjectInputStream (fis);
			fecha = (Date)ois.readObject();
			fis.close();
			System.out.println ("Fecha " + fecha);
		}
		catch ( Exception e )	{
			System.out.println("excepcion general " +e.toString());
		}
	}	// constructor
}
