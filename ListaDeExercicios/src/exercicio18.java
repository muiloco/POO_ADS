import java.util.Scanner;
public class exercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int carbono = 0;
		int rockwell = 0;
		int resistencia = 0;
		int grau = 0;
		int amostra = 0;
		String resp = "s";
		while (resp.equals("s")) {
			System.out.print("Informe a taxa de carbono %:");
			carbono = sc.nextInt();
			System.out.print("Informe dureza de Rockwell:");
			rockwell = sc.nextInt();
			System.out.print("Informe resistencia a tra��o psi:");
			resistencia = sc.nextInt();
			if(carbono<7) {
				if(rockwell>50) {
					if(resistencia>80000) {
						grau = 10;
					}
					else {
						grau = 9;
					}
				} else {
					grau = 8;
				}
			} else {
				grau = 7;
			}
			System.out.println("A amostra de a�o "+ amostra +" esta com grau de aceite de:"+grau);
			System.out.println("Para continuar testando as amostras prescione s!");
			resp = sc.next();
			amostra++;
		}
		sc.close();
	}
	
}
