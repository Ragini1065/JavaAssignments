package assignment1;

public class BODMAS {
	
		public int sum(int a, int b)
		{
			int c=a+b;
			System.out.println("Sum result is:" +c);
			return c;
		}//for method sum
		public int sub(int d, int e)
		{
			int f=d-e;
			System.out.println("Sub result is:" +f);
			return f;
		}//for method sub
		public int product(int p, int q)
		{
			int r=p*q;
			System.out.println("Product result is:" +r);
			return r;
		}//for method product
		public void div(int x, int y)
		{
			int z=x/y;
			System.out.println("Division result is:" +z);	
		}//for method div
		public static void main(String args[]) 
		{
			BODMAS ref=new BODMAS();
			int sumresult1=ref.sum(10,2);
			int sumresult2=ref.sum(sumresult1, 2);
			int subresult=ref.sub(sumresult2,2);
			int prodresult=ref.product(subresult,2);
			ref.div(prodresult,2);
		}//for main method

	}//for class





