package study.godofchicken.realworldexample.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import study.godofchicken.realworldexample.common.SpringBootMockTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebRestController.class)
public class WebRestControllerTest extends SpringBootMockTest {

    @Autowired
    private WebRestController webRestController;

    @Test
    public void hello() {
        // When
        String greeting = webRestController.hello();

        // Then
        assertThat("", greeting, is("Hello World!!"));
    }
}
