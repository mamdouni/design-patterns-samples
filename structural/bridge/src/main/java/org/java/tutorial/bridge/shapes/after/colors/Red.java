package org.java.tutorial.bridge.shapes.after.colors;

import lombok.extern.slf4j.Slf4j;
import org.java.tutorial.bridge.shapes.after.Color;

@Slf4j
public class Red implements Color {

    @Override
    public void applyColor() {
        log.info("Applying red color");
    }
}
