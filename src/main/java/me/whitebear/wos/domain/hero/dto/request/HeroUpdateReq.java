package me.whitebear.wos.domain.hero.dto.request;

import lombok.Getter;

@Getter
public class HeroUpdateReq {

    String heroName;
    Integer gen;
    String type;
    String grade;
    Long expeditionAttack;
    Long expeditionDefense;
    Long explorationAttack;
    Long explorationDefense;
    Long explorationHp;

}
