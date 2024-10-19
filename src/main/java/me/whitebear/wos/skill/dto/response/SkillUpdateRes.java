package me.whitebear.wos.skill.dto.response;

import lombok.Builder;
import lombok.Getter;
import me.whitebear.wos.skill.store.Skill;

@Getter
public class SkillUpdateRes {

    Long id;
    String name;
    String type;
    String description;
    String value;

    @Builder
    public SkillUpdateRes(Skill skill) {
        this.id = skill.getId();
        this.name = skill.getName();
        this.type = skill.getType();
        this.description = skill.getDescription();
        this.value = skill.getValue();
    }
}
