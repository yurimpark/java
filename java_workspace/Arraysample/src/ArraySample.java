
public class ArraySample {

	public static void main(String[] args) {
//		int i[];
//		int[] a;
//		
//		i=new int[10];
//		a=new int[5];
		
		int[] b=new int[10];  //배열의 이름 b는 레퍼런스 변수이다.
//		b[0]=0;
//		b[1]=1;
//		b[2]=2;
//		b[3]=3;
//		b[4]=4;
//		b[5]=5;
//		b[6]=6;
//		b[7]=7;
//		b[8]=8;
//		b[9]=9;
//		System.out.println(b[0]);
//		System.out.println(b[1]);
//		System.out.println(b[2]);
//		System.out.println(b[3]);
//		System.out.println(b[4]);
//		System.out.println(b[5]);
//		System.out.println(b[6]);
//		System.out.println(b[7]);
//		System.out.println(b[8]);
//		System.out.println(b[9]);
		
		for(int i=0;i<10;i++) {
			b[i]=i;
			System.out.println(b[i]);
			
		}
		for(int j:b) {
			System.out.println(j);
		}
	}

}
