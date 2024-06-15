import java.util.Scanner;

public class armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, m;
        int  sum = 0;
        System.out.print("Enter the integers: ");
        n = sc.nextInt();
        m = n;
        while(n>0){
            int r = n % 10;
            sum = sum + r * r * r;
            n = n / 10;
        }
        System.out.println("The sum of the cube of each digit is : "+ sum);
        if(sum == m){
            System.out.println("It is an armstrong number.");
        }
        else{
            System.out.println("It is not an armstrong number.");
        }
    }
}