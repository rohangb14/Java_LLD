package LambdaownInterface;

public class Client {

    public static void main(String[] args) {

        MathOperations mathOperations = new Addops();
        int addRes =  mathOperations.ops(1 , 3);
        System.out.println("Adding two numbers --> " +addRes);

        // Perform subtraction using a lambda expression
        int subRes = executeOps(19 , 2 ,(a, b )->{
            return a - b;
        });

        System.out.println("Subtracting two numbers --> " +subRes);

        // Perform multiplication using a lambda expression
        int mulRes = executeOps(2 , 3 , (a , b) -> {
           return  a * b;
        });

        System.out.println("Multiplying two numbers --> " +mulRes);

    }

    public static int executeOps(int a , int b , MathOperations mathOperations){
        return mathOperations.ops(a , b);
    }
}
