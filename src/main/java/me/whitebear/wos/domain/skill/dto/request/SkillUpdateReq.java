package me.whitebear.wos.domain.skill.dto.request;

import lombok.Getter;

@Getter
public class SkillUpdateReq {

    String name;
    String type;
    String description;
    String value;

}
