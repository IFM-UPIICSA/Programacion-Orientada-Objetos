import java.io.*;
import java.util.*;
// Fernando Luque

public class FechaSerial	{
	public static void main ( String args[] )	{
		new FechaSerial();
	}
	FechaSerial ()	{
		Date fecha = new Date();
		try	{
			FileOutputStream fos = new FileOutputStream ("fecha.ser");
			ObjectOutputStream oos = new ObjectOutputStream (fos);
			oos.writeObject(fecha);
			fos.close();
		}
		catch ( IOException e )	{
			System.out.println("general " +e.toString());
		}
	}
}
