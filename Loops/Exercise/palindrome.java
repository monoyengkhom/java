import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int m = n;
        int rev = 0;
        while (n>0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        System.out.println("The reverse of the number is : "+ rev);
        if(m == rev){
            System.out.println("It is a palindrome number.");
        }
        else{
            System.out.println("It is not a palindrome number.");
        }
    }
}
