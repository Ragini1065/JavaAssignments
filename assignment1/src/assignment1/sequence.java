package assignment1;

public class sequence 
{
public sequence()
{
	this(33, 44, 55);
	System.out.println("Default constructor");
	}
public sequence(int a)
{
	this();
	System.out.println("One parameterized constructor");
	}
public sequence (int a, int b)
{
	this(1,2,3,4);
	System.out.println("Two parameterized constructor");
	}
public sequence (int a, int b, int c)
{
	System.out.println("Three parameterized constructor");
}
public sequence(int a, int b, int c, int d)
{
	this(11);
	System.out.println("Four parameterized constructor");
}
public static void main(String args[])
{
	sequence ref=new sequence(22, 33);
	}
}//for class
