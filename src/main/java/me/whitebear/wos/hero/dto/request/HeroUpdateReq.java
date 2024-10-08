package me.whitebear.wos.hero.dto.request;

import lombok.Builder;
import lombok.Getter;

@Getter
public class HeroUpdateReq {

    String name;
    Integer gen;
    String type;
    String grade;

    @Builder
    public HeroUpdateReq(String name, Integer gen, String type, String grade) {
        this.name = name;
        this.gen = gen;
        this.type = type;
        this.grade = grade;
    }
}
