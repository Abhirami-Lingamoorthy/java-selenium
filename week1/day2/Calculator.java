package week1.day2;

public class Calculator {
	int a = 7 ; int b = 2 ; int c = 4 ; int sum = 0 ;
    public void add()
    {
         sum = a + b + c ;
         System.out.println("Addition = " + sum);
    }
    	
      public void sub()
      { 
          sum = a -b;
          System.out.println("subraction = " + sum);
      }
      public void mul()
      {
         sum = a*b;
         System.out.println("Multiplication = "+ sum);
      }
      public void div()
      {
         sum = a/b;
        System.out.println("division = " +sum);
      }
        public static void main(String[] args)
        {
         Calculator operator = new Calculator();
         operator. add();
         operator. sub();
         operator.mul();
         operator.div();
      	}
				
			
		


	    
	}


