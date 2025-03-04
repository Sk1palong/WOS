package me.whitebear.wos.domain.skill.dto.response;

import lombok.Builder;
import lombok.Getter;
import me.whitebear.wos.domain.skill.store.entity.Skill;

@Getter
public class SkillDeleteRes {

    Long skillId;
    String skillName;

    @Builder
    public SkillDeleteRes(Skill skill) {

        this.skillId = skill.getSkillId();
        this.skillName = skill.getSkillName();

    }
}