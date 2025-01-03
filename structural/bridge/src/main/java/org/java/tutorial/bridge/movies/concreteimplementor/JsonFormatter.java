package org.java.tutorial.bridge.movies.concreteimplementor;

import org.java.tutorial.bridge.movies.implementor.Formatter;
import org.java.tutorial.bridge.movies.others.Detail;

import java.util.List;

public class JsonFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {

        String jsonTemplate = """
                {
                    "header": "%s",
                    "details": [
                    %s
                    ]
                }
                """;
        String detailsJson = buildJsonDetails(details);
        return jsonTemplate.formatted(header, detailsJson);
    }

    private String buildJsonDetails(List<Detail> details) {
        String jsonTemplate = """
                {
                    "label": "%s",
                    "value": "%s"
                }
                """;
        return details.stream()
                .map(detail -> jsonTemplate.formatted(detail.label(), detail.value())).reduce((a, b) -> a + ",\n" + b).orElse("");
    }
}
