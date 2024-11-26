package me.whitebear.wos.domain.skill.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import me.whitebear.wos.domain.skill.dto.request.SkillSaveReq;
import me.whitebear.wos.domain.skill.dto.response.SkillSaveRes;
import me.whitebear.wos.domain.skill.dto.request.SkillUpdateReq;
import me.whitebear.wos.domain.skill.dto.response.SkillDeleteRes;
import me.whitebear.wos.domain.skill.dto.response.SkillGetRes;
import me.whitebear.wos.domain.skill.dto.response.SkillUpdateRes;
import me.whitebear.wos.domain.skill.service.SkillService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/wos/skills")
public class SkillController {

    private final SkillService skillService;

    @PostMapping("/{HeroId}")
    public ResponseEntity<SkillSaveRes> saveSkill(@PathVariable Long HeroId, @RequestBody SkillSaveReq req) {
        SkillSaveRes res = skillService.saveSkill(HeroId, req);

        return ResponseEntity.status(HttpStatus.CREATED).body(res);
    }

    @GetMapping("/{skillId}")
    public SkillGetRes getSkill(@PathVariable Long skillId) {
        SkillGetRes res = skillService.getSkill(skillId);

        return res;
    }

    @GetMapping
    public List<SkillGetRes> getSkills() {
        List<SkillGetRes> res = skillService.getSkillList();

        return res;
    }

    @PutMapping("{id}")
    public SkillUpdateRes updateSkill(@PathVariable Long id, @RequestBody SkillUpdateReq req) {
        SkillUpdateRes res = skillService.updateSkill(id, req);

        return res;
    }

    @DeleteMapping("{id}")
    public SkillDeleteRes deleteSkill(@PathVariable Long id) {
        SkillDeleteRes res = skillService.deleteSkill(id);

        return res;
    }
}
