package CS013;

public class TechStf extends Staff {
    private String skills;

    void read(){
        super.read();
        sc.nextLine();
        System.out.println("Enter Skills : ");
        skills=sc.nextLine();
    }
    void display(){
        super.display();
        System.out.println("Skills : "+skills+"\n");
    }
}
