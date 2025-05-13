package me.whitebear.wos.domain.heroGear.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class HeroGearSaveRes {

    String heroGearName;
    String type;
    String grade;

    @Builder
    public HeroGearSaveRes(String heroGearName, String type, String grade) {
        this.heroGearName = heroGearName;
        this.type = type;
        this.grade = grade;
    }

}
