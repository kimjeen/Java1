package pk6;

public class PersonExample {

	public static void main(String[] args) {

		Person p1 = new Person("11111111-1111111","ȫ�浿");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.name="ȫ���";
		System.out.println(p1.name);
		
	}

}
