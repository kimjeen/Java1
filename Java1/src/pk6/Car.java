package pk6;

public class Car {

	//필드생성(멤버변수)
	String company = "현대자동차";
	//객체가 메인서 받아와서 던저줌
	String model;
	String color;
	int maxSpeed;
	
	//생성자 생성
	Car(){
	}

	//오버로딩
	Car(String model){
		this.model=model;
	}
	Car(String model,String color){
		this.model=model;
		this.color=color;
	}
	Car(String model,String color,int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	//메소드
	
	
	
}
