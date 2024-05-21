package prodconSemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    // Shared queue from which the consumer will consume items
    Queue<Object> queue;
    // Maximum size of the queue
    private int maxSize;
    private Semaphore producer;

    private Semaphore consumer;

    public Consumer(Queue<Object> queue , int maxSize , Semaphore producer , Semaphore consumer){
        this.queue = queue;
        this.maxSize = maxSize;
        this.producer = producer;
        this.consumer = consumer;
    }

    @Override
    public void run() {

        while(true){

            try {
                consumer.acquire();
                if(maxSize > 0){
                    System.out.println("Consuming :(");
                    queue.remove();
                }
            }catch (Exception e ){
                System.out.println(e);
            }

        }

    }
}
