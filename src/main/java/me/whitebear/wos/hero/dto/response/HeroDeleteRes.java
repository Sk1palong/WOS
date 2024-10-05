package me.whitebear.wos.hero.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class HeroDeleteRes {
    Long id;
    String name;

    @Builder
    public HeroDeleteRes(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
