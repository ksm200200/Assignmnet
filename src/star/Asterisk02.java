package star;

public class Asterisk02 {
	
	public static void main(String[] args) {
		
		for(int line = 1; line <= 10; line++) {
			
			for(int star = 10; star >= line; star--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	
}
