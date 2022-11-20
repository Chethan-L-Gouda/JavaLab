package CS013;

import java.util.Scanner;

public class Cnvrter {
    Scanner sc = new Scanner(System.in);
    private double val,cVal;
    void cnvtMtoKm(double v){
        val = v;
        cVal = v/1000;
        System.out.println(val+" Meter = "+cVal+" Kilo Meter.");
    }
    void cnvtKmtoM(double v){
        val = v;
        cVal = v*1000;
        System.out.println(val+" Kilo Meter = "+cVal+" Meter.");
    }
    void cnvtKmtoMi(double v){
        val = v;
        cVal = v*0.621;
        System.out.println(val+" Kilo Meter = "+cVal+" Miles");
    }
    void cnvtMitoKm(double v){
        val = v;
        cVal = v*1.609;
        System.out.println(val+" Mile = "+cVal+" Kilo Meter.");
    }
    void cnvtHrtoSec(double v){
        val = v;
        cVal = v*3600;
        System.out.println(val+" Hour = "+cVal+" Sec.");
    }
    void cnvtSectoHr(double v){
        val = v;
        cVal = v/3600;
        System.out.println(val+" Sec = "+cVal+" Hour.");
    }
    void cnvtHrtoMin(double v){
        val = v;
        cVal = v*60;
        System.out.println(val+" Hour = "+cVal+" Minute.");
    }
    void cnvtMintoHr(double v){
        val = v;
        cVal = v/60;
        System.out.println(val+" Minute = "+cVal+" Hour.");
    }
    void cnvtUSDtoINR(double v){
        val = v;
        cVal = v*81.5;
        System.out.println(val+" USD = "+cVal+" INR.");
    }
    void cnvtINRtoUSD(double v){
        val = v;
        cVal = v/81.5;
        System.out.println(val+" INR = "+cVal+" USD.");
    }
    void cnvtEUROtoINR(double v){
        val = v;
        cVal = v*84.35;
        System.out.println(val+" EURO = "+cVal+" INR.");
    }
    void cnvtINRtoEURO(double v){
        val = v;
        cVal = v/84.35;
        System.out.println(val+" INR = "+cVal+" EURO.");
    }
    void cnvtYENtoINR(double v){
        val = v;
        cVal = v*0.58;
        System.out.println(val+" YEN = "+cVal+" INR.");
    }
    void cnvtINRtoYEN(double v){
        val = v;
        cVal = v/0.58;
        System.out.println(val+" INR = "+cVal+" YEN.");
    }
}
