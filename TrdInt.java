package CS013;

public class TrdInt {
    TrdInt(){
        Thread RNTrd;
        RNTrd=new Thread(new RandomNum());
        RNTrd.start();
    }
}
