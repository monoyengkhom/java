import java.lang.*;
import java.util.Scanner;
public class quadratic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        double r1, r2;
        System.out.println("Enter the values of a, b and c: ");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        r1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        r2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("Roots are: "+r1+" "+r2);
    }
}
