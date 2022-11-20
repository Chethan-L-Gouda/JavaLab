package CS013;

import java.util.Scanner;

public class CnvrtInt {
    Scanner sc = new Scanner(System.in);
    Cnvrter convrt = new Cnvrter();
    CnvrtInt(){
        System.out.println("Welcome to Converter.");
        boolean stop =false;
        int ch1,ch2;
        double val;
        do{
            ch1=0;ch2=0;
            System.out.println("Enter the Choice : \n1.Distance\n2.Time\n3.Currency\n4.Exit");
            ch1=sc.nextInt();

            switch (ch1){
                case 1->{
                    System.out.println("Enter the Choice : \n1.Kilo meter and meter\n2.Kilo meter and mile.");
                    ch2=sc.nextInt();
                    switch (ch2){
                        case 1->{
                            val=getVal();
                            convrt.cnvtKmtoM(val);
                            convrt.cnvtMtoKm(val);
                        }
                        case 2->{
                            val=getVal();
                            convrt.cnvtKmtoMi(val);
                            convrt.cnvtMitoKm(val);
                        }
                        default -> System.out.println("INVALID CHOICE\n");
                    }
                }
                case 2->{
                    System.out.println("Enter the Choice : \n1.Hour and Minute\n2.Hour and Second.");
                    ch2=sc.nextInt();
                    switch (ch2){
                        case 1->{
                            val=getVal();
                            convrt.cnvtHrtoMin(val);
                            convrt.cnvtMintoHr(val);
                        }
                        case 2->{
                            val=getVal();
                            convrt.cnvtHrtoSec(val);
                            convrt.cnvtSectoHr(val);
                        }
                        default -> System.out.println("INVALID CHOICE\n");
                    }

                }
                case 3->{
                    System.out.println("Enter the Choice : \n1.USD and INR\n2.EURO and INR\n3.YEN and INR");
                    ch2=sc.nextInt();
                    switch (ch2){
                        case 1->{
                            val=getVal();
                            convrt.cnvtUSDtoINR(val);
                            convrt.cnvtINRtoUSD(val);
                        }
                        case 2->{
                            val=getVal();
                            convrt.cnvtEUROtoINR(val);
                            convrt.cnvtINRtoEURO(val);
                        }
                        case 3->{
                            val=getVal();
                            convrt.cnvtYENtoINR(val);
                            convrt.cnvtINRtoYEN(val);
                        }
                        default -> System.out.println("INVALID CHOICE\n");
                    }
                }
                case 4->stop=true;
                default -> System.out.println("INVALID CHOICE\n");
            }
        }while (!stop);
    }
    double getVal(){
        double v;
        System.out.println("Enter the value : ");
        System.out.print("=>");v=sc.nextDouble();
        return v;
    }
}
