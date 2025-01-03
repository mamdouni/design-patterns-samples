package org.java.tutorial.bridge.movies.implementor;

import org.java.tutorial.bridge.movies.others.Detail;

import java.util.List;

public interface Formatter {
    String format(String header, List<Detail> details);
}
