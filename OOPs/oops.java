class Circle
{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }
    public double circumference(){
        return perimeter();
    }
}
public class oops {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 7;
        System.out.println("Area is "+c1.area());
        System.out.println("Perimeter is "+c1.perimeter());
        System.out.println("Circumference is "+c1.circumference());
    }

}
