package me.whitebear.wos.skill.service;

import lombok.RequiredArgsConstructor;
import me.whitebear.wos.skill.dto.request.SkillSaveReq;
import me.whitebear.wos.skill.dto.response.SkillSaveRes;
import me.whitebear.wos.skill.store.Skill;
import me.whitebear.wos.skill.store.SkillRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SkillService {

    private final SkillRepository skillRepository;

    public SkillSaveRes saveSkill(SkillSaveReq req) {
        Skill skill = Skill.builder()
            .name(req.getName())
            .type(req.getType())
            .description(req.getDescription())
            .value(req.getValue())
            .build();

        skillRepository.save(skill);

        SkillSaveRes res = SkillSaveRes.builder()
            .id(skill.getId())
            .name(skill.getName())
            .type(skill.getType())
            .description(skill.getDescription())
            .value(skill.getValue())
            .build();

        return res;
    }
}
