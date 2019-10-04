
public class exercicio15 {

	public static void main(String[] args) {
		double x = 1000;
		double y = 1;
		double S = 0;
		boolean flag = true;
		
		for (int i = 0; i < 1000; i++) {
			if(flag == true ) {
				S += x/y;
				flag = false;
			} else {
				S -= x/y;
				flag = true;
			}
			x--;
			y++;
		}
		System.out.println("Soma = "+S);
	}
	
}
