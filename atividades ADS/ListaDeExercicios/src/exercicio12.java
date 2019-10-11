import java.util.Scanner;

public class exercicio12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int canal;
		int npessoas;
		int ncasas;
		int canal4=0,canal5=0,canal7=0,canal12=0;
		System.out.print("Informe qnt de casas :");
		ncasas = sc.nextInt();
		int i=0;
		while (i<ncasas) {
			System.out.print("Informe qnt pesoas :");
			npessoas = sc.nextInt();
			System.out.print("Informe o canal :");
			canal = sc.nextInt();
			switch (canal) {
			case 4:
				canal4 += npessoas;
				break;
			case 5:
				canal5 += npessoas;
				break;
			case 7:
				canal7 += npessoas;
				break;
			case 12:
				canal12 += npessoas;
				break;
			default:
				break;
			}
			i++;
		}
		System.out.println("Canal 4:"+((canal4*100)/ncasas));
		System.out.println("Canal 5:"+((canal5*100)/ncasas));
		System.out.println("Canal 7:"+((canal7*100)/ncasas));
		System.out.println("Canal 12:"+((canal12*100)/ncasas));
	}
}
