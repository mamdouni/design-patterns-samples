package org.java.tutorial.bridge.shapes.before;

public class BridgeShapeBeforeDemo {

    public static void main(String[] args) {

        Circle circle = new RedCircle();
        Square square = new BlueSquare();

        circle.applyColor();
        square.applyColor();

        /*
            As you can see, if you need to add a GreenSquare, you will need to create a new class for it.
            If you need a new Shape, you will need to create a new class for it but also all the Color implementations
            for the Green, Blue and the Blue.
         */
    }
}
