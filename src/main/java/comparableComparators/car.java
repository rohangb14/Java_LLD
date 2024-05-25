package comparableComparators;


public class car implements Comparable<car> {

    public int topSpeed;
    public int mileage;

    public car(int topSpeed , int mileage){
        this.topSpeed = topSpeed;
        this.mileage = mileage;
    }

    @Override
    public int compareTo(car o) {
        // Compare cars based on their topSpeed in descending order
        return o.topSpeed - this.topSpeed;

    }

    public String toString(){
        return "Car{" + "topSpeed " + topSpeed + " Mielage " +this.mileage + "}";
    }
}
