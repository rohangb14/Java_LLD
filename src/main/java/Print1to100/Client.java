package Print1to100;

public class Client {

    public static void main(String[] args) {

        for(int i=0;i<=10;i++)
        {
            numberPrinter nm = new numberPrinter(i);

            Thread t = new Thread(nm);
            t.start();
        }
    }
}
