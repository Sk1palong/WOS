package me.whitebear.wos.skill.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class SkillSaveRes {

    Long id;
    String name;
    String type;
    String description;
    String value;

    @Builder
    public SkillSaveRes(Long id, String name, String type, String description, String value) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.value = value;
    }
}
