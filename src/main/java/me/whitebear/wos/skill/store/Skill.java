package me.whitebear.wos.skill.store;

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
import me.whitebear.wos.hero.store.entity.Hero;
import me.whitebear.wos.skill.dto.request.SkillUpdateReq;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "skill")
public class Skill {

    /**
     * 컬럼 - 연관관계 컬럼을 제외한 컬럼을 정의합니다.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String type;

    private String description;

    private String value;

    /**
     * 생성자 - 약속된 형태로만 생성가능하도록 합니다.
     */

    @Builder
    private Skill(String name, String type, String description, String value) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.value = value;
    }

    /**
     * 연관관계 - Foreign Key 값을 따로 컬럼으로 정의하지 않고 연관 관계로 정의합니다.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hero_id")
    private Hero hero;

    /**
     * 연관관계 편의 메소드 - 반대쪽에는 연관관계 편의 메소드가 없도록 주의합니다.
     */

    /**
     * 서비스 메소드 - 외부에서 엔티티를 수정할 메소드를 정의합니다. (단일 책임을 가지도록 주의합니다.)
     */

    public void updateSkill(SkillUpdateReq req) {
        this.name = req.getName();
        this.type = req.getType();
        this.description = req.getDescription();
        this.value = req.getValue();
    }
}
