package me.whitebear.wos.domain.widget.store.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.whitebear.wos.domain.hero.store.entity.Hero;
import me.whitebear.wos.domain.skill.store.entity.Skill;
import me.whitebear.wos.global.Timestamped;

@Entity
@Getter
@NoArgsConstructor
public class Widget extends Timestamped {

    /**
     * 컬럼 - 연관관계 컬럼을 제외한 컬럼을 정의합니다.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    /**
     * 생성자 - 약속된 형태로만 생성가능하도록 합니다.
     */
    @Builder
    private Widget(Hero hero, String name) {
        this.hero = hero;
        this.name = name;
    }

    /**
     * 연관관계 - Foreign Key 값을 따로 컬럼으로 정의하지 않고 연관 관계로 정의합니다.
     */
    @OneToMany(mappedBy = "widget", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Skill> skills;

    @OneToOne
    private Hero hero;

    /**
     * 연관관계 편의 메소드 - 반대쪽에는 연관관계 편의 메소드가 없도록 주의합니다.
     */

    /**
     * 서비스 메소드 - 외부에서 엔티티를 수정할 메소드를 정의합니다. (단일 책임을 가지도록 주의합니다.)
     */

}
