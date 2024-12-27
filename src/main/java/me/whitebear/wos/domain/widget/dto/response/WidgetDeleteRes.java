package me.whitebear.wos.domain.widget.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class WidgetDeleteRes {

    Long widgetId;
    String name;

    @Builder
    public WidgetDeleteRes(Long widgetId, String name) {
        this.widgetId = widgetId;
        this.name = name;
    }
}
