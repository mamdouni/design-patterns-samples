package org.java.tutorial.bridge.shapes.before;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RedCircle extends Circle {

    @Override
    public void applyColor() {
        log.info("Applying red color");
    }
}
