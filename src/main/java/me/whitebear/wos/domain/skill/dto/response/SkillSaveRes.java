package me.whitebear.wos.domain.skill.dto.response;

import lombok.Builder;
import lombok.Getter;
import me.whitebear.wos.domain.skill.store.entity.Skill;

@Getter
public class SkillSaveRes {

    Long skillId;
    String skillName;
    String type;
    String description;
    String value;
    String widgetName;

    @Builder
    public SkillSaveRes(Skill skill) {

        this.skillId = skill.getSkillId();
        this.skillName = skill.getSkillName();
        this.type = skill.getType();
        this.description = skill.getDescription();
        this.value = skill.getValue();
        this.widgetName = skill.getWidget().getWidgetName();

    }
}
