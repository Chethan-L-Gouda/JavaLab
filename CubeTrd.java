package CS013;

public class CubeTrd implements Runnable{
    private int val;
    CubeTrd(int x){
        val=x;
    }
    @Override
    public void run() {
        System.out.println("CubeThread : The cube of "+val+" is "+Math.pow(val,3));
    }
}
