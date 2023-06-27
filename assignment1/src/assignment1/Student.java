package assignment1;

public class Student 
{
  int rollNo;
  int age;
  
	  public void display1()
	  {
		  System.out.println("Welcome to all of you");
	  }//for display1
	  public void display2()
	  {
		  System.out.println("Automation is very easy");
	  }//for display2
	  public static void main(String args[]) 
	  {
		  Student ref=new Student();
		  ref.display1();
		  ref.display2();
		  ref.rollNo=51;
		  ref.age=28;
		  System.out.println(ref.rollNo);
		  System.out.println(ref.age);
	  }//for main method
  
}
