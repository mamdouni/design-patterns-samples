package org.java.tutorial.bridge.movies.refinedabstraction;

import lombok.AllArgsConstructor;
import org.java.tutorial.bridge.movies.abstraction.Printer;
import org.java.tutorial.bridge.movies.others.Detail;
import org.java.tutorial.bridge.movies.others.Movie;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class MoviePrinter extends Printer {

    private final Movie movie;

    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();

        details.add(new Detail("Title", movie.title()));
        details.add(new Detail("Year", movie.year()));
        details.add(new Detail("Runtime", movie.runtime()));

        return details;
    }

    @Override
    protected String getHeader() {
        return movie.classification();
    }
}
