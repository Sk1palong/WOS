package me.whitebear.wos.domain.widget.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class WidgetGetRes {

    Long WidgetId;
    String WidgetName;

    @Builder
    public WidgetGetRes(Long WidgetId, String WidgetName) {
        this.WidgetId = WidgetId;
        this.WidgetName = WidgetName;
    }
}
