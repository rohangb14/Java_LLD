package helloWorldPrinter;

public class Client {

    public static void main(String[] args) {

        //Creating a object for helloworld
        helloworld hw = new helloworld();
        //this call invokes the helloworld class and prints
        //"Hey I'm Rohan main"
        //"SOP    +   ThreadName"
        hw.run();

        //Creating a new thread and passing the object of helloworld(hw)
        Thread th = new Thread(hw);

        //Starting the new thread.
        th.start();

        //This prints Thread name
        System.out.println(Thread.currentThread().getName());
        //"Hey I'm Rohan Thread-0"
    }
}
