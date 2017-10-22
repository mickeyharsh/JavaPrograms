import java.util.Scanner;
class TestEvenOdd
{
	public static void main(String args[])
  	{
    		double num;
    		System.out.println("Enter an Integer number:");
    		Scanner input = new Scanner(System.in);
    		num = input.nextDouble();
		if(num>0)
    		{
    			if ( num % 2 == 0 )
        			System.out.println("Entered number is even");
    			else
        			System.out.println("Entered number is odd");
		}
		else
		{
			System.out.println("The number you is entered is negative!!");
		}
		try 
		{
			if(num%1!=0)
			{
				throw new Exception();
			}

		} 
		catch (Exception e)
		{
			System.out.println("Real Number exception"+e);
		}
		
		
	}
}