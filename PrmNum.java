package CS013;
import java.util.Scanner;

public class PrmNum {
    PrmNum(){
        int n;
        boolean isPrm=true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        n=sc.nextInt();

        for(int i =2;i<=(n/2);i++){
            if(n%i==0) {
                isPrm = false;
                break;
            }
        }

        if(isPrm) System.out.println(n+" is a Prime number.");
        else System.out.println(n+" is not a Prime number.");
    }
}
