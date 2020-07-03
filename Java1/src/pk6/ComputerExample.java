package pk6;

public class ComputerExample {

	public static void main(String[] args) {

		Computer myCom = new Computer();
		System.out.println("------ sum1유형1 ------");
		//new int[] values1={1,2,3}
		int[] values1= {1,2,3};
		int result1=myCom.sum1(values1);
		System.out.println("resutl1 : " +result1);
		
		
		
		System.out.println("------sum1  유형2 ------");
		int result2=myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("resutl2 : " +result2);
		
		
		
		System.out.println("------ sum2 유형1 ------");
		int result3=myCom.sum2(1,2,3);
		System.out.println("resutl3 : " +result3);
		
		
		System.out.println("------ sum2 유형2 ------");
		int result4=myCom.sum2(1,2,3,4,5);
		System.out.println("resutl4 : " +result4);
		
	}

}
