package org.java.tutorial.bridge.shapes.after.shapes;

import org.java.tutorial.bridge.shapes.after.Color;
import org.java.tutorial.bridge.shapes.after.Shape;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
