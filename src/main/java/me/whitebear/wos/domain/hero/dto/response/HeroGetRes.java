package me.whitebear.wos.domain.hero.dto.response;

import lombok.Builder;
import lombok.Getter;
import me.whitebear.wos.domain.hero.store.entity.Hero;

@Getter
public class HeroGetRes {

    Long heroId;
    String heroName;
    Integer gen;
    String type;
    String grade;

    @Builder
    public HeroGetRes(Hero hero) {
        this.heroId = hero.getHeroId();
        this.heroName = hero.getHeroName();
        this.gen = hero.getGen();
        this.type = hero.getType();
        this.grade = hero.getGrade();
    }
}
