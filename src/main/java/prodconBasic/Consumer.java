package prodconBasic;

import java.util.Queue;

public class Consumer implements Runnable{

    Queue<Object> queue;
    private int maxSize;

    public Consumer(Queue<Object> queue ,int maxSize){
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while(true){

            // We use the synchronized block here to ensure that when a thread checks the queue for elements,
            // it can safely remove an element if one exists. Without synchronization, if the queue is empty and a thread
            // tries to remove an element, it could throw a NoSuchElementException.
            // Synchronization prevents such race conditions.

            synchronized (queue){
                if(queue.size() > 0 ){
                    System.out.println("Consumer");
                    queue.remove();
                }
            }

        }
    }
}
