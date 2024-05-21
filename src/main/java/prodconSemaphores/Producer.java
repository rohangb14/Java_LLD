package prodconSemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    Queue<Object> queue;
    private int mazSize;
    private Semaphore producer;
    private Semaphore consumer;

    public Producer(Queue<Object> queue , int mazSize , Semaphore producer , Semaphore consumer){
        this.queue = queue;
        this.mazSize = mazSize;
        this.producer = producer;
        this.consumer = consumer;
    }

    @Override
    public void run() {

    while(true){
            try{
                producer.acquire();
                if(queue.size() < mazSize){
                    System.out.println("Producing :)");
                    queue.add(new Object());
                }
                consumer.release();
            }catch (Exception e){
                System.out.println(e);
            }

    }

    }
}
