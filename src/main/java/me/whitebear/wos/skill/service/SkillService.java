package me.whitebear.wos.skill.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import me.whitebear.wos.skill.dto.request.SkillSaveReq;
import me.whitebear.wos.skill.dto.request.SkillUpdateReq;
import me.whitebear.wos.skill.dto.response.SkillGetRes;
import me.whitebear.wos.skill.dto.response.SkillSaveRes;
import me.whitebear.wos.skill.dto.response.SkillUpdateRes;
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

    public SkillGetRes getSkill(Long id) {
        Skill skill = findSkill(id);

        SkillGetRes res = SkillGetRes.builder()
            .id(skill.getId())
            .name(skill.getName())
            .type(skill.getType())
            .description(skill.getDescription())
            .value(skill.getValue())
            .build();

        return res;
    }

    public List<SkillGetRes> getSkillList() {
        List<Skill> list = skillRepository.findAll();

        List<SkillGetRes> res = list.stream().map(
            skill -> SkillGetRes.builder()
                .id(skill.getId())
                .description(skill.getDescription())
                .name(skill.getName())
                .type(skill.getType())
                .value(skill.getValue())
                .build()
        ).toList();

        return res;
    }

    public SkillUpdateRes updateSkill(Long id, SkillUpdateReq req) {
        Skill skill = findSkill(id);

        skill.updateSkill(req);

        SkillUpdateRes res = SkillUpdateRes.builder()
            .skill(skill)
            .build();

        return res;
    }

    private Skill findSkill(Long id) {
        Skill skill = skillRepository.findById(id).orElseThrow(IllegalArgumentException::new);

        return skill;
    }

}
