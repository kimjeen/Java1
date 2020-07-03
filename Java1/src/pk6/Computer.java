package pk6;

public class Computer {
	
	//method1 
	
//	int[] values=new values[] {1,2,3};
	
	int sum1(int[] values) {
		int sum=0;
		for(int i=1;i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
	
	//method2
	int sum2(int ... values) {
		int sum=0;
		for(int i=1;i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
}
