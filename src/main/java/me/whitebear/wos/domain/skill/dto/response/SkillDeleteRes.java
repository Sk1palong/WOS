package me.whitebear.wos.domain.skill.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class SkillDeleteRes {
    Long skillId;
    String skillName;

    @Builder
    public SkillDeleteRes(Long skillId, String skillName) {
        this.skillId = skillId;
        this.skillName = skillName;
    }
}