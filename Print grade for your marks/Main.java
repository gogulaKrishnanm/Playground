import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      if(a>=85)
      {
        System.out.print("A");
      }
      else if(a>=75&&a<85)
      {
        System.out.print("B");
      }
      else if(a>=65&&a<75)
      {
        System.out.print("C");
      }
      else if(a>=55&&a<65)
      {
        System.out.print("D");
      }
      else if(a<45)
      {
        System.out.print("Fail");
      }
    }
}