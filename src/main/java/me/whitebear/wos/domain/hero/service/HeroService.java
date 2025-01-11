package me.whitebear.wos.domain.hero.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import me.whitebear.wos.domain.hero.dto.request.HeroUpdateReq;
import me.whitebear.wos.domain.hero.dto.response.HeroDeleteRes;
import me.whitebear.wos.domain.hero.dto.response.HeroSaveRes;
import me.whitebear.wos.domain.hero.dto.response.HeroUpdateRes;
import me.whitebear.wos.domain.hero.store.repository.HeroRepository;
import me.whitebear.wos.domain.hero.store.entity.Hero;
import me.whitebear.wos.domain.hero.dto.request.HeroSaveReq;
import me.whitebear.wos.domain.hero.dto.response.HeroGetRes;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class HeroService {

    private final HeroRepository heroRepository;

    public HeroSaveRes saveHero(HeroSaveReq req) {
        Hero hero = Hero.builder()
            .heroName(req.getHeroName())
            .gen(req.getGen())
            .type(req.getType())
            .grade(req.getGrade())
            .build();

        Hero savedHero = heroRepository.save(hero);

        HeroSaveRes res = HeroSaveRes.builder()
            .hero(savedHero)
            .build();

        return res;
    }

    public HeroGetRes getHero(Long heroId) {
        Hero hero = findHero(heroId);

        HeroGetRes res = HeroGetRes.builder()
            .hero(hero)
            .build();

        return res;
    }

    @Transactional
    public HeroUpdateRes updateHero(Long heroId, HeroUpdateReq req) {
        Hero hero = findHero(heroId);

        hero.updateHero(req);

        HeroUpdateRes res = new HeroUpdateRes(hero);

        return res;
    }

    public List<HeroGetRes> getHeroList() {
        List<Hero> heroList = heroRepository.findAll();

        List<HeroGetRes> res = heroList.stream().map(
                hero -> HeroGetRes.builder()
                    .heroId(hero.getHeroId())
                    .type(hero.getType())
                    .heroName(hero.getHeroName())
                    .gen(hero.getGen())
                    .grade(hero.getGrade())
                    .build())
            .toList();

        return res;
    }

    public HeroDeleteRes deleteHero(Long heroId) {
        Hero hero = findHero(heroId);

        heroRepository.delete(hero);

        HeroDeleteRes res = HeroDeleteRes.builder()
            .heroId(heroId)
            .heroName(hero.getHeroName())
            .build();

        return res;
    }

    public Hero findHero(Long heroId) {
        Hero hero = heroRepository.findById(heroId).orElseThrow(IllegalArgumentException::new);

        return hero;
    }
}
