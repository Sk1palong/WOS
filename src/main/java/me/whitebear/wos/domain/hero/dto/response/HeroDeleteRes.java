package me.whitebear.wos.domain.hero.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class HeroDeleteRes {
    Long heroId;
    String heroName;

    @Builder
    public HeroDeleteRes(Long heroId, String heroName) {
        this.heroId = heroId;
        this.heroName = heroName;
    }
}
