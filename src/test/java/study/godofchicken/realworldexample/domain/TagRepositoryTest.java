package study.godofchicken.realworldexample.domain;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import study.godofchicken.realworldexample.domain.tag.Tag;
import study.godofchicken.realworldexample.domain.tag.TagRepository;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TagRepositoryTest {

    @Autowired
    TagRepository tagRepository;

    @After
    public void cleanup() {
        tagRepository.deleteAll();
    }

    @Test
    public void SaveAndFind() {
        // Given
        Tag tag = Tag.builder()
                .text("Vue.js")
                .build();
        tagRepository.save(tag);

        // When
        List<Tag> tagList = tagRepository.findAll();

        // Then
        assertNotNull(tagList);
        assertEquals(tagList.size(), 1);
        assertEquals(tagList.get(0).getText(), tag.getText());
    }
}
