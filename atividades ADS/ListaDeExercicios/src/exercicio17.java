
public class exercicio17 {

	public static void main(String[] args) {
		
		double graos = 1;
		double soma = 0;
		int casas = 64;
		for (int i = 1; i <= casas; i++) {
			soma += graos;
			graos = graos * 2;
		}
		System.out.println("A quantidade de gr�os �:"+ soma);
		
	}
	
}
