package me.whitebear.wos.domain.skill.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class SkillDeleteRes {
    Long id;
    String name;

    @Builder
    public SkillDeleteRes(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
