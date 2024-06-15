import java.util.*;
public class Searching {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[]={3,4,5,6,7,2,1};
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        for(int i=0;i<A.length;i++){
            if(A[i]==key){
                System.out.println("The element is found at "+(i+1)+" index.");
                System.exit(0);
            }
        }
        System.out.println("The element "+key+" is not found");
    }
}