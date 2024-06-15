import java.lang.*;
import java.util.Scanner;
public class areaTriangleBase {
    public static void main(String[] args) {
        float base, height, area;
        System.out.print("Enter base and height: ");
        Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        height = sc.nextFloat();
        area = (base * height)/2;
        System.out.print("Area of triangle is: " + area);
    }
}
