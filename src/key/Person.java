package key;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
	Scanner scan = new Scanner(System.in);
	
	ArrayList<Car> cars = new ArrayList<Car>(); //차 리스트 생성
	ArrayList<Key> keys = new ArrayList<Key>();	//키 리스트 생성

	//사람 정보 변수 선언
	String name;
	int age;
	String carrer;
	
	//객체 지정
	Person(String name, int age, String carrer) {
		this.name = name;
		this.age = age;
		this.carrer = carrer;	
	}
	
	//차 등록 메소드
	public void  addCar() {
		//차 정보 입력
		System.out.println("브랜드: ");
		String brand = scan.next();
		System.out.println("모델명: ");
		String model = scan.next();
		System.out.println("연식: ");
		int modelyear = scan.nextInt();
		System.out.println("엔진소리: ");
		String sound = scan.next();
		System.out.println("차를 등록하였습니다.");
		
		 
		Car c = new Car(); //Car 클래스의 객체 c 생성
		Key k = new Key(); //Key 클래스의 객체 k 생성

		//c에 차정보 설정
		c.setBrand(brand);
		c.setModel(model);
		c.setModelyear(modelyear);
		c.setSound(sound);
		
		
		//k에 키정보 설정
		k.setCarmodel(model);
		k.setKeyname(model + "_key");
		
		
		cars.add(c); //cars 리스트에 각각 차 정보를 설정한 c를 저장
		keys.add(k); //keys 리스트에 각각 키 정보를 설정한 k를 저장
		
		c.setKey(k);//키 정보인 k를 Car의 key에 입력
		
		System.out.println(" ");
	}
		
	
	//사람 정보 메소드
	public void info() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("직업: " + carrer);
		System.out.println(" ");
		
		System.out.println("---cars'list--- ");
		// cars 리스트에 넣은 각각 설정한 차 정보 c를 출력
		for(Car car : cars) {
			System.out.println("[" + car.getBrand() + ", " + car.getModel() 
			+ ", " + car.getModelyear() + ", "+ car.getSound()+  "]");
		}
		
		System.out.println("----keys'list--- ");
		//keys 리스트에 넣은 각각 설정한 key정보 k를 출력
		for(Key key : keys) {
			System.out.println("["  + key.getKeyname()+ "]");
		}
	}
	
	//자동차 시동걸기 메소드
	public void StartUp() {
		String selectCar = ""; //시동걸 자동차
		String selectKey = "";// 선택할 키
		
		//시동걸 차 리스트 출력
		System.out.println("---cars'list--- ");
		for(Car car : cars) {
			System.out.println("[" + car.getBrand() + " : " + car.getModel() + "]");
		}
		
		System.out.println("시동걸 자동차를 고르세요.");
		System.out.print(">>");
		String CarModel = scan.next();//시동걸 차 입력
		System.out.println(" ");
		
		//선택할 키 리스트 출력
		System.out.println("----keys'list--- ");
		for(Key key : keys) {
			System.out.println("["  + key.getKeyname()+ "]");
		}
		
		System.out.println("자동차 키를 선택하세요.");
		System.out.print(">>");
		String KeyName = scan.next();//선택할 키 입력
		System.out.println(" ");
		
		for(Car car : cars) {
			//입력받은 시동걸 차가 자동차 키의 모델값과 같으면 selectCar = 자동차 키의 모델값
			if(CarModel.equals( car.getKey().getCarmodel() )) {
				selectCar = car.getKey().getCarmodel();
			}
			//입력받은 선택된 키가 자동차 키의 이름과 같으면 selectKey = 자동차 키의 모델값
			if(KeyName.equals( car.getKey().getKeyname() ) ) {
				selectKey = car.getKey().getCarmodel();		
			}
		}
		
		//시동결과 확인
		if(selectCar.equals(selectKey)) {
			System.out.println("시동이 걸렸습니다.");
		}else {
			System.out.println("시동이 안걸립니다.");
		}
				
		
		}
		
}
