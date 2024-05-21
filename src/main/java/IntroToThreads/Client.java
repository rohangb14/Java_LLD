package IntroToThreads;//package IntroToThreads;
//
//import java.util.concurrent.Executor;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class Client {
//
//    public static void main(String[] args) {
//        //creating a new executor with value of threads as a parameter
//        Executor executor = Executors.newFixedThreadPool(10);
//
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//
////        for(int i = 1; i<=30; i++)
////        {
////            if(i==5 || i==12 || i==15)
////            {
////                System.out.println("Debug");
////            }
////            helloWorldPrinter hw = new helloWorldPrinter(i);
////            //Used to execute the Executor
////            executor.execute(hw);
////        }
////        // Shutting down the Threads.
////        executorService.shutdown();
////    }
////}
//
