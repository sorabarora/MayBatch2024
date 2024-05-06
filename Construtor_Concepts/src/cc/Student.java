package cc;

public class Student {
	
	public Student()
	{
		System.out.println("Default Constructor");
	}
	
	public Student(int a)
	{
		System.out.println("One Parameterized Constructor");
	}
	
	public Student(int a,int b)
	{
		System.out.println("Two Paramaterized Constructor");
	}
	
	public Student(int a,int b,int c)
	{
		System.out.println("Three Parameterized Constructor");
	}
	
	public static void main(String[] args) {
		
		Student s1=new Student(10,20,30);
		
	}

}
