package pk12;

public class CharArray1 {

	public static void main(String[] args) {

		char[] aplphabets = new char[26];
		char ch='A';
		
		
		
		System.out.println(ch);
		System.out.println((int)ch);
		
		
		for(int i=0;i<aplphabets.length;i++,ch++) {
			aplphabets[i]=ch;
			System.out.print(aplphabets[i]);
		}
		System.out.println();
		
		for(int i=0;i<aplphabets.length;i++) {
//			aplphabets[i]=ch;
			System.out.println(aplphabets[i] +","+(int)aplphabets[i]+",");
		}
		
	
		
		
		
		
		
	}

}
