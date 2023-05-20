package caelum;

public class TesteArray {

	public static void main(String[] args) {
		int [] idades = new int[10]
;
		for(int i = 0; i < 10; i++ ) {
			idades[i] = i*10;
		} // for
		for(int i = 0; i <idades.length; i++ ) {
			System.out.println(idades[i]);
		} // for
		// usando for each
		for(int x : idades) {
			System.out.println(x);
		}
	} // main

} // TesteArray
