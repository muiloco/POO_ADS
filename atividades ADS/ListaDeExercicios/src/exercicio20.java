import java.util.Scanner;

public class exercicio20 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x1,y1,x2,y2 = 0;
		double d = 0;
		
		System.out.print("Informe X1:");
		x1 = sc.nextDouble();
		System.out.print("Informe Y1:");
		y1 = sc.nextDouble();
		System.out.print("Informe X2:");
		x2 = sc.nextDouble();
		System.out.print("Informe Y2:");
		y2 = sc.nextDouble();
		
		d = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
		System.out.println("Resuldado de d:"+d);
		
		sc.close();
	}

}
