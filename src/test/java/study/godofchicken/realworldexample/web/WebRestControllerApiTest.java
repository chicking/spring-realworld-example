package study.godofchicken.realworldexample.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import study.godofchicken.realworldexample.common.SpringBootApiTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
public class WebRestControllerApiTest extends SpringBootApiTest {

    @Test
    public void hello() {
        // When
        String greeting = this.restTemplate.getForObject("/hello", String.class);

        // Then
        assertThat("", greeting, is("Hello World!!"));
    }
}
