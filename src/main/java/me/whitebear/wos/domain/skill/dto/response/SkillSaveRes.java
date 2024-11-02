package me.whitebear.wos.domain.skill.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class SkillSaveRes {

    Long id;
    String name;
    String type;
    String description;
    String value;
    String widget;

    @Builder
    public SkillSaveRes(Long id, String name, String type, String description, String value, String widget) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.value = value;
        this.widget = widget;
    }
}
