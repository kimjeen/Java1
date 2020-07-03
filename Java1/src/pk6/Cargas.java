package pk6;

public class Cargas {

	//맴버변수 생성
	int gas;
	//생성자 생성;
	void setGas(int gas) {
		this.gas=gas;
	}
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		else{
			System.out.println("gas가 있습니다.");
			return true;
		}
	}
	void run() {
		//gas가 0보다 크면  달립니다. gas보유량
		while(true) {
			if(gas>0) {
				System.out.println("gas가 0보다 크면 달립니다."+gas);
				gas--;
			}
			else {
				System.out.println("gas가 없습니다."+gas);
				return; // break 안써도 됨.
			}
		}
	}	
		
		
	}

