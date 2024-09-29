package me.whitebear.wos.hero.service;

import lombok.RequiredArgsConstructor;
import me.whitebear.wos.hero.Hero;
import me.whitebear.wos.hero.dto.request.HeroSaveReq;
import me.whitebear.wos.hero.dto.response.HeroGetRes;
import me.whitebear.wos.hero.dto.response.HeroSaveRes;
import me.whitebear.wos.hero.repository.HeroRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HeroService {

    private final HeroRepository heroRepository;

    public HeroSaveRes saveHero(HeroSaveReq req) {
        Hero hero = Hero.builder()
            .name(req.getName())
            .gen(req.getGen())
            .type(req.getType())
            .build();

        Hero savedHero = heroRepository.save(hero);

        HeroSaveRes res = HeroSaveRes.builder()
            .id(savedHero.getId())
            .name(savedHero.getName())
            .gen(savedHero.getGen())
            .type(savedHero.getType())
            .build();

        return res;
    }

    public HeroGetRes getHero(Long id) {
        Hero hero = heroRepository.findById(id).orElseThrow(IllegalArgumentException::new);

        HeroGetRes res = HeroGetRes.builder()
            .id(hero.getId())
            .gen(hero.getGen())
            .name(hero.getName())
            .type(hero.getType())
            .build();

        return res;
    }
}
