package me.whitebear.wos.hero.dto.response;

import lombok.Builder;
import lombok.Getter;
import me.whitebear.wos.hero.store.entity.Hero;

@Getter
public class HeroUpdateRes {

    Long id;
    String name;
    Integer gen;
    String type;
    String grade;

    @Builder
    public HeroUpdateRes(Hero hero) {
        this.id = hero.getId();
        this.name = hero.getName();
        this.gen = hero.getGen();
        this.type = hero.getType();
        this.grade = hero.getGrade();
    }
}
