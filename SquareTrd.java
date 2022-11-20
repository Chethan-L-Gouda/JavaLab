package CS013;

public class SquareTrd implements Runnable{
    private int val;
    SquareTrd(int x){
        val=x;
    }
    @Override
    public void run() {
        System.out.println("SquareThread : The Square of "+val+" is "+Math.pow(val,2));
    }
}
