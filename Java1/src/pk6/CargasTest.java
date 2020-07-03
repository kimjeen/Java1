package pk6;

public class CargasTest {

	public static void main(String[] args) {

		
		Cargas gasconfirm = new Cargas();
		
		gasconfirm.setGas(10);
		
		boolean gasState=gasconfirm.isLeftGas();
		
//		if(gasState) {
//			System.out.println("출발합니다.");
//			gasconfirm.run();
//		}
		//주유의 필요 유무
		if(gasconfirm.isLeftGas()) {
			System.out.println("기름 있음");
			gasconfirm.run();
		}
		if(gasconfirm.isLeftGas()) {
			System.out.println("주유노필요");
		}
		else {
			System.out.println("주유 필요.");
		}
		
		
		
		
		
	}

}
