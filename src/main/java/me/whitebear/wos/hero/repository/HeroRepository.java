package me.whitebear.wos.hero.repository;

import java.util.List;
import me.whitebear.wos.hero.store.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository extends JpaRepository<Hero, Long> {
    List<Hero> findAll();

}
