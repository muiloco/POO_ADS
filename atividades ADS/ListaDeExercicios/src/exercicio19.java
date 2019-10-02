
public class exercicio19 {

	public static void main(String[] args) {
		
		double raio = 0;
		double volume = 0;
		double pi = 3.14;
		while (raio < 20) {
			raio += 0.5;
			volume = (4 * pi * Math.pow(raio, 3)) / 3;
			System.out.println("O volume da esfera com raio igual :"+raio+" é de :"+volume+"\n");
		}
		
	}
}
