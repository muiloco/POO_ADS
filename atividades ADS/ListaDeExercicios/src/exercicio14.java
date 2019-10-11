import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float precoKWh = 0;
		int numCon = 1;
		int qntconumida = 0;
		int tipo = 0;
		int count =0;
		float soma,somageral = 0;
		float somatipo1 = 0;
		float somatipo2 = 0;
		float somatipo3 = 0;
		float maior =0, menor= 1000;
		System.out.print("Informe o preco do kWh:");
		precoKWh = sc.nextFloat();
		while (numCon != 0) {
			System.out.print("Informe o id do consumidor:");
			numCon = sc.nextInt();
			System.out.print("Informe a quantidade de kWh consumida:");
			qntconumida = sc.nextInt();
			System.out.print("Informe o tipo do consumidor(1-residancial,2-comercial,3-industrial) :");
			tipo = sc.nextInt();
			soma = precoKWh * qntconumida;
			switch (tipo) {
			case 1:
				somatipo1 += soma;
				break;
			case 2:
				somatipo2+=soma;
				break;
			case 3 :
				somatipo3+=soma;
				break;
			default:
				break;
			}
			if (soma > maior) {maior = soma;}
			if(soma < menor) {menor = soma;}
			System.out.println("O cosumidor "+numCon+" vai pagar R$:"+soma);
			somageral += soma;
			count++;
		}
		System.out.println("O cosumo pelos tipo: 1-"+somatipo1+" 2-"+somatipo2+" 3-"+somatipo3);
		System.out.println("O maior consumo registrado:"+maior+" o menor registrado:"+menor+" a media do consumo:"+somageral/count);
		sc.close();
	}
}

