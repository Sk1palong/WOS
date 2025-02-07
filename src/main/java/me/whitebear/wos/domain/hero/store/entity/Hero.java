package me.whitebear.wos.domain.hero.store.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.whitebear.wos.domain.hero.dto.request.HeroSaveReq;
import me.whitebear.wos.domain.hero.dto.request.HeroUpdateReq;
import me.whitebear.wos.domain.skill.store.entity.Skill;
import me.whitebear.wos.domain.widget.store.entity.Widget;
import me.whitebear.wos.global.Timestamped;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "hero")
public class Hero extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long heroId;

    /**
     * 컬럼 - 연관관계 컬럼을 제외한 컬럼을 정의합니다.
     */
    private String heroName;

    private Integer gen;

    private String type;

    private String grade;

    private Long expeditionAttack;

    private Long expeditionDefense;

    private Long explorationAttack;

    private Long explorationDefense;

    private Long explorationHp;

    private Long guardAttack;

    private Long guardDefense;

    private Long guardHp;


    /**
     * 생성자 - 약속된 형태로만 생성가능하도록 합니다.
     */

    @Builder
    private Hero(HeroSaveReq req) {
        this.heroName = req.getHeroName();
        this.gen = req.getGen();
        this.type = req.getType();
        this.grade = req.getGrade();
        this.expeditionAttack = req.getExpeditionAttack();
        this.expeditionDefense = req.getExpeditionDefense();
        this.explorationAttack = req.getExplorationAttack();
        this.explorationDefense = req.getExplorationDefense();
        this.explorationHp = req.getExplorationHp();
        this.guardAttack = req.getGuardAttack();
        this.guardDefense = req.getGuardDefense();
        this.guardHp = req.getGuardHp();
    }

    /**
     * 연관관계 - Foreign Key 값을 따로 컬럼으로 정의하지 않고 연관 관계로 정의합니다.
     */
    @OneToMany(mappedBy = "hero", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Skill> skills = new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY)
    private Widget widget;

    /**
     * 연관관계 편의 메소드 - 반대쪽에는 연관관계 편의 메소드가 없도록 주의합니다.
     */

    /**
     * 서비스 메소드 - 외부에서 엔티티를 수정할 메소드를 정의합니다. (단일 책임을 가지도록 주의합니다.)
     */

    public void updateHero(HeroUpdateReq req) {

        this.heroName = req.getHeroName();
        this.gen = req.getGen();
        this.type = req.getType();
        this.grade = req.getGrade();
        this.expeditionAttack = req.getExpeditionAttack();
        this.expeditionDefense = req.getExpeditionDefense();
        this.explorationAttack = req.getExplorationAttack();
        this.explorationDefense = req.getExplorationDefense();
        this.explorationHp = req.getExplorationHp();
        this.guardAttack = req.getGuardAttack();

    }
}
