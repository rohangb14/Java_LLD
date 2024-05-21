package syncIntro;

public class main {

    public static void main(String[] args) throws InterruptedException {

        // We had to create a separate count class instead of //int count = 0//
        // as Java is pass by value only. Count would be pass 0 but not the memory address.

        Count count = new Count(); // here the memory address is passed here.

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        System.out.println(count.count);

    }
}
