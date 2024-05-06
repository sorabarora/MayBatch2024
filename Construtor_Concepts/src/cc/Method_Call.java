package cc;

public class Method_Call {
	
	int a,b,c,d,e;
	
	public void data_input(int x,int y,int z,int m,int n)
	{
		a=x;
		b=y;
		c=z;
		d=m;
		e=n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method_Call mc1=new Method_Call();
		mc1.data_input(10, 20, 30, 40, 50);
		System.out.println(mc1.a);
		System.out.println(mc1.b);
		System.out.println(mc1.c);
		System.out.println(mc1.d);
		System.out.println(mc1.e);
		
		/*
		 * By using method call, for one object there are 6 calls.
		 * So, for 10 objects there are 60 calls.
		 * 
		 */
		
		

	}

}
