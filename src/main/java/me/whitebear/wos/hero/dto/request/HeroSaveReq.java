package me.whitebear.wos.hero.dto.request;

import lombok.Builder;
import lombok.Getter;

@Getter
public class HeroSaveReq {
    String name;
    Integer gen;
    String type;

    @Builder
    public HeroSaveReq(String name, Integer gen, String type) {
        this.name = name;
        this.gen = gen;
        this.type = type;
    }
}
