package itetratorIterable;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class client {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        //Syntatic sugar but when it is compiled it uses itetrator:
//
//        for(Integer i : list){
//            System.out.println("Printing again " +i);
//        }

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(new Product("A"));
        shoppingCart.addProduct(new Product("B"));
        shoppingCart.addProduct(new Product("C"));
        shoppingCart.addProduct(new Product("D"));

        Iterator<Product> iterator= shoppingCart.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        Iterator<Product> iterator1  = shoppingCart.iterator();
//                while(iterator1.hasNext()){
//                    System.out.println(iterator1.hasNext());
//                }

        for(Product product : shoppingCart){
            System.out.println(product);
        }






    }
}
