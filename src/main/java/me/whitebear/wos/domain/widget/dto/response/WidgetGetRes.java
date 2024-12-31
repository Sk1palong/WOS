package me.whitebear.wos.domain.widget.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class WidgetGetRes {

    Long widgetId;
    String widgetName;

    @Builder
    public WidgetGetRes(Long widgetId, String widgetName) {
        this.widgetId = widgetId;
        this.widgetName = widgetName;
    }
}
