package me.whitebear.wos.domain.hero.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class HeroSaveRes {

    Long heroId;
    String name;
    Integer gen;
    String type;
    String grade;

    @Builder
    public HeroSaveRes(Long heroId, String name, Integer gen, String type, String grade) {
        this.heroId = heroId;
        this.name = name;
        this.gen = gen;
        this.type = type;
        this.grade = grade;
    }
}
