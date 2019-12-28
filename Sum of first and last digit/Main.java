import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Get the n value
	    Scanner in  = new Scanner(System.in);
	    int n = in.nextInt();
        int a=n%10;
		while(n>100)
        {
          n=n/10;
        }
      int b=n/10;
		System.out.print(a+b);
	}
}