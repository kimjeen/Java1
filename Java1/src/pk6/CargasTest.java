package pk6;

public class CargasTest {

	public static void main(String[] args) {

		
		Cargas gasconfirm = new Cargas();
		
		gasconfirm.setGas(10);
		
		boolean gasState=gasconfirm.isLeftGas();
		
//		if(gasState) {
//			System.out.println("����մϴ�.");
//			gasconfirm.run();
//		}
		//������ �ʿ� ����
		if(gasconfirm.isLeftGas()) {
			System.out.println("�⸧ ����");
			gasconfirm.run();
		}
		if(gasconfirm.isLeftGas()) {
			System.out.println("�������ʿ�");
		}
		else {
			System.out.println("���� �ʿ�.");
		}
		
		
		
		
		
	}

}
