package me.whitebear.wos.domain.skill.store.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.whitebear.wos.domain.skill.dto.request.SkillSaveReq;
import me.whitebear.wos.domain.skill.dto.request.SkillUpdateReq;
import me.whitebear.wos.domain.hero.store.entity.Hero;
import me.whitebear.wos.domain.widget.store.entity.Widget;
import me.whitebear.wos.global.Timestamped;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "skill")
public class Skill extends Timestamped {

    /**
     * 컬럼 - 연관관계 컬럼을 제외한 컬럼을 정의합니다.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skillId;

    private String skillName;

    private String type;

    private String description;

    private String value;

    /**
     * 생성자 - 약속된 형태로만 생성가능하도록 합니다.
     */

    @Builder
    private Skill(Hero hero, Widget widget, SkillSaveReq req) {
        this.hero = hero;
        this.widget = widget;
        this.skillName = req.getSkillName();
        this.type = req.getType();
        this.description = req.getDescription();
        this.value = req.getValue();
    }

    /**
     * 연관관계 - Foreign Key 값을 따로 컬럼으로 정의하지 않고 연관 관계로 정의합니다.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hero_id")
    private Hero hero;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "widget_id")
    private Widget widget;

    /**
     * 연관관계 편의 메소드 - 반대쪽에는 연관관계 편의 메소드가 없도록 주의합니다.
     */

    /**
     * 서비스 메소드 - 외부에서 엔티티를 수정할 메소드를 정의합니다. (단일 책임을 가지도록 주의합니다.)
     */

    public void updateSkill(SkillUpdateReq req) {
        this.skillName = req.getSkillName();
        this.type = req.getType();
        this.description = req.getDescription();
        this.value = req.getValue();
    }
}
