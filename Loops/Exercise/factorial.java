import java.lang.*;
import java.util.Scanner;
public class factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int fact = 1, n;
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		for(int i=1; i<=n; i++){
			fact = fact * i;
		}
		System.out.println("The factorial number is " + fact);
	}
}

