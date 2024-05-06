package cc;

public class Direct_call {

	int a,b,c,d,e;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Direct_call dc1=new Direct_call();
		dc1.a=10;
		dc1.b=20;
		dc1.c=30;
		dc1.d=40;
		dc1.e=50;
		
		System.out.println(dc1.a);
		System.out.println(dc1.b);
		System.out.println(dc1.c);
		System.out.println(dc1.d);
		System.out.println(dc1.e);
		
		/* For one object there are 10 calls.
		 * So, for 10 objects there are 100 calls.
		 
		 */
		
		
		

	}

}
