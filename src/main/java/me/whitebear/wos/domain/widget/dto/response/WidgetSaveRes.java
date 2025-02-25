package me.whitebear.wos.domain.widget.dto.response;

import lombok.Builder;
import lombok.Getter;
import me.whitebear.wos.domain.hero.store.entity.Hero;
import me.whitebear.wos.domain.widget.store.entity.Widget;

@Getter
public class WidgetSaveRes {

    Long widgetId;
    String widgetName;
    String heroName;

    @Builder
    public WidgetSaveRes(Widget widget, Hero hero) {
        this.widgetId = widget.getWidgetId();
        this.widgetName = widget.getWidgetName();
        this.heroName = hero.getHeroName();
    }
}
