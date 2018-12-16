// Fernando Luque M.
// se compila normalmente, se ejecuta con el comando		Appletviewer Hola.html

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;		// el import no es recursivo
import java.util.*;

public class SaludadorCongelado extends Applet implements ActionListener ,Runnable 
{
	Button btnOK;
	TextField tfmensaje;
	Thread t = new Thread(this);	// segundo hilo
	public void init()	{
		System.out.println("entro al metodo init");
		btnOK = new Button("Saludar");		// instanciar componentes
		tfmensaje = new TextField(35) ;
		btnOK.addActionListener(this);		// registra al applet en el btnOK
		add(btnOK);
		add(tfmensaje);
		t.start();	// llama a run()
	}

	public void start () {
		t.resume();
	}	// start del Applet

	public void stop()	{
		t.suspend();
	}	// stop del applet
	public void destroy() {
		t.stop();
	}

	public void actionPerformed(ActionEvent e) {	// necesario para ser ActionListener 
		String saludo;			// local
		Date d= new Date();		// trae la fecha y hora actuales
		if(d.getHours() < 12)
			saludo = "Buenos dias";
		else
			if(d.getHours() < 19)
				saludo = "Buenas tardes";
			else
				saludo = "Buenas noches";
		
		saludo+=" Munutos:"+d.getMinutes()+" Segundos:"+d.getSeconds();
		tfmensaje.setText(saludo);
	}

	public void run(){
		while (true) {
			showStatus ( (new Date () ).toString () );
			try {
				Thread.sleep (1000);	// pausa 1 segundo
			}
			catch (Exception e) {
			}
		}
	}
}	// clase