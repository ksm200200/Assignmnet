package example;

public class PersonVO {
	//������� ����
	String name;
	int age;
	
	//���� �޼ҵ� ����
	void Info() {	
		System.out.println("PersonVO = [�̸�: " + name + ", ����: " + age + "]");
	}
	//has�޼ҵ� ����
	void has(CarVO car) {
		System.out.println(name + "�� " + car.name + "(" + car.type + ")" + "��(��) �����ϰ��ִ�.");	
	}
	
	public void print() {
		System.out.println(name + "��" + " 3���� ���� �����ϰ� �ִ�." );
	}
	
}
