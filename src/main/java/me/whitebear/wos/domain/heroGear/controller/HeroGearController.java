package me.whitebear.wos.domain.heroGear.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/wos/herogears")
public class HeroGearController {

    @PostMapping
    public String saveHeroGear() {
        return "saved hero gear";
    }

    @GetMapping()
    public String getHeroGear() {
        return "get hero gear";
    }

    @GetMapping()
    public String getAllHeroGear() {
        return "get all hero gear";
    }

}
