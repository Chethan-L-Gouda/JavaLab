package CS013;

import java.util.Scanner;

public class Staff {
    Scanner sc = new Scanner(System.in);
    protected String StaffID,Name;
    protected long Phone;
    protected float salary;

    void read(){
        System.out.println("Enter the following details : ");
        System.out.println("Enter ID:");
        StaffID = sc.nextLine();
        System.out.println("Enter Name:");
        Name = sc.nextLine();
        System.out.println("Enter Phone:");
        Phone = sc.nextLong();
        System.out.println("Enter Salary ");
        salary= sc.nextFloat();
    }
    void display(){
        System.out.println("Employee details:");
        System.out.println("ID : "+StaffID+"\nName : "+Name+"\nSalary : "+salary+"\nPhone : "+Phone);
    }
}
