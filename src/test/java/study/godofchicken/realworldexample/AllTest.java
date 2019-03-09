package study.godofchicken.realworldexample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import study.godofchicken.realworldexample.web.WebRestControllerApiTest;
import study.godofchicken.realworldexample.web.WebRestControllerTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        WebRestControllerTest.class,
        WebRestControllerApiTest.class
})
public class AllTest {
}
