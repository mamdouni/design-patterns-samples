package org.java.tutorial.bridge.shapes.after;

import org.java.tutorial.bridge.shapes.after.colors.Blue;
import org.java.tutorial.bridge.shapes.after.colors.Red;
import org.java.tutorial.bridge.shapes.after.shapes.Circle;
import org.java.tutorial.bridge.shapes.after.shapes.Square;

public class BridgeShapeAfterDemo {

    public static void main(String[] args) {

        Circle circle = new Circle(
                new Red()
        );
        Square square = new Square(
                new Blue()
        );

        circle.applyColor();
        square.applyColor();

        /*
            If you need now to add a GreenSquare, you will only need to create a new class for the green color.
            But also, if you need a new Shape, you will only need to create a new class Shape for it.
            The colors references exists already and they are reusable.
            Note that any change on the Shape or Color classes will not affect the other classes.
         */
    }
}
