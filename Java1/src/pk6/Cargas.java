package pk6;

public class Cargas {

	//�ɹ����� ����
	int gas;
	//������ ����;
	void setGas(int gas) {
		this.gas=gas;
	}
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		else{
			System.out.println("gas�� �ֽ��ϴ�.");
			return true;
		}
	}
	void run() {
		//gas�� 0���� ũ��  �޸��ϴ�. gas������
		while(true) {
			if(gas>0) {
				System.out.println("gas�� 0���� ũ�� �޸��ϴ�."+gas);
				gas--;
			}
			else {
				System.out.println("gas�� �����ϴ�."+gas);
				return; // break �Ƚᵵ ��.
			}
		}
	}	
		
		
	}

