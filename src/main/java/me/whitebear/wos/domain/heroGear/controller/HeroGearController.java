package me.whitebear.wos.domain.heroGear.controller;

import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import me.whitebear.wos.domain.hero.dto.request.HeroSaveReq;
import me.whitebear.wos.domain.hero.dto.response.HeroSaveRes;
import me.whitebear.wos.domain.heroGear.dto.request.HeroGearSaveReq;
import me.whitebear.wos.domain.heroGear.dto.response.HeroGearGetRes;
import me.whitebear.wos.domain.heroGear.dto.response.HeroGearSaveRes;
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
@RequestMapping("/api/wos/herogears")
public class HeroGearController {

    @PostMapping
    public HeroGearSaveRes saveHeroGear(@RequestBody HeroGearSaveReq req) {
        HeroGearSaveRes res = HeroGearSaveRes.builder()
            .heroGearName(req.getHeroGearName())
            .type(req.getType())
            .grade(req.getGrade())
            .build();

        return res;
    }

    @GetMapping("{herogearId}")
    public HeroGearGetRes getHeroGear(@PathVariable Long herogearId) {

        HeroGearGetRes res = HeroGearGetRes.builder()
            .HeroGearId(herogearId)
            .build();

        return res;

    }

    @GetMapping()
    public List<HeroGearGetRes> getAllHeroGear() {
        List<HeroGearGetRes> res = new ArrayList<>();

        return res;
    }

    @PutMapping("{herogearId}")
    public String updateHeroGear() {
        return "update hero gear";
    }

    @DeleteMapping("{hergearId}")
    public String deleteHeroGear() {
        return "delete hero gear";
    }

}
