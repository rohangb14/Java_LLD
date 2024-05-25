package genericBound;

import java.awt.*;

public class Client {

    public static void main(String[] args) {

//         Anything which is shape and child of shape only that is Expected here if not it
//         throws below error
//         java: type argument java.lang.String is not within bounds of type-variable E
//        shapeCommand<String> shapeCommand = new shapeCommand<String>();

        shape shape = new shape();
        shape.shapeName = "Hello I'm shape";

        square square = new square();
        square.shapeName = "I'm square";

        circle circle = new circle();
        circle.shapeName = "I'm circle";

        shapeCommand<shape> shapeCommand = new shapeCommand<>();
        shapeCommand.printShape(shape);

        shapeCommand<square> shapeCommand1 = new shapeCommand<>();
        shapeCommand1.printShape(square);

        shapeCommand<circle> shapeCommand2 = new shapeCommand<>();
        shapeCommand2.printShape(circle);

    }
}
