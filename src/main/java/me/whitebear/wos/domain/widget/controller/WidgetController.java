package me.whitebear.wos.domain.widget.controller;

import lombok.RequiredArgsConstructor;
import me.whitebear.wos.domain.widget.dto.request.WidgetSaveReq;
import me.whitebear.wos.domain.widget.dto.response.WidgetDeleteRes;
import me.whitebear.wos.domain.widget.dto.response.WidgetSaveRes;
import me.whitebear.wos.domain.widget.service.WidgetService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/wos/widgets")
public class WidgetController {

    private final WidgetService widgetService;

    @PostMapping("/{HeroId}")
    public WidgetSaveRes saveWidget(@PathVariable Long HeroId, @RequestBody WidgetSaveReq req) {
        WidgetSaveRes res = widgetService.saveWidget(HeroId, req);

        return res;
    }

    @DeleteMapping("/{WidgetId}")
    public WidgetDeleteRes deleteWidget(@PathVariable Long WidgetId) {
        WidgetDeleteRes res = widgetService.deleteWidget(WidgetId);

        return res;
    }
}
