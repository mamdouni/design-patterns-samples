package org.java.tutorial.bridge.shapes.before;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BlueSquare extends Square {

    @Override
    public void applyColor() {
        log.info("Applying blue color");
    }
}
