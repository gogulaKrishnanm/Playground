import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt(),b=0;
      for(int i=0;i<=a;i++)
      {
        b+=i;
      }
      System.out.print(b);
	}
}