package CS013;

import java.util.Random;

public class RandomNum implements Runnable{
    private int num,loop=0;
        Random r;
        Thread CbThrd,SqThrd;
    @Override
    public void run() {
        r = new Random();
        while (loop<10){
            num = r.nextInt(50);
            System.out.println("\n------------------------------");
            System.out.println("Random Number Thread : Generated random number is "+num);
            SqThrd=new Thread(new SquareTrd(num));
            CbThrd=new Thread(new CubeTrd(num));
            SqThrd.start();
            CbThrd.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("------------------------------\n");
            loop++;
        }
    }
}
