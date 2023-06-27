package assignment1;

public class finresult {
	
	 public int mul(int a, int b)
	 {
	 int c=a*b;
	 System.out.println("Product result is:" +c);
	 return c;
	 }//for mul method
	 public int sub(int d, int e)
	 {
		 int f=d-e;
		 System.out.println("Sub result is:" +f );
		 return f;
	 }//for sub method
	 public int sum(int p, int q)
	 {
		 int r=p+q;
		 System.out.println("Sum result is:" +r);
		 return r;
	 }// for sum method
	 public void div(int x, int y)
	 {
		int z=x/y;
		System.out.println("Division result is:" +z);
	 }// for div method
	 public static void main(String args[])
	 {
		 finresult ref=new finresult();
		 int mulresult=ref.mul(10, 2);
		 int subresult1=ref.sub(mulresult, 2);
		 int sumresult=ref.sum(subresult1, 2);
		 int subresult2=ref.sub(sumresult,2);
		 ref.div(subresult2,2);
	 }//for main method
		
	}//for class

