package me.whitebear.wos.hero.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class HeroGetRes {

    Long id;
    String name;
    Integer gen;
    String type;

    @Builder
    public HeroGetRes(Long id, String name, Integer gen, String type) {
        this.id = id;
        this.name = name;
        this.gen = gen;
        this.type = type;
    }

}
