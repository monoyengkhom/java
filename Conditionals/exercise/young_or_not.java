import java.util.Scanner;
public class young_or_not {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        float age;
        System.out.print("Enter your age: ");
        age = inp.nextFloat();
        if(age>=14 && age<=55){
            System.out.println("Young");
        }
        else if(age<14 || age>55){
            System.out.println("Not young");
        }
    }
}
