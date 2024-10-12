package me.whitebear.wos.skill.controller;

import lombok.RequiredArgsConstructor;
import me.whitebear.wos.skill.service.SkillService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/wos/skills")
public class SkillController {

    private final SkillService skillService;
}
