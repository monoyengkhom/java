import java.util.Scanner;
public class mutliply {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("Enter a number: ");
    n = sc.nextInt();
    for(int i=1,j=1;i<=10;i++,j=n*i){
        System.out.println(n + " * " + i + " = "+ j);
    }
 }
}
