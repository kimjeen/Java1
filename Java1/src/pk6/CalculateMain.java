package pk6;

public class CalculateMain {

	public static void main(String[] args) {

		Calculator MyCalc = new Calculator();
		
		//전원 ON
		MyCalc.powerOn();
		//더하기
		System.out.println("x+y="+MyCalc.plus(7, 7));
		//division
		System.out.println("x/y="+MyCalc.divide(7, 7));
		//전원 OFF
		MyCalc.poweroff();
		
	}

}
