package me.whitebear.wos.domain.widget.dto.response;

import lombok.Builder;
import lombok.Getter;
import me.whitebear.wos.domain.widget.store.entity.Widget;

@Getter
public class WidgetUpdateRes {
    String widgetName;

    @Builder
    public WidgetUpdateRes(Widget widget) {
        this.widgetName = widget.getWidgetName();
    }
}