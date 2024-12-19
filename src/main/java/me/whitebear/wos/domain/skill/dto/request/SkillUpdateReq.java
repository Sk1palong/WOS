package me.whitebear.wos.domain.skill.dto.request;

import lombok.Getter;

@Getter
public class SkillUpdateReq {

    String skillName;
    String type;
    String description;
    String value;

}
