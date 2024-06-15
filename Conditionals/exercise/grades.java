import java.util.Scanner;
public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1, m2, m3;
        System.out.println("Enter your three subjects marks:");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        float avg = (m1+m2+m3)/3;
        System.out.println(avg);
        if(avg>=70)
         System.out.println("A");
        else if(avg<70 && avg>=60)
         System.out.println("B");
        else if(avg<60 && avg>=50)
         System.out.println("C");
        else if(avg<50 && avg>=40)
         System.out.println("D");
        else
         System.out.println("F");
    }
}
