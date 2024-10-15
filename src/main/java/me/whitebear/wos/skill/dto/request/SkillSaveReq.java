package me.whitebear.wos.skill.dto.request;

import lombok.Builder;
import lombok.Getter;

@Getter
public class SkillSaveReq {
    String name;
    String type;
    String description;
    String value;

    @Builder
    public SkillSaveReq(String name, String type, String description, String value) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.value = value;
    }
}
