
public class SwapTest2 {
	
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		System.out.println(i + ":" + j);
		
		swap(i,j);
		System.out.println(i + ":" + j);
	}
	
	//static이기 때문에 객체를 생성하지 않아도 된다.
	public static void swap(int p, int q) {
		int temp = p;
		p = q;
		q = temp;
	}

}
