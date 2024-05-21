package IntroToThreads;

public class helloWorldPrinter implements Runnable{

    private int num;


    public helloWorldPrinter(int n){
        num = n;
    }

    @Override
    public void run() {
        System.out.println("Hello !! " + Thread.currentThread().getName());
    }
}
