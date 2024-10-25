package me.whitebear.wos.domain.skill.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import me.whitebear.wos.domain.skill.dto.request.SkillSaveReq;
import me.whitebear.wos.domain.skill.dto.response.SkillSaveRes;
import me.whitebear.wos.domain.skill.store.repository.SkillRepository;
import me.whitebear.wos.domain.hero.service.HeroService;
import me.whitebear.wos.domain.hero.store.entity.Hero;
import me.whitebear.wos.domain.skill.dto.request.SkillUpdateReq;
import me.whitebear.wos.domain.skill.dto.response.SkillDeleteRes;
import me.whitebear.wos.domain.skill.dto.response.SkillGetRes;
import me.whitebear.wos.domain.skill.dto.response.SkillUpdateRes;
import me.whitebear.wos.domain.skill.store.entity.Skill;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SkillService {

    private final SkillRepository skillRepository;
    private final HeroService heroService;

    public SkillSaveRes saveSkill(Long HeroId, SkillSaveReq req) {
        Hero hero = heroService.findHero(HeroId);

        Skill skill = Skill.builder()
            .hero(hero)
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

    @Transactional
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

    public SkillDeleteRes deleteSkill(Long id) {
        Skill skill = findSkill(id);

        skillRepository.delete(skill);

        SkillDeleteRes res = SkillDeleteRes.builder()
            .id(skill.getId())
            .name(skill.getName())
            .build();

        return res;
    }
}
