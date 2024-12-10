package me.whitebear.wos.domain.widget.dto.response;

import lombok.Builder;
import lombok.Getter;
import me.whitebear.wos.domain.hero.store.entity.Hero;
import me.whitebear.wos.domain.widget.store.entity.Widget;

@Getter
public class WidgetSaveRes {
    Long id;
    String name;
    String heroName;

    @Builder
    public WidgetSaveRes(Widget widget, Hero hero) {
        this.id = widget.getId();
        this.name = widget.getWidgetName();
        this.heroName = hero.getHeroName();
    }
}
