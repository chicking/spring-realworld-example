package study.godofchicken.realworldexample.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;
import study.godofchicken.realworldexample.domain.tag.Tag;
import study.godofchicken.realworldexample.domain.tag.TagRepository;
import study.godofchicken.realworldexample.services.TagService;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TagServiceTest {

    @Autowired
    TagRepository tagRepository;

    @Autowired
    TagService tagService;

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
    public void tags() {
        List<String> tags = tagService.tags();

        assertNotNull(tags);
        assertEquals(tags, Arrays.asList("Vue.js", "React.js"));
    }
}
