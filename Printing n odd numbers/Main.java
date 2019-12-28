import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      for(int i=1;i<=a;i++)
      {
        int b=2*i-1;
        System.out.println(b);
      }
	}
}