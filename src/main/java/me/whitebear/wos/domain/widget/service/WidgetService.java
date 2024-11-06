package me.whitebear.wos.domain.widget.service;

import lombok.RequiredArgsConstructor;
import me.whitebear.wos.domain.hero.service.HeroService;
import me.whitebear.wos.domain.hero.store.entity.Hero;
import me.whitebear.wos.domain.widget.dto.request.WidgetSaveReq;
import me.whitebear.wos.domain.widget.dto.response.WidgetDeleteRes;
import me.whitebear.wos.domain.widget.dto.response.WidgetSaveRes;
import me.whitebear.wos.domain.widget.store.entity.Widget;
import me.whitebear.wos.domain.widget.store.repository.WidgetRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WidgetService {

    private final WidgetRepository widgetRepository;
    private final HeroService heroService;

    public WidgetSaveRes saveWidget(Long HeroId, WidgetSaveReq req) {
        Hero hero = heroService.findHero(HeroId);

        Widget widget = Widget.builder()
            .hero(hero)
            .name(req.getName())
            .build();

        widgetRepository.save(widget);

        WidgetSaveRes res = WidgetSaveRes.builder()
            .hero(widget.getHero())
            .widget(widget)
            .build();

        return res;
    }

    public WidgetDeleteRes deleteWidget(Long widgetId) {
        Widget widget = findWidget(widgetId);

        widgetRepository.delete(widget);

        WidgetDeleteRes res = WidgetDeleteRes.builder()
            .WidgetId(widget.getId())
            .name(widget.getName())
            .build();

        return res;
    }

    public Widget findWidget(Long WidgetId) {
        Widget widget = widgetRepository.findById(WidgetId).orElseThrow(IllegalArgumentException::new);

        return widget;
    }
}
