package helloWorldPrinter;

//when ever a task needs to be done via separate thread create a class and implement Runnable
public class helloworld implements Runnable{
    @Override

    //When ever we implement Runnable we need to implement run() method.
    public void run() {

        System.out.println("Hey I'm Rohan " +Thread.currentThread().getName());
    }
}
