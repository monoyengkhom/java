import java.util.Scanner;
public class odd_even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter a number: ");
        a = sc.nextInt();
        if(a%2==0){
            System.out.println("It is a even number.");
        }
        else{
            System.out.println("It is a odd number.");
        }
    }
}
