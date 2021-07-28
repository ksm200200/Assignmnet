package example;

public class PersonVO {
	//멤버변수 선언
	String name;
	int age;
	
	//정보 메소드 생성
	void Info() {	
		System.out.println("PersonVO = [이름: " + name + ", 나이: " + age + "]");
	}
	//has메소드 생성
	void has(CarVO car) {
		System.out.println(name + "은 " + car.name + "(" + car.type + ")" + "를(을) 소유하고있다.");	
	}
	
	public void print() {
		System.out.println(name + "은" + " 3대의 차를 소유하고 있다." );
	}
	
}
