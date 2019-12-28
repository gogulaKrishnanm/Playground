import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt(),b=1;
      for(int i=0;i<a;i++)
      {
        for(int j=0;j<=i;j++)
        {
          if(b%2!=0)
            System.out.print("*");
          else
            System.out.print("#");
          b++;
        }
        System.out.print("\n");
      }
    }
}