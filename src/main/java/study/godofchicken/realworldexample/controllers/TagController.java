package study.godofchicken.realworldexample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.godofchicken.realworldexample.models.ResponseTags;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TagController {


    /**
     * { "tags": [
     * "reactjs",
     * "angularjs"
     * ]
     * }
     */
    @GetMapping("/api/tags")
    public ResponseTags tags() {
        ResponseTags resTags = new ResponseTags();

        List<String> tagList = new ArrayList<String>();
        tagList.add("reactjs");
        tagList.add("angularjs");

        resTags.setTags(tagList);

        return resTags;
    }

}
