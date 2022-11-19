package CS013;
import java.util.Scanner;

public class SimCal {
    Scanner sc = new Scanner(System.in);
    SimCal(){
        double a,b,res;
        int op;
        boolean runStatus=true;

        do{
            res=0;
            System.out.println("Enter the Operation\n1.Add\n2.Sub\n3.Product\n4.Divide\n5.Exit");
            op = sc.nextInt();
            System.out.println("Enter the Values of a and b :");
            a = sc.nextInt();
            b = sc.nextInt();
            switch (op){
                case 1: res = a+b;break;
                case 2: res = a-b;break;
                case 3: res = a*b;break;
                case 4:
                    if(b!=0) res =a/b;
                    else System.out.println("Division by Zero not possible.");
                    break;
                case 5:
                    runStatus=false;break;
                default:
                    System.out.println("INVALID CHOICE.");
            }
            System.out.println("The result of the Operation is : "+res);
        }while (runStatus);
    }
}
