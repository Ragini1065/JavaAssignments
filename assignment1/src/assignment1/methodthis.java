package assignment1;

public class methodthis {
	public void m1()
	{
		this.m4(1, 2, 3);
		System.out.println("Default method");
		this.m2(11);
		this.m5(4, 5, 6, 7);
		this.m3(11,22);
	}
	public void m2(int a)
	{
		System.out.println("One parameterized method");
	}
	public void m3(int a, int b)
	{
		System.out.println("Two parameterized method");
	}
	public void m4(int a, int b, int c)
	{
		System.out.println("Three parameterized method");
	}
	public void m5(int a, int b, int c, int d)
	{
		System.out.println("Four parameterized method");
	}
	public static void main (String args[])
	{
		methodthis ref=new methodthis();
		ref.m1();
	}

}
