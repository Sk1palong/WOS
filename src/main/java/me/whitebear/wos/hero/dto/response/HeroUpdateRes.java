package me.whitebear.wos.hero.dto.response;

import lombok.Builder;
import lombok.Getter;
import me.whitebear.wos.hero.Hero;

@Getter
public class HeroUpdateRes {

    Long id;
    String name;
    Integer gen;
    String type;

    @Builder
    public HeroUpdateRes(Hero hero) {
        this.id = hero.getId();
        this.name = hero.getName();
        this.gen = hero.getGen();
        this.type = hero.getType();
    }
}
