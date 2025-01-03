package org.java.tutorial.bridge.shapes.after;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Shape {

    protected Color color;

    abstract public void applyColor();
}
