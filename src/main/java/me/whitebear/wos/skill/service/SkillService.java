package me.whitebear.wos.skill.service;

import lombok.RequiredArgsConstructor;
import me.whitebear.wos.skill.store.SkillRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SkillService {

    private final SkillRepository skillRepository;
}
