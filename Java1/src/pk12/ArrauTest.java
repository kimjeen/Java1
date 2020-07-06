package pk12;

public class ArrauTest {

	public static void main(String[] args) {
		
		// case 1.
		int[] number = new int[] {1,2,3,4,5,6,7,8,9,10};
		for(int arr: number) {
			System.out.print(arr+",");
		}
		System.out.println();
		System.out.println("==========================");
		
		//case 2.
		
		double[] data=new double[5];
		//fixed length
		int size=0;
		data[0]=10.0;
		size++;
		data[1]=20.0;
		size++;
		data[2]=30.0;
		size++;
		for(int i = 0;i<size;i++) {
			System.out.println(data[i]);
		}
		// data[3]가 초기화 되지 않아 0으로 출력된다.
		System.out.println("==========================");		
		
		//case 3.
		
		int arr[] = {10,20,30,40,50,};
		
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		

	}

}
