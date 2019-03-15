package study.godofchicken.realworldexample.controllers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import study.godofchicken.realworldexample.common.SpringBootApiTest;
import study.godofchicken.realworldexample.domain.tag.Tag;
import study.godofchicken.realworldexample.domain.tag.TagRepository;
import study.godofchicken.realworldexample.models.ResponseTags;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
public class TagControllerAPITest extends SpringBootApiTest {

    @Autowired
    TagRepository tagRepository;

    @Before
    public void setUp() {
        this.tagRepository.save(Tag.builder().text("Vue.js").build());
        this.tagRepository.save(Tag.builder().text("React.js").build());
    }

    @After
    public void tearDown() {
        this.tagRepository.deleteAll();
    }

    @Test
    public void getTags(){
        ResponseTags resTags = this.restTemplate.getForObject("/api/tags", ResponseTags.class);

        List<String> tagList = Arrays.asList("Vue.js", "React.js");

        assertThat( "returns tags" , resTags.getTags(), is(tagList));
    }

}
