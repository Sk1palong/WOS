package me.whitebear.wos.domain.hero.dto.response;

import lombok.Builder;
import lombok.Getter;
import me.whitebear.wos.domain.hero.store.entity.Hero;

@Getter
public class HeroUpdateRes {

    Long heroId;
    String heroName;
    Integer gen;
    String type;
    String grade;
    Long expeditionAttack;
    Long expeditionDefense;
    Long explorationHp;
    Long guardAttack;
    Long guardDefense;
    Long guardHp;

    @Builder
    public HeroUpdateRes(Hero hero) {
        this.heroId = hero.getHeroId();
        this.heroName = hero.getHeroName();
        this.gen = hero.getGen();
        this.type = hero.getType();
        this.grade = hero.getGrade();
        this.expeditionAttack = hero.getExpeditionAttack();
        this.expeditionDefense = hero.getExpeditionDefense();
        this.explorationHp = hero.getExplorationHp();
        this.guardAttack = hero.getGuardAttack();
        this.guardDefense = hero.getGuardDefense();
        this.guardHp = hero.getGuardHp();
    }
}
