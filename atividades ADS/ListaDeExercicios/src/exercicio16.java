
public class exercicio16 {

	public static void main(String[] args) {
		
		int fx = 0;
		int hx = 0;
		int gx = 0;
		for (int x = 1; x <= 10; x++) {
			hx = (int) (Math.pow(x, 2) - 16);
			if (hx >= 0) {
				fx = hx;
			} else {
				fx = 1; 
			}
			if (fx == 0) {
				gx = (int) (Math.pow(x, 2) + 16);
			} else {
				gx = 0;
			}
			System.out.println("Para x="+x+"\t h(x)="+hx+"\t f(x)="+fx+"\t g(x)="+gx);
		}
		
	}
	
}