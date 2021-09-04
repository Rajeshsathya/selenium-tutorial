package week1.day1;

public class primeNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
   int num=2,count=0; 
   for (int i = 2; i < num; i++) 
   {
	   if(num%i==0) 
	   {
		   count=count+1;	
	   }
   }
   if (count>0)
   {
	   System.out.println("not a prime");
   }
   else
   {
	   System.out.println("prime");
   }
	
	
	}

}
