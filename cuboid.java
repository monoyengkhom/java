import java.util.Scanner;
public class cuboid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l, b, h;
        int tolArea, volume;
        System.out.println("Enter the length breadth and height: ");
        l = s.nextInt();
        b = s.nextInt();
        h = s.nextInt();
        tolArea = 2 * ((l*b)+(b*h)+(h*l));
        volume = l*b*h;
        System.out.println("Area of the cuboid is: "+tolArea);
        System.out.println("Volume of the cuboid is: "+volume);
    }
}
