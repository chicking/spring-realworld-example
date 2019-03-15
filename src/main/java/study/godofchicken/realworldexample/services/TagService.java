package study.godofchicken.realworldexample.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import study.godofchicken.realworldexample.domain.tag.TagRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TagService {

    private TagRepository tagRepository;

    public List<String> tags() {
        return this.tagRepository.findAll()
                .stream()
                .map(tag -> tag.getText())
                .collect(Collectors.toList());
    }

}
