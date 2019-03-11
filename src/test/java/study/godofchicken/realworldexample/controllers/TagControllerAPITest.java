package study.godofchicken.realworldexample.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import study.godofchicken.realworldexample.common.SpringBootApiTest;
import study.godofchicken.realworldexample.models.ResponseTags;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
public class TagControllerAPITest extends SpringBootApiTest {

    @Test
    public void getTags(){
        ResponseTags resTags = this.restTemplate.getForObject("/api/tags", ResponseTags.class);

        List<String> tagList = new ArrayList<String>();
        tagList.add("reactjs");
        tagList.add("angularjs");

        assertThat( "returns tags" , resTags.getTags(), is(tagList));
    }

}
