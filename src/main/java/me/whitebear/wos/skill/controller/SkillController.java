package me.whitebear.wos.skill.controller;

import lombok.RequiredArgsConstructor;
import me.whitebear.wos.skill.dto.request.SkillSaveReq;
import me.whitebear.wos.skill.dto.response.SkillSaveRes;
import me.whitebear.wos.skill.service.SkillService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/wos/skills")
public class SkillController {

    private final SkillService skillService;

    @PostMapping
    public SkillSaveRes saveSkill(@RequestBody SkillSaveReq req) {
        SkillSaveRes res = skillService.saveSkill(req);

        return res;
    }
}
