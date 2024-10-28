package me.whitebear.wos.domain.hero.dto.request;

import lombok.Getter;

@Getter
public class HeroSaveReq {

    String name;
    Integer gen;
    String type;
    String grade;

}
