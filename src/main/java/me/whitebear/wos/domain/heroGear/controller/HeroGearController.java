package me.whitebear.wos.domain.heroGear.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/wos/herogears")
public class HeroGearController {

    @PostMapping
    public String saveHeroGears() {
        return "saved hero gears";
    }


}
