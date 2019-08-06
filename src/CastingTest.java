
public class CastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//implicite(묵시적 형변환)
		int i = 10;
		long l = i; //명시적 캐스팅 / 명시적 형변환
		//long l = i; //묵시적 캐스팅 / 묵시적 형변환
		System.out.println(i + ":" + l);
		
		//int j = l; //값에 문제가 생길수 있기 때문에 컴파일 오류를 발시킨다.
		
		//explict(명시적)
		int j = (int)l;	//강제적 형변환
		System.out.println(j + ":" + l);
		
	}

}
