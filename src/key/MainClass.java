package key;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//person 객체 생성 및 값 입력
		Person person = new Person("김선민", 25, "학생");
		
		
		Menu menu = new Menu();
		
		while(true) {
			menu.menu();
			switch( scan.nextInt() ) {
			case 1 : 
				person.info();//사람 정보 확인
				break;
			case 2 :
				person.addCar();//자동차 등록
				break;
				
			case 3 :
				person.StartUp();//자동차 시동걸기
				break;
					
			case 4 :
				System.out.println("종료");
				System.exit(0);
				
				scan.close();
			}
			
		}
		
	}

}
