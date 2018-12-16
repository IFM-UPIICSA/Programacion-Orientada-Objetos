//Ismael Flores Melendez
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Saludador3 extends Applet implements MouseListener, 
							ActionListener, MouseMotionListener {
	Button btnOK, btnLimpia;
	TextField tfNombre, tfSaludo;

	public void mouseMoved(MouseEvent e){
		showStatus("X="+e.getX()+", Y="+e.getY());
	}

	public void actionPerformed(ActionEvent e){
		if (e.getSource()== btnLimpia) {
			tfSaludo.setText("");
			tfNombre.setText("");
		} 
		else {
			Boolean vacio = tfNombre.getText().isEmpty();
			if(vacio == true){
				tfSaludo.setText("Ingrese un nombre");
			}else{
				String saludo;		
				Calendar fecha = new GregorianCalendar();
				int hora = fecha.get(Calendar.HOUR_OF_DAY);
				if(hora < 12)
					saludo = "Buenos dias";
				else
					if(hora < 19)
						saludo = "Buenas tardes";
					else
						saludo = "Buenas noches";
				tfSaludo.setText(saludo+" "+tfNombre.getText()+".");
			}
		}
	}

	public void mouseEntered(MouseEvent e) {
		Button b= (Button) e.getSource();
		b.setForeground(Color.RED);
	}
	public void mouseExited(MouseEvent e) {
		Button b= (Button) e.getSource();
		b.setForeground(Color.BLACK);
	}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseDragged(MouseEvent e) {}

public void paint(Graphics g)	{
		System.out.println("Applet.- metodo paint");
	}

	public void init()	{
		System.out.println("Applet.- metodo init");
		
		showStatus("Saludador2");

		btnOK = new Button("Saludar");
		btnOK.addMouseListener(this);
		btnOK.addActionListener(this);
		
		tfNombre= new TextField(30);
		tfNombre.setText("");

		btnLimpia= new Button("Limpiar");
		btnLimpia.addMouseListener(this);
		btnLimpia.addActionListener(this);

		tfSaludo= new TextField(30);
		tfSaludo.setEditable(false);

		this.addMouseMotionListener(this);

		add(btnOK);
		add(tfNombre);
		add(btnLimpia);
		add(tfSaludo);
	}
} 