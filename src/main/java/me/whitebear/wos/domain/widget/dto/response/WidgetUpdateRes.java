package me.whitebear.wos.domain.widget.dto.response;

import lombok.Builder;
import lombok.Getter;
import me.whitebear.wos.domain.widget.store.entity.Widget;

@Getter
public class WidgetUpdateRes {

    Long widgetId;
    String widgetName;

    @Builder
    public WidgetUpdateRes(Widget widget) {
        this.widgetId = widget.getWidgetId();
        this.widgetName = widget.getWidgetName();
    }
}