package com.ovopark.wdz.crm.reform.service.dubbo.producer;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ovopark.wdz.crm.reform.entity.common.StbApplication;
import com.ovopark.wdz.crm.reform.model.common.StbApplicationModel;
import com.ovopark.wdz.crm.reform.service.common.StbApplicationService;
import com.ovopark.wdz.crm.reform.service.dubbo.common.StbApplicationDubboService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * </p>
 *
 * @author xuke
 * @create 2020-09-07
 */
@DubboService(version = "1.0.0", timeout = 10000, interfaceClass = StbApplicationDubboService.class)
public class StbApplicationDubboServiceImpl implements StbApplicationDubboService {

    @Autowired
    private StbApplicationService stbApplicationService;

    @Override
    public String getAppList(StbApplicationModel model) {
        QueryWrapper<StbApplication> wrapper = new QueryWrapper<>();
        if (StrUtil.isNotEmpty(model.getName())) {
            wrapper.like("name", model.getName());
        }

        return stbApplicationService.page(model.getPage(), wrapper).toString();
    }
}
