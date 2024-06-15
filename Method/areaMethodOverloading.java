public class areaMethodOverloading {
    static double area(double x, double y){
        return x*y;
    }
    static double area(double r){
        return 14.28 * r * r;
    }
    static double area(double x, double y, double z){
        return .5 * (x*y)+z;
    }
    public static void main(String[] args) {
        double c = area(2);
        System.out.println("Area is: "+ c);
    }
}