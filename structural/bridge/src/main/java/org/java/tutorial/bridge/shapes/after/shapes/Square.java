package org.java.tutorial.bridge.shapes.after.shapes;

import org.java.tutorial.bridge.shapes.after.Color;
import org.java.tutorial.bridge.shapes.after.Shape;

public class Square extends Shape {

    // Note that Square is no more an abstract class

    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
