package CS013;

import java.util.Scanner;

public class StaffDet {
    Scanner sc = new Scanner(System.in);
    StaffDet(){
        int nTeach,nTech,nCont;
        int cTeach=0,cTech=0,cCont=0,i,ch;
        boolean compSts=false;
        System.out.println("Enter the number of Teaching Staff : ");
        nTeach=sc.nextInt();
        TeachStf [] teach = new TeachStf[nTeach];

        System.out.println("Enter the number of Technical Staff : ");
        nTech=sc.nextInt();
        TechStf [] tech = new TechStf[nTech];

        System.out.println("Enter the number of Contract Staff : ");
        nCont=sc.nextInt();
        CntrctStf [] cont = new CntrctStf[nCont];
        //Creating the objects of the Class and reading input.
        System.out.println("Enter the Staff details : ");
        do{
            System.out.println("\n1.Teaching Staff\n2.Technical Staff\n3.Contract Staff\n4.Done.");
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    for (i = 0; i < nTeach; i++) {
                        System.out.println("Enter the Teaching Staff details(" + (cTeach + 1 )+ "):\n");
                        teach[i] = new TeachStf();
                        teach[i].read();
                        cTeach++;
                    }
                }
                case 2 -> {
                    for (i = 0; i < nTech; i++) {
                        System.out.println("Enter the Technical Staff details(" + (cTech + 1) + "):\n");
                        tech[i] = new TechStf();
                        tech[i].read();
                        cTech++;
                    }
                }
                case 3 -> {
                    for (i = 0; i < nCont; i++) {
                        System.out.println("Enter the Contrant Staff details(" + (cCont + 1) + "):\n");
                        cont[i] = new CntrctStf();
                        cont[i].read();
                        cCont++;
                    }
                }
                case 4 -> compSts = true;
                default -> System.out.println("INVALID CHOICE.\n");
            }
        }while (!compSts);

        //Display the Staff details.

        System.out.println("----------|Staff Details|----------\n");
        if(cTeach>0){
            System.out.println("----------|Teaching Staff Details|----------\n");
            for (i=0;i<cTeach;i++)
                teach[i].display();
        }
        System.out.println();

        if(cTech>0){
            System.out.println("----------|Technical Staff Details|----------\n");
            for (i=0;i<cTech;i++)
                tech[i].display();
        }
        System.out.println();

        if(cCont>0){
            System.out.println("----------|Teaching Staff Details|----------\n");
            for (i=0;i<cCont;i++)
                cont[i].display();
        }
        System.out.println();
        System.out.println("---------------------------------------\n");
    }
}
