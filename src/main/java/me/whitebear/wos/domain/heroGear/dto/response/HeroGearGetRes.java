package me.whitebear.wos.domain.heroGear.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class HeroGearGetRes {

    Long HeroGearId;
    String HeroGearName;
    String HeroGearType;
    String HeroGearGrade;

    @Builder
    public HeroGearGetRes(Long HeroGearId, String HeroGearName, String HeroGearType, String HeroGearGrade) {

        this.HeroGearId = HeroGearId;
        this.HeroGearName = HeroGearName;
        this.HeroGearType = HeroGearType;
        this.HeroGearGrade = HeroGearGrade;

    }

}
