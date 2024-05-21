package muteX;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {

   private Count count;
   private Lock lock;
   public Subtractor(Count count , Lock lock)
   {
       this.count = count;

   }


    @Override
    public void run() {

       for(int i=0; i<1000 ; i++)
       {
           lock.lock();
           count.count-=i;
           lock.unlock();
       }
    }
}
