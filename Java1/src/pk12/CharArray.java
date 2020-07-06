package pk12;

import javax.swing.JOptionPane;

public class CharArray {

	public static void main(String[] args) {
		String str[]= {"ab11","cd222","gh444","ij555"};
		String res="";
		int i;
		
//		for(String n:str) {
//			System.out.println(n);
//		}
		for(i=0;i<str.length;i++) {
			res=res+str[i]+"n";
			System.out.println(res);
		}
		
		JOptionPane.showInternalMessageDialog(null, "배열의 문자 원소" + res);

	}

}
