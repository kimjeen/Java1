package pk6;

public class Car {

	//�ʵ����(�������)
	String company = "�����ڵ���";
	//��ü�� ���μ� �޾ƿͼ� ������
	String model;
	String color;
	int maxSpeed;
	
	//������ ����
	Car(){
	}

	//�����ε�
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
	//�޼ҵ�
	
	
	
}
