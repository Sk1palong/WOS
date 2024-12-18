package me.whitebear.wos.domain.skill.dto.request;

import lombok.Getter;

@Getter
public class SkillSaveReq {

    String skillName;
    String type;
    String description;
    String value;
    Long widgetId;

}