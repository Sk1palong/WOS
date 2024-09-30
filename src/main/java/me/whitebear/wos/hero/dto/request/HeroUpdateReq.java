package me.whitebear.wos.hero.dto.request;

import lombok.Builder;
import lombok.Getter;

@Getter
public class HeroUpdateReq {

    String name;
    Integer gen;
    String type;

    @Builder
    public HeroUpdateReq(String name, Integer gen, String type) {
        this.name = name;
        this.gen = gen;
        this.type = type;
    }
}
