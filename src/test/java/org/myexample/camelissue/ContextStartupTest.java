package org.myexample.camelissue;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.javaconfig.CamelConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * A test that simply starts up the spring context.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = {ContextStartupTest.Context.class})
public class ContextStartupTest {


    @Test
    public void testContext()  {
        // nothing to test, as long as the context starts up fine

    }

    /**
     * The spring context definition.
     */
    public static class Context extends CamelConfiguration {

        @Bean
        public MyProcessor processor() {
            return new MyProcessor();
        }

        @Bean
        public RouteBuilder route() {
            return new MyRoute();
        }

    }

}
