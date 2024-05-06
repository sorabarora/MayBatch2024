package cc;

public class Constructor_call {
	
	int a,b,c,d,e;
	
	public Constructor_call(int x,int y,int z,int m,int n)
	{
		a=x;
		b=y;
		c=z;
		d=m;
		e=n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor_call cc1=new Constructor_call(10, 20, 30, 40, 50);
		System.out.println(cc1.a);
		System.out.println(cc1.b);
		System.out.println(cc1.c);
		System.out.println(cc1.d);
		System.out.println(cc1.e);
		
		/*
		 * By using constructor call, for one object there are 5 calls.
		 * So, for 10 objects there are 50 calls which means it reduces the lines of code
		 * and once its created we will use it again and again simply by creating the object
		 * of the class. So, this approach is better as compared to direct call and method call.
		 
		 */

	}

}
