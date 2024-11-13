package me.whitebear.wos.domain.widget.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class WidgetUpdateRes {
    String widgetName;

    @Builder
    public WidgetUpdateRes(String widgetName) {
        this.widgetName = widgetName;
    }
}