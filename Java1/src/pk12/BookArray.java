package pk12;

public class BookArray {

	public static void main(String[] args) {
		
		//��ü�迭 ����
		Book[] library=new Book[5];
		
		library[0]=new Book("�¹���","���淡");
		library[1]=new Book("���̾�","�츣�� �켼");
		library[2]=new Book("õ����","���");
		library[3]=new Book("����","�������� ��������");
		library[4]=new Book("�ϴ��̿����̿�","������");
		
		//��ü�� ���������� �ν��Ͻ�ȭ �����ʾ� ���޸𸮿� �ּ��Ҵ��� ���� ���� ����
		for(int i=0;i<library.length;i++) {
			System.out.println(library[i]);
		}
		System.out.println("==================");
		for(int i=0;i<library.length;i++) {
			library[i].showBookinfor();
		}
		System.out.println("==================");
		for(int i=0;i<library.length;i++) {
			System.out.println(library[i]);
		}
		
		
		
		
		
	}
}
