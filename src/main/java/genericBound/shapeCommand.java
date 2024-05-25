package genericBound;

//E extends shape
public class shapeCommand <E extends shape>{

    public void printShape(E shape){
        System.out.println(shape.shapeName);

    }
}
