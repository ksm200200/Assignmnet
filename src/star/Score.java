package star;

import java.util.Scanner;

public class Score {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수: " );
		int point = scan.nextInt();
		
		if(point >= 71) {
			System.out.print("합격입니다.");
		}else {
			System.out.print("불합격입니다.");
			
		}
	}
}
