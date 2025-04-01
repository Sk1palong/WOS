package me.whitebear.wos.domain.skill.dto.response;

import lombok.Builder;
import lombok.Getter;
import me.whitebear.wos.domain.skill.store.entity.Skill;

@Getter
public class SkillUpdateRes {

    Long skillId;
    String skillName;
    String type;
    String description;
    String value;

    @Builder
    public SkillUpdateRes(Skill skill) {

        this.skillId = skill.getSkillId();
        this.skillName = skill.getSkillName();
        this.type = skill.getType();
        this.description = skill.getDescription();
        this.value = skill.getValue();

    }

}