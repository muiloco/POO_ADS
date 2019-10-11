import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idcurso = 1;
		int vagas,candmasculino,candfeminino;
		int somavagas=0;
		float canditadoporvagas, maior=0;
		float porcentagem = 0;
		
		do {
			System.out.print("Informe o id do curso:");
			idcurso = sc.nextInt();
			System.out.print("Informe a quantidade de vagas do curso:");
			vagas = sc.nextInt();
			System.out.print("Informe a quantidade de candidatos masculinos:");
			candmasculino = sc.nextInt();
			System.out.print("Informe a quantidade de candidatas femininas:");
			candfeminino = sc.nextInt();
			somavagas += vagas;
			canditadoporvagas = (candfeminino+candmasculino)/vagas;
			if (maior < canditadoporvagas) {maior = canditadoporvagas;}
			porcentagem = (vagas/100)*candfeminino;
			System.out.println("ID do curso:"+idcurso+" Candidatos/vagas:"+canditadoporvagas);
		} while (idcurso != 0);
		System.out.println("Maior quantidade por vaga:"+maior+" Quantidade total de vagas:"+somavagas);
	}
}
