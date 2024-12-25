package me.whitebear.wos.domain.skill.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class SkillGetRes {

    Long skillId;
    String skillName;
    String type;
    String description;
    String value;

    @Builder
    public SkillGetRes(Long skillId, String skillName, String type, String description, String value) {
        this.skillId = skillId;
        this.skillName = skillName;
        this.type = type;
        this.description = description;
        this.value = value;
    }
}
