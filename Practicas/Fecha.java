import java.util.Calendar;
import java.util.GregorianCalendar;
//Ismael Flores Meléndez
public class Fecha{
	public static void main(String[] args) {
    Calendar fecha = Calendar.getInstance();
    String dias	[] = {"Sabado", "Domingo","Lunes","Martes","Miercoles",
        "Jueves","Viernes"};
    String mes[] = {"Enero","Febrero","Marzo","Abril","Mayo",
        "Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

    System.out.println("Hoy es "+dias[fecha.get(Calendar.DAY_OF_WEEK)]+" "+
            fecha.get(Calendar.DAY_OF_MONTH)+" de "+mes[fecha.get(Calendar.MONTH)]
            +" del "+ (fecha.get(Calendar.YEAR))  ) ;
	}
}