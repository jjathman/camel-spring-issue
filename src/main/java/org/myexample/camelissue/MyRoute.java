package org.myexample.camelissue;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Two simplistic camel route definitions.
 */
public class MyRoute extends RouteBuilder {

    @Autowired
    private MyProcessor myProcessor;

    @Override
    public void configure() {

        from("direct:foo")
                .process(myProcessor);

        from("direct:bar")
                .to("log:testlog");
    }
}
