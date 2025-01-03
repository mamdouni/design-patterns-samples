package org.java.tutorial.bridge.movies;

import lombok.extern.slf4j.Slf4j;
import org.java.tutorial.bridge.movies.abstraction.Printer;
import org.java.tutorial.bridge.movies.implementor.Formatter;
import org.java.tutorial.bridge.movies.concreteimplementor.HtmlFormatter;
import org.java.tutorial.bridge.movies.concreteimplementor.DefaultFormatter;
import org.java.tutorial.bridge.movies.concreteimplementor.JsonFormatter;
import org.java.tutorial.bridge.movies.others.Movie;
import org.java.tutorial.bridge.movies.refinedabstraction.MoviePrinter;

@Slf4j
public class BridgeMoviesDemo {

    public static void main(String[] args) {

        Movie movie = new Movie(
                "Action",
                "John Wick",
                "2:15",
                "2014"
        );

        Printer moviePrinter = new MoviePrinter(movie); // refined abstraction

        Formatter printFormatter = new DefaultFormatter(); // implementation
        log.info(moviePrinter.print(printFormatter));


        Formatter htmlFormatter = new HtmlFormatter(); // implementation
        log.info(moviePrinter.print(htmlFormatter));

        Formatter jsonFormatter = new JsonFormatter(); // implementation
        log.info(moviePrinter.print(jsonFormatter));
    }
}
