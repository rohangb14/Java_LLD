package muteX;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{

    private Count count;
    private Lock lock;

    public Adder(Count count ,Lock lock){
        this.count = count;
    }

    @Override
    public void run() {

        for(int i=0; i<100; i++){
            lock.lock();
            count.count +=i;
            lock.unlock();
        }
    }
}
