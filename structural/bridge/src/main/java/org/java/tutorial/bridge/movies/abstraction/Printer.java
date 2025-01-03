package org.java.tutorial.bridge.movies.abstraction;

import org.java.tutorial.bridge.movies.implementor.Formatter;
import org.java.tutorial.bridge.movies.others.Detail;

import java.util.List;

public abstract class Printer {

    public String print (Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    abstract protected List<Detail> getDetails();
    abstract protected String getHeader();

}
