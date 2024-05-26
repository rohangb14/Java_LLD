package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {

    public static void main(String[] args) {
         printElements();
         squareElements();
         MappingOperation();
         FilterOperation();
         ReduceOperation();
         FindFirstOpetations();
         Collectors();
    }

    // Method to print all elements of a list using a stream
    public static void printElements(){

        List<Integer> list  = List.of(1 , 2, 3, 4, 5, 6);
        Stream<Integer> stream = list.stream();

        stream.forEach((ele) -> {
            System.out.print(ele + " ");
        });
    }

    // Method to print the square of each element in the list using a stream
    public static void squareElements(){

        List<Integer> list = List.of(1,2,3,4,5,6);
        Stream<Integer> stream = list.stream();
        stream.forEach((ele) ->{
            System.out.print(ele * ele + " ");
        });
    }

    // Method to map each element to its square and then print it using a stream
    public static void MappingOperation(){

        List<Integer> list = List.of(1,2,3,4,5,6);
        Stream<Integer> stream = list.stream();

        stream.map((ele) -> ele * ele)
                .forEach((ele) ->{
                    System.out.print(ele + " ");
                });
    }

    // Method to filter even numbers, map them to their squares, and print them using a stream
    public static void FilterOperation(){

        List<Integer> list = List.of(1 ,2 ,3 ,4 ,5 ,6,7,8,9);
        Stream<Integer> stream = list.stream();

        stream.filter((ele) -> ele % 2 ==0)
                .map((ele) -> ele * ele)
                .forEach((ele) -> {
                    System.out.println(ele);
                });
    }

    // Method to sum all elements of the list using the reduce terminal operation
    public static void ReduceOperation(){

//        List<Integer> list = List.of(1, 2, 3, 4,5, 6);
//        Stream<Integer> stream = list.stream();
//
//         if we use the var inside a stream which is declared outside the stream
//         throws error - java: local variables referenced from a lambda expression must be final or effectively final
//
//        int sum = 0; // not allowed to update this inside lambda
//        list.stream().forEach((ele) -> {
//            sum += ele;
//        });

        //we use Terminal operation Reduce();
        List<Integer> list = Arrays.asList(1 , 2, 3, 4 ,5 ,6);

        int add = list.stream().reduce(0,(sum ,ele) -> {
            return sum +=ele;
        });

        System.out.println("Sum of elements is " +add);

    }

    // Method to find the first element after mapping the elements to their squares and print them
    public static void FindFirstOpetations(){
        List<Integer> list= List.of(1 ,2 ,3 ,4 ,5, 6,7);
        Stream<Integer> stream = list.stream();

        stream.map((ele)-> {
            System.out.println(ele);
            return ele* ele;
        }).findFirst(); // This will only print the first element, as findFirst() is a terminal operation
    }

    // Method to collect elements that are even, map them to their squares, and collect them into a new list
    public static void Collectors(){

        List<Integer> list = List.of(1,2,3,4,5,6);

        // The filter operation selects only even elements, the map operation squares them,
        // and the collect operation collects them into a new list
        List<Integer> modifiedList = list.stream()
                .filter((ele) -> ele % 2 == 0)
                .map((ele) -> ele * ele)
                .collect(Collectors.toList());
        System.out.println("Collected modified list: " + modifiedList);

    }



}
