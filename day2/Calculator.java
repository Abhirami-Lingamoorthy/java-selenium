package week3.day2;

public class Calculator {
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int c, int d, int e)
	{
		System.out.println(c+d+e);
	}
	
	public void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	
   public void sub(double x, double y)
    {
	   System.out.println(x -y );
   }
   
	public void mul(int g, int h)
	{
		System.out.println(g*h);
	}
	
	public void mul(int i, double d)
	{
		System.out.println(i*d);
	}
	
 public void div(int l, int m)
{
	System.out.println(l/m);
}

 public void div(int n, double h)
{
	System.out.println(n/h);
}

	public static void main(String[] args) {
//method overriding
		Calculator number = new Calculator();
		number.add(7, 5);
		number.add(2, 6, 2);
		number.sub(7, 5);
		number.sub(2.12, 3.120);
		number.mul(5, 6);
		number.mul(8, 2);
		number.div(8, 2);
		number.div(6, 3);

	}

}
