//package numeros;

public class Numeros {

	public static void main(String[] args) {
		int a=69,b=23,c;
		boolean bandera;

		bandera= !false;
		System.out.println("el valor de !false es:" +bandera);
		bandera= false && metodo();
		System.out.println("el valor de && cortocircuito es:" +bandera);
		bandera= false & metodo();
		System.out.println("el valor de & es:" +bandera);
		bandera= true || metodo();
		System.out.println("el valor de || cortocircuito es:" +bandera);
		bandera= true | metodo();
		System.out.println("el valor de | es:" +bandera);
		bandera= false ^ metodo();
		System.out.println("el valor de ^ es:" +bandera);
		
		System.out.println("BORRAR");
		System.out.print("\033[H\033[2J");
			System.out.flush();
		c=~a;
		System.out.println("el valor de ~a es:" +c);
		c=a&b;
		System.out.println("el valor de a&b es:" +c);
		c=a|b;
		System.out.println("el valor de a|b es:" +c);
		c=a^b;
		System.out.println("el valor de a^b es:" +c);
		c=a<<2;
		System.out.println("el valor de a<<2 es:" +c);
		c=a>>1;
		System.out.println("el valor de a>>1 es:" +c);
		c=a>>>1;
		System.out.println("el valor de a>>>1 es:" +c);
	} // main

	private static boolean metodo() {
		System.out.println("Ojo con este mensaje");
		return true;
	}
}
