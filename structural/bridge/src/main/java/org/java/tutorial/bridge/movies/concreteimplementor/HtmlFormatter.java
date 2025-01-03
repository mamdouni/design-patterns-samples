package org.java.tutorial.bridge.movies.concreteimplementor;

import org.java.tutorial.bridge.movies.implementor.Formatter;
import org.java.tutorial.bridge.movies.others.Detail;

import java.util.List;

public class HtmlFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {

        String template = """
                <table>
                    <th>
                        Classification
                    </th>
                    <th>
                        %s
                    </th>
                    %s
                </table>
                """;

        String htmlDetails = buildHtmlDetails(details);
        return template.formatted(header, htmlDetails);
    }

    private String buildHtmlDetails(List<Detail> details) {
        String htmlTemplate = """
                <tr>
                    <td>
                        %s
                    </td>
                    <td>
                        %s
                    </td>
                </tr>
                """;
        return details.stream().map(detail -> htmlTemplate.formatted(detail.label(), detail.value())).reduce((a, b) -> a + "\n" + b).orElse("");
    }
}
