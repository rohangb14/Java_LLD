package comparableComparators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<car> carList = new ArrayList<>();

        carList.add(new car(100,20));
        carList.add(new car(20,30));
        carList.add(new car(50,40));
        carList.add(new car(80,10));
        carList.add(new car(60,14));

        Collections.sort(carList , new milageComparator());

        for(car car : carList){
            System.out.println(car);
        }

    }
}
