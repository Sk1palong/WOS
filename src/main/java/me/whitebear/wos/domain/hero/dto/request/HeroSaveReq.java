package me.whitebear.wos.domain.hero.dto.request;

import lombok.Getter;

@Getter
public class HeroSaveReq {

    String heroName;
    Integer gen;
    String type;
    String grade;
    Long attack;
    Long defense;

}
