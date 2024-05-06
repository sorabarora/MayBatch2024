package cc;

public class Local_Global_Variable {
	
	int a; // global variable
	
	public Local_Global_Variable(int x)
	{
		int y; // local variable
		y=x;
		a=20;
		System.out.println(y);
		
	}
	
	public static void main(String[] args) {
		
		Local_Global_Variable lgv1=new Local_Global_Variable(10);
		System.out.println(lgv1.a);
		
	}

}
