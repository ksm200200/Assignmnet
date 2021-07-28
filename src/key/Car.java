package key;

public class Car {
	
	//변수 선언하고 캡슐화
	private String brand;
	private String model;
	private int modelyear;
	private String sound;
	
	private Key key = new Key(); //Car에 key객체 생성
	
	
	public Key getKey() {		return key;	}
	public void setKey(Key key) {		this.key = key;	}


	public String getBrand() {	return brand;}
	public void setBrand(String brand) {	this.brand = brand;	}


	public String getModel() {	return model;}
	public void setModel(String model) {	this.model = model;}

	public int getModelyear() {	return modelyear;}
	public void setModelyear(int modelyear) {	this.modelyear = modelyear;}

	
	public String getSound() {	return sound;}
	public void setSound(String sound) {	this.sound = sound;}
	
	

}
