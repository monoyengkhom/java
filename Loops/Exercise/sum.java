import java.util.Scanner;
public class sum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n, tot;
		tot = 0;
		System.out.println("Enter the last number: ");
		n = sc.nextInt();
		for(int i=1; i<=n; i++){
			tot = tot + i;
		}
		System.out.println("The sum of " + n + " numbers is "+ tot);
	}
}

