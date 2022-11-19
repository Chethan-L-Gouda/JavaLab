package CS013;

public class TeachStf extends Staff {
    private String Domain,Pblic;

    void read(){
        super.read();
        sc.nextLine();
        System.out.println("Enter Domain : ");
        Domain=sc.nextLine();
        System.out.println("Enter Publication : ");
        Pblic=sc.nextLine();
    }
    void display(){
        super.display();
        System.out.println("\nDomain : "+Domain+"\nPublication : "+Pblic);
    }
}
