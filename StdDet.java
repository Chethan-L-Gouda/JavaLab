package CS013;

import java.util.Scanner;

public class StdDet {
    Scanner sc = new Scanner(System.in);
    private int n;
    StdDet(){
        System.out.println("Enter the Number of Entries : ");
        n=sc.nextInt();
        Stud [] std = new Stud[n];
        for(int i=0;i<n;i++){
            std[i] = new Stud();
            std[i].read();
        }
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("USN\t\tName\t\tBranch\tPhone");
        for(int i=0;i<n;i++){
            std[i].write();
        }
    }
}
