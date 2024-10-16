package me.whitebear.wos.hero.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import me.whitebear.wos.hero.store.entity.Hero;
import me.whitebear.wos.hero.dto.request.HeroSaveReq;
import me.whitebear.wos.hero.dto.request.HeroUpdateReq;
import me.whitebear.wos.hero.dto.response.HeroDeleteRes;
import me.whitebear.wos.hero.dto.response.HeroGetRes;
import me.whitebear.wos.hero.dto.response.HeroSaveRes;
import me.whitebear.wos.hero.dto.response.HeroUpdateRes;
import me.whitebear.wos.hero.store.repository.HeroRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class HeroService {

    private final HeroRepository heroRepository;

    public HeroSaveRes saveHero(HeroSaveReq req) {
        Hero hero = Hero.builder()
            .name(req.getName())
            .gen(req.getGen())
            .type(req.getType())
            .grade(req.getGrade())
            .build();

        Hero savedHero = heroRepository.save(hero);

        HeroSaveRes res = HeroSaveRes.builder()
            .id(savedHero.getId())
            .name(savedHero.getName())
            .gen(savedHero.getGen())
            .type(savedHero.getType())
            .grade(savedHero.getGrade())
            .build();

        return res;
    }

    public HeroGetRes getHero(Long id) {
        Hero hero = findHero(id);

        HeroGetRes res = HeroGetRes.builder()
            .id(hero.getId())
            .gen(hero.getGen())
            .name(hero.getName())
            .type(hero.getType())
            .grade(hero.getGrade())
            .build();

        return res;
    }

    @Transactional
    public HeroUpdateRes updateHero(Long id, HeroUpdateReq req) {
        Hero hero = findHero(id);

        hero.updateHero(req.getName(), req.getGen(), req.getType());

        HeroUpdateRes res = new HeroUpdateRes(hero);

        return res;
    }

    public List<HeroGetRes> getHeroList() {
        List<Hero> heroList = heroRepository.findAll();

        List<HeroGetRes> res = heroList.stream().map(
                hero -> HeroGetRes.builder()
                    .id(hero.getId())
                    .type(hero.getType())
                    .name(hero.getName())
                    .gen(hero.getGen())
                    .grade(hero.getGrade())
                    .build())
            .toList();

        return res;
    }

    public HeroDeleteRes deleteHero(Long id) {
        Hero hero = findHero(id);

        heroRepository.delete(hero);

        HeroDeleteRes res = HeroDeleteRes.builder()
            .id(id)
            .name(hero.getName())
            .build();

        return res;
    }

    public Hero findHero(Long id) {
        Hero hero = heroRepository.findById(id).orElseThrow(IllegalArgumentException::new);

        return hero;
    }
}
