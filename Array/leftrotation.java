import java.util.*;
public class leftrotation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A[] = {4,6,2,9,5,3};
        int temp;
        System.out.println("Actual Array");
        for(int x:A){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Enter L for left rotation.\nEnter R for Right Rotation.\n");
        s.nextLine();
        String r = s.nextLine();
        if(r == "l"){
            temp = A[0];
            for(int i=1;i<A.length;i++){
                A[i-1] = A[i];
            }
            A[A.length-1]=temp;
            System.out.println("After Left Rotation");
            for(int x:A){
                System.out.print(x+" ");
            }
            System.out.println();    
        }
        else{
            temp = A[A.length-1];
            for(int i=A.length-1;i>=0;i--){
                A[i+1]=A[i];
            }
            A[0]=temp;
            System.out.println("After Right Rotation");
            for(int x:A){
                System.out.println(x+" ");
            }
            System.out.println();
        }
    }
}
