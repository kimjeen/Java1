package pk6;

public class CalculateMain {

	public static void main(String[] args) {

		Calculator MyCalc = new Calculator();
		
		//���� ON
		MyCalc.powerOn();
		//���ϱ�
		System.out.println("x+y="+MyCalc.plus(7, 7));
		//division
		System.out.println("x/y="+MyCalc.divide(7, 7));
		//���� OFF
		MyCalc.poweroff();
		
	}

}
