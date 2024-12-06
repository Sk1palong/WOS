package me.whitebear.wos.domain.widget.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import me.whitebear.wos.domain.widget.dto.request.WidgetSaveReq;
import me.whitebear.wos.domain.widget.dto.request.WidgetUpdateReq;
import me.whitebear.wos.domain.widget.dto.response.WidgetDeleteRes;
import me.whitebear.wos.domain.widget.dto.response.WidgetGetRes;
import me.whitebear.wos.domain.widget.dto.response.WidgetSaveRes;
import me.whitebear.wos.domain.widget.dto.response.WidgetUpdateRes;
import me.whitebear.wos.domain.widget.service.WidgetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/wos/widgets")
public class WidgetController {

    private final WidgetService widgetService;

    @PostMapping("/{heroId}")
    public ResponseEntity<WidgetSaveRes> saveWidget(@PathVariable Long heroId, @RequestBody WidgetSaveReq req) {
        WidgetSaveRes res = widgetService.saveWidget(heroId, req);

        return ResponseEntity.status(HttpStatus.CREATED).body(res);
    }

    @GetMapping("{widgetId}")
    public ResponseEntity<WidgetGetRes> getWidget(@PathVariable Long widgetId) {
        WidgetGetRes res = widgetService.getWidget(widgetId);

        return ResponseEntity.status(HttpStatus.OK).body(res);
    }

    @GetMapping
    public ResponseEntity<List<WidgetGetRes>> getWidgets() {
        List<WidgetGetRes> res = widgetService.getWidgetList();

        return ResponseEntity.status(HttpStatus.OK).body(res);
    }

    @PutMapping("/{widgetId}")
    public WidgetUpdateRes updateWidget(@PathVariable Long widgetId, @RequestBody WidgetUpdateReq req) {
        WidgetUpdateRes res = widgetService.updateWidget(widgetId, req);

        return res;
    }

    @DeleteMapping("/{widgetId}")
    public WidgetDeleteRes deleteWidget(@PathVariable Long widgetId) {
        WidgetDeleteRes res = widgetService.deleteWidget(widgetId);

        return res;
    }
}
