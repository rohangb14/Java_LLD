package comparableComparators;

import java.util.Comparator;

public class milageComparator implements Comparator<car> {


    @Override
    public int compare(car o1, car o2) {
       return o2.mileage - o1.mileage;
    }
}
