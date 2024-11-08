package me.whitebear.wos.domain.widget.controller;

import lombok.RequiredArgsConstructor;
import me.whitebear.wos.domain.widget.dto.request.WidgetSaveReq;
import me.whitebear.wos.domain.widget.dto.response.WidgetDeleteRes;
import me.whitebear.wos.domain.widget.dto.response.WidgetGetRes;
import me.whitebear.wos.domain.widget.dto.response.WidgetSaveRes;
import me.whitebear.wos.domain.widget.service.WidgetService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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

    @PostMapping("/{heroId}")
    public WidgetSaveRes saveWidget(@PathVariable Long heroId, @RequestBody WidgetSaveReq req) {
        WidgetSaveRes res = widgetService.saveWidget(heroId, req);

        return res;
    }

    @GetMapping("{widgetId}")
    public WidgetGetRes getWidget(@PathVariable Long widgetId) {
        WidgetGetRes res = widgetService.getWidget(widgetId);

        return res;
    }

    @DeleteMapping("/{widgetId}")
    public WidgetDeleteRes deleteWidget(@PathVariable Long widgetId) {
        WidgetDeleteRes res = widgetService.deleteWidget(widgetId);

        return res;
    }
}
