package CS013;
import java.util.Scanner;
public class Quad {
    Scanner sc = new Scanner(System.in);
    private double r1,r2,iPart,rPart,det,a,b,c;
    Quad(){
        System.out.println("Enter the Co-efficients of the unknown : ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        sc.close();
        if(a==0)
            System.out.println("Since coef of x\u00B2 is 0 it is not a Quadratric equation");
        else{
            det=b*b-4*a*c;
            if(det==0){
                r1 = (-b)/(2*a);
                System.out.println("The roots are real and equal :");
                System.out.println("Root1 = Root2= "+r1);
            }
            else if(det>0){
                r1 = (-b-Math.sqrt(det))/(2*a);
                r2 = (-b+Math.sqrt(det))/(2*a);
                System.out.println("The roots are real and distinct :");
                System.out.println("Root1="+r1+"\nRoot2="+r2);
            }
            else{
                rPart=-b/(2*a);
                iPart=Math.sqrt(-det)/(2*a);
                System.out.println("The roots are Imaginery :");
                System.out.println("Root1="+rPart+"+"+iPart+"i\nRoot2="+rPart+"-"+iPart+"i.");
            }
        }
    }
}
