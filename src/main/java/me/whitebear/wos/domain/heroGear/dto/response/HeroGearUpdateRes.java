package me.whitebear.wos.domain.heroGear.dto.response;

import lombok.Getter;

@Getter
public class HeroGearUpdateRes {

    Long heroGearId;
    String heroGearName;
    String type;
    String grade;
}
