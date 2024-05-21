package Print1to100;

public class numberPrinter implements Runnable{
    
    private int num;


    public numberPrinter(int n){
        num = n;
    }
    @Override
    public void run() {

        System.out.println("Printing : " +num + "from Thread " +Thread.currentThread().getName());

    }
}
