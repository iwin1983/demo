package com.ovopark.wdz.crm.reform.controller;

import com.ovopark.wdz.crm.reform.model.common.StbApplicationModel;
import com.ovopark.wdz.crm.reform.service.dubbo.common.StbApplicationDubboService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * </p>
 *
 * @author xuke
 * @create 2020-09-07
 */
@RestController
@RequestMapping("/api/common/app")
public class ApplicationController {

    @DubboReference(version = "1.0.0", check = false, interfaceClass = StbApplicationDubboService.class)
    private StbApplicationDubboService stbApplicationDubboService;

    /**
     * 查询应用列表
     *
     * @param model
     * @return
     */
    @GetMapping("/v1/getAppList")
    public String getAppList(@ModelAttribute StbApplicationModel model) {
        return stbApplicationDubboService.getAppList(model);
    }
}
