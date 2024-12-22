package me.whitebear.wos.domain.skill.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class SkillSaveRes {

    Long skillId;
    String skillName;
    String type;
    String description;
    String value;
    String widgetName;

    @Builder
    public SkillSaveRes(Long skillId, String skillName, String type, String description, String value, String widgetName) {
        this.skillId = skillId;
        this.skillName = skillName;
        this.type = type;
        this.description = description;
        this.value = value;
        this.widgetName = widgetName;
    }
}
