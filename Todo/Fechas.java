import java.util.Date;
// Fernando Luque

public class Fechas{

	public static void main(String args[]) {
		String dias[]={"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
		String meses[]={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		Date dia = new Date();
		int d,m,y;
		
		if(args.length >=1)	{
			d=Integer.parseInt(args[0]);
			dia.setDate(d);
		}
	
		if(args.length >=2)	{
			m=Integer.parseInt(args[1]);
			m -=1;
			dia.setMonth(m);
		}
	
		if(args.length >=3)	{
			y=Integer.parseInt(args[2]);
			if(y>= 1900)	{
				y-=1900;
			}
			dia.setYear(y);
		}
		System.out.println("Hoy es " + dias[dia.getDay() ] +", "+ dia.getDate() + " de " + meses[dia.getMonth() ] + " de " + (dia.getYear() +1900) );
	}	//main
}	//clase