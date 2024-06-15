import java.lang.*;
import java.util.*;
public class Welcome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name;
        System.out.println("May I know your name: ");
        name = s.next();
        System.out.println("Welcome Mr/Mrs "+ name);
    }
}
