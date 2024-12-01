package me.whitebear.wos.domain.skill.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class SkillDeleteRes {
    Long skillId;
    String name;

    @Builder
    public SkillDeleteRes(Long skillId, String name) {
        this.skillId = skillId;
        this.name = name;
    }
}
