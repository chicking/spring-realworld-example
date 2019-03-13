package study.godofchicken.realworldexample.domain.tag;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Tag {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String text;

    @Builder
    public Tag(String text) {
        this.text = text;
    }
}
