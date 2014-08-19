package org.myexample.camelissue;

import org.apache.camel.*;
import org.apache.camel.builder.ExchangeBuilder;

public class MyProcessor implements Processor {

    @Produce
    private ProducerTemplate template;

    @Override
    public void process(Exchange exchange) {

        Exchange newExchange =
                template.send("direct:bar", ExchangeBuilder.anExchange(template.getCamelContext())
                        .withBody("hello")
                        .withPattern(ExchangePattern.InOut)
                        .build());

        newExchange.getOut().getBody(String.class);
    }
}
