import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt(),res=0;
      while(num>0)
      {
        res+=num%10;
        num/=10;
      }
      System.out.print(res);
	}
}