package me.whitebear.wos.domain.widget.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class WidgetDeleteRes {

    Long WidgetId;
    String name;

    @Builder
    public WidgetDeleteRes(Long WidgetId, String name) {
        this.WidgetId = WidgetId;
        this.name = name;
    }
}
