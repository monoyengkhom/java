import java.util.Scanner;
public class armstrongNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int r = n;
		int armN = 0;
		while(n>0){
			int rn = r % 10;
			armN = (rn * rn * rn) + armN;
		}
		if(armN == n){
			System.out.println("It is an Armstrong Number. ");
		}
		else{
			System.out.println("Is is not an Armstrong Number. ");
		}
	}
}
