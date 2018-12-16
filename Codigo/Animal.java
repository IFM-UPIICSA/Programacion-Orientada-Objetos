// Fernando Luque
//package animal;

public class Animal {
	private char sexo;
	float peso;	// por default = package
	protected int edad;
	public char getSexo() {
		return sexo;
	}
	public void probar() {
		Pez nemo = new Pez();
		System.out.println(nemo.escamas);
		System.out.println(nemo.branquias);

		Animal fido= new Animal();
		System.out.println(fido.sexo);
		System.out.println(fido.edad);
		System.out.println(fido.peso);
		System.out.println(fido.getSexo() );

		Ave piolin= new Ave();	System.out.println(piolin.plumas); 
		piolin.cantar();

		Automovil mustang= new Automovil();
		System.out.println(mustang.color);
	} //probar
}

class Pez extends Animal{	// no es public, por default = package
	private String escamas;
	int branquias;	// por default = package
	public void probar() {
		Pez nemo = new Pez();
		System.out.println(nemo.escamas);
		System.out.println(nemo.branquias);

		Animal fido= new Animal();
		System.out.println(fido.sexo);
		System.out.println(fido.edad);
		System.out.println(fido.peso);
		System.out.println(fido.getSexo() );

		Ave piolin= new Ave();	System.out.println(piolin.plumas);	piolin.cantar(); 

		Automovil mustang= new Automovil();
		System.out.println(mustang.color);
	} //probar
}

class Automovil{				// esta en el mismo package
	public String color;
	public void probar() {
		Pez nemo = new Pez();
		System.out.println(nemo.escamas);
		System.out.println(nemo.branquias);

		Animal fido= new Animal();
		System.out.println(fido.sexo);
		System.out.println(fido.peso);
		System.out.println(fido.getSexo() );

		Ave piolin= new Ave();	System.out.println(piolin.plumas);	piolin.cantar(); 

		Automovil mustang= new Automovil();
		System.out.println(mustang.color);
	} //probar
}
