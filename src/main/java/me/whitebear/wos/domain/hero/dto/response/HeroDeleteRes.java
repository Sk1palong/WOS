package me.whitebear.wos.domain.hero.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class HeroDeleteRes {
    Long heroId;
    String name;

    @Builder
    public HeroDeleteRes(Long heroId, String name) {
        this.heroId = heroId;
        this.name = name;
    }
}
