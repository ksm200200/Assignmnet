package example;

import java.util.ArrayList;

public class MainClass {
	
	public static void main(String[] args) {
		
		ArrayList<Object> car = new ArrayList<Object>();
		
		//멤버변수 선언한 name과 age에 값 입력
		PersonVO person = new PersonVO();
		person.age = 25;
		person.name = "김선민";
		
		//다형성을 이용해 자식클래스인 Genesis가 부모클래스인 CarVO에 형변환
		//name과 type에 값 입력
		CarVO genesis = new Genesis();
		genesis.name = "제네시스";
		genesis.type = "신형";
		
		//다형성을 이용해 자식클래스인 Audi가 부모클래스인 CarVO에 형변환
		//name과 type에 값 입력
		CarVO audi = new Audi();
		audi.name = "아우디";
		audi.type = "구형";	
		
		//다형성을 이용해 자식클래스인 Avante가 부모클래스인 CarVO에 형변환
		//name과 type에 값 입력
		CarVO avante = new Avante();
		avante.name = "아반떼";
		avante.type = "중고";
		
		car.add(avante);
		car.add(genesis);
		car.add(audi);
		
		
		
		
		
		// info, print, has 메소드 출력
		person.Info();
		person.print();
		person.has(genesis);
		genesis.sound();
		
		person.has(audi);
		audi.sound();
		
		person.has(avante);
		avante.sound();
		
		
		
		
		
	}
	
}
