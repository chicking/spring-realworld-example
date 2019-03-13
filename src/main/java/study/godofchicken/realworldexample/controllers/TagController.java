package study.godofchicken.realworldexample.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.godofchicken.realworldexample.models.ResponseTags;
import study.godofchicken.realworldexample.services.TagService;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class TagController {

    private TagService tagService;

    @GetMapping("/api/tags")
    public ResponseTags tags() {
        ResponseTags resTags = new ResponseTags();

        List<String> tags = tagService.tags();

        resTags.setTags(tags);

        return resTags;
    }

}
