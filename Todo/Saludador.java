// Fernando Luque M.
// se compila normalmente, se ejecuta con el comando		Appletviewer Saludador.html
import java.util.Calendar;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;		// el import no es recursivo
import java.util.*;

public class Saludador extends Applet implements ActionListener {
	Button btnOK;
	TextField tfmensaje;

	public void init()	{
		System.out.println("entro al metodo init");
		btnOK = new Button("Hora");		// instanciar componentes
		tfmensaje = new TextField(40) ;
		btnOK.addActionListener(this);		// registra al applet en el btnOK
		add(btnOK);
		add(tfmensaje);
	}
	
	public void actionPerformed(ActionEvent e) {	// necesario para ser ActionListener 
		Calendar fecha = new GregorianCalendar();
		int hora = fecha.get(Calendar.HOUR_OF_DAY);
		int minutos = fecha.get(Calendar.MINUTE);
		String salida = "";
		if(hora<12){
			salida = "Buenos Dias ";
		}else if(hora<20){
			salida = "Buenas Tardes ";
		}else{
			salida = "Buenas Noches ";
		}
		tfmensaje.setText(salida+"la hora es: "+hora+" "+minutos);
	}
}	// clase
