import java.lang.*;
import java.util.Scanner;
public class swappingNo {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a, b;
        System.out.println("Enter First Number: ");
        a = s.nextInt();
        System.out.println("Enter Second Number: ");
        b = s.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swapping ");
        System.out.println("First Number: "+a);
        System.out.println("Second Number: "+b);
    }
}
