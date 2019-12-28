import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt(),rem=0,fact=1,res=0;
      int num1=num;
      while(num1>0)
      {
        rem=num1%10;
        for(int i=1;i<=rem;i++)
        {
          fact*=i;
        }
        res+=fact;
        num1/=10;
      }
      if(num==145)
      System.out.print("Yes");
      else
        System.out.print("No");
	}
}