package CS013;

import java.util.Scanner;

public class Stud {
    Scanner sc = new Scanner(System.in);
    private String USN,Name,Branch;
    private long Phone;
    public void read(){
        System.out.println("Enter the Student details : ");
        System.out.println("Enter USN:");
        USN=sc.nextLine();
        System.out.println("Enter Name:");
        Name=sc.nextLine();
        System.out.println("Enter Branch:");
        Branch=sc.nextLine();
        System.out.println("Enter Phone no:");
        Phone=sc.nextLong();
    }
    public void write(){
        System.out.println(USN+"\t"+Name+"\t\t"+Branch+"\t"+Phone);
    }
}
