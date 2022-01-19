package classe;

public class PrimeiroTrauma {

	int a = 3; //deve-se referenciar o ponto a para chama-lo
	static int b = 7 // ponto estatico pode ser acessado só chamando	
			
	public static void main(String[] args) {
		PrimeiroTrauma p = new PrimeiroTrauma();
		//para conseguir acessar o ponto a
		System.out.println(p.a);
		
		System.out.println(b);
		
	}
}
