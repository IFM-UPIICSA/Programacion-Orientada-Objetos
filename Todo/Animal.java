// Autor: Fernando Luque
// Editor: Ismael Flores

package animal;
import animal.*;
public class Animal{
	static String respira = "aire";
	
	void respirar(){
		System.out.println("El animal respira "+respira);
	}
	
	public static void main(String [] args){
		
		Animal ani [] = new Animal[3];
		ani[0] = new Animal();
		ani[1] = new Pez();
		ani[2] = new Ave();

		for (int i=0; i<3 ;i++ ) {
			ani[i].respirar();
		}
	}
}