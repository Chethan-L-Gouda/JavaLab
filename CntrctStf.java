package CS013;

public class CntrctStf extends Staff{
    private String period;

    void read(){
        super.read();
        sc.nextLine();
        System.out.println("Enter Period : ");
        period = sc.nextLine();
    }
    void display(){
        super.display();
        System.out.println("Period : "+period+"\n");
    }
}
