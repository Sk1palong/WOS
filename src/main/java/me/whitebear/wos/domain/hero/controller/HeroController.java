package me.whitebear.wos.domain.hero.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import me.whitebear.wos.domain.hero.dto.request.HeroSaveReq;
import me.whitebear.wos.domain.hero.dto.request.HeroUpdateReq;
import me.whitebear.wos.domain.hero.dto.response.HeroDeleteRes;
import me.whitebear.wos.domain.hero.dto.response.HeroGetRes;
import me.whitebear.wos.domain.hero.dto.response.HeroSaveRes;
import me.whitebear.wos.domain.hero.dto.response.HeroUpdateRes;
import me.whitebear.wos.domain.hero.service.HeroService;
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
@RequestMapping("/api/wos/heroes")
public class HeroController {

    private final HeroService heroService;

    @PostMapping
    public ResponseEntity<HeroSaveRes> saveHero(@RequestBody HeroSaveReq req) {

        HeroSaveRes res = heroService.saveHero(req);

        return ResponseEntity.status(HttpStatus.CREATED).body(res);
    }

    @GetMapping("/{heroId}")
    public ResponseEntity<HeroGetRes> getHero(@PathVariable Long heroId) {
        HeroGetRes res = heroService.getHero(heroId);

        return ResponseEntity.status(HttpStatus.OK).body(res);
    }

    @GetMapping()
    public ResponseEntity<List<HeroGetRes>> getHeroes() {
        List<HeroGetRes> res = heroService.getHeroList();

        return ResponseEntity.status(HttpStatus.OK).body(res);
    }

    @PutMapping("/{heroId}")
    public ResponseEntity<HeroUpdateRes> updateHero(@PathVariable Long heroId, @RequestBody HeroUpdateReq req) {

        HeroUpdateRes res = heroService.updateHero(heroId, req);

        return ResponseEntity.status(HttpStatus.OK).body(res);
    }

    @DeleteMapping("{heroId}")
    public HeroDeleteRes deleteHero(@PathVariable Long heroId) {
        HeroDeleteRes res = heroService.deleteHero(heroId);

        return res;
    }
}
