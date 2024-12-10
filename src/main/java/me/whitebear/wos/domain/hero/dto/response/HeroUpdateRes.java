package me.whitebear.wos.domain.hero.dto.response;

import lombok.Builder;
import lombok.Getter;
import me.whitebear.wos.domain.hero.store.entity.Hero;

@Getter
public class HeroUpdateRes {

    Long heroId;
    String name;
    Integer gen;
    String type;
    String grade;

    @Builder
    public HeroUpdateRes(Hero hero) {
        this.heroId = hero.getHeroId();
        this.name = hero.getHeroName();
        this.gen = hero.getGen();
        this.type = hero.getType();
        this.grade = hero.getGrade();
    }
}
