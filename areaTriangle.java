import java.lang.*;
import java.util.Scanner;
public class areaTriangle {
    public static void main(String[] args){
        float a, b, c, s;
        double area;
        System.out.println("Enter the sides of the triangle: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        s = (a + b + c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area is: "+ area);
    }
}
