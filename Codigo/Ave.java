// Fernando Luque
//package ave;

public class Ave extends Animal{
	public String plumas;
	void cantar() {		// default
		System.out.println("el ave canta aunque la rama tiemble...");
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

		Ave piolin= new Ave();
		System.out.println(piolin.plumas);
		piolin.cantar();

		Automovil mustang= new Automovil();
		System.out.println(mustang.color);
	} //probar
}	// Ave

class Zapato{
		public void probar() {
			Animal fido= new Animal();
			System.out.println(fido.edad);
		}
}
