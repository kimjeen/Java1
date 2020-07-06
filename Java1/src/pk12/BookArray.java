package pk12;

public class BookArray {

	public static void main(String[] args) {
		
		//객체배열 생성
		Book[] library=new Book[5];
		
		library[0]=new Book("태백산맥","조경래");
		library[1]=new Book("데미안","헤르만 헤세");
		library[2]=new Book("천마선","쥬논");
		library[3]=new Book("개미","베르나르 베르베르");
		library[4]=new Book("하늘이여땅이여","김진명");
		
		//객체는 생성됬으나 인스턴스화 되지않아 힙메모리에 주소할당이 되지 않은 상태
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
