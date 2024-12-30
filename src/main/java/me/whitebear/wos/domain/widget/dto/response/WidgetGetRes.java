package me.whitebear.wos.domain.widget.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class WidgetGetRes {

    Long widgetId;
    String WidgetName;

    @Builder
    public WidgetGetRes(Long widgetId, String WidgetName) {
        this.widgetId = widgetId;
        this.WidgetName = WidgetName;
    }
}
