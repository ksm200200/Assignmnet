package example;

import java.util.ArrayList;

public class MainClass {
	
	public static void main(String[] args) {
		
		ArrayList<Object> car = new ArrayList<Object>();
		
		//������� ������ name�� age�� �� �Է�
		PersonVO person = new PersonVO();
		person.age = 25;
		person.name = "�輱��";
		
		//�������� �̿��� �ڽ�Ŭ������ Genesis�� �θ�Ŭ������ CarVO�� ����ȯ
		//name�� type�� �� �Է�
		CarVO genesis = new Genesis();
		genesis.name = "���׽ý�";
		genesis.type = "����";
		
		//�������� �̿��� �ڽ�Ŭ������ Audi�� �θ�Ŭ������ CarVO�� ����ȯ
		//name�� type�� �� �Է�
		CarVO audi = new Audi();
		audi.name = "�ƿ��";
		audi.type = "����";	
		
		//�������� �̿��� �ڽ�Ŭ������ Avante�� �θ�Ŭ������ CarVO�� ����ȯ
		//name�� type�� �� �Է�
		CarVO avante = new Avante();
		avante.name = "�ƹݶ�";
		avante.type = "�߰�";
		
		car.add(avante);
		car.add(genesis);
		car.add(audi);
		
		
		
		
		
		// info, print, has �޼ҵ� ���
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
