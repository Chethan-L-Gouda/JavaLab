package CS013;
import java.util.Scanner;

public class MCOvrlding {
    private String Name;
    Scanner sc = new Scanner(System.in);
    MCOvrlding(){
        System.out.println("Enter name : ");
        Name = sc.nextLine();

    }
    MCOvrlding(String N){
        this.Name=N;
        System.out.println("Hello,"+Name);
    }

    void add(){
        int a,b;
        System.out.println("Enter the values to add.");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
    }
    void add(int a,int b){
        System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
    }
}
