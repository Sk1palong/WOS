package me.whitebear.wos.hero;

import lombok.RequiredArgsConstructor;
import me.whitebear.wos.hero.dto.request.HeroSaveReq;
import me.whitebear.wos.hero.dto.request.HeroUpdateReq;
import me.whitebear.wos.hero.dto.response.HeroGetRes;
import me.whitebear.wos.hero.dto.response.HeroSaveRes;
import me.whitebear.wos.hero.dto.response.HeroUpdateRes;
import me.whitebear.wos.hero.service.HeroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/wos/heroes")
public class HeroController {

    private final HeroService heroService;

    @PostMapping
    public HeroSaveRes saveHero(@RequestBody HeroSaveReq req) {

        HeroSaveRes res = heroService.saveHero(req);

        return res;
    }

    @GetMapping("/{id}")
    public HeroGetRes getHero(@PathVariable Long id) {
        HeroGetRes res = heroService.getHero(id);

        return res;
    }

    @PutMapping("/{id}")
    public HeroUpdateRes updateHero(@PathVariable Long id, @RequestBody HeroUpdateReq req) {
        HeroUpdateRes res = heroService.updateHero(id, req);

        return res;
    }
}
