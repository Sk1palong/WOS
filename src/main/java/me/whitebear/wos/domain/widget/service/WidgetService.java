package me.whitebear.wos.domain.widget.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import me.whitebear.wos.domain.hero.service.HeroService;
import me.whitebear.wos.domain.hero.store.entity.Hero;
import me.whitebear.wos.domain.widget.dto.request.WidgetSaveReq;
import me.whitebear.wos.domain.widget.dto.request.WidgetUpdateReq;
import me.whitebear.wos.domain.widget.dto.response.WidgetDeleteRes;
import me.whitebear.wos.domain.widget.dto.response.WidgetGetRes;
import me.whitebear.wos.domain.widget.dto.response.WidgetSaveRes;
import me.whitebear.wos.domain.widget.dto.response.WidgetUpdateRes;
import me.whitebear.wos.domain.widget.store.entity.Widget;
import me.whitebear.wos.domain.widget.store.repository.WidgetRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class WidgetService {

    private final WidgetRepository widgetRepository;
    private final HeroService heroService;

    public WidgetSaveRes saveWidget(Long HeroId, WidgetSaveReq req) {
        Hero hero = heroService.findHero(HeroId);

        Widget widget = Widget.builder()
            .hero(hero)
            .WidgetName(req.getWidgetName())
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
            .widget(widget)
            .build();

        return res;
    }

    public WidgetGetRes getWidget(Long widgetId) {
        Widget widget = findWidget(widgetId);

        WidgetGetRes res = WidgetGetRes.builder()
            .widget(widget)
            .build();

        return res;
    }

    public List<WidgetGetRes> getWidgetList() {
        List<Widget> widgetList = widgetRepository.findAll();

        List<WidgetGetRes> res = widgetList.stream().map(
            widget -> WidgetGetRes.builder()
                .widget(widget)
                .build()
        ).toList();

        return res;
    }

    @Transactional
    public WidgetUpdateRes updateWidget(Long widgetId, WidgetUpdateReq req) {
        Widget widget = findWidget(widgetId);

        widget.updateWidget(req);

        WidgetUpdateRes res = WidgetUpdateRes.builder()
            .widget(widget)
            .build();

        return res;
    }

    public Widget findWidget(Long WidgetId) {
        Widget widget = widgetRepository.findById(WidgetId).orElseThrow(IllegalArgumentException::new);

        return widget;
    }
}
