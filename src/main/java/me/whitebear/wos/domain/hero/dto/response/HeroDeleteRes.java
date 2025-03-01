package me.whitebear.wos.domain.hero.dto.response;

import lombok.Builder;
import lombok.Getter;
import me.whitebear.wos.domain.hero.store.entity.Hero;

@Getter
public class HeroDeleteRes {
    Long heroId;
    String heroName;

    @Builder
    public HeroDeleteRes(Hero hero) {

        this.heroId = hero.getHeroId();
        this.heroName = hero.getHeroName();

    }
}
