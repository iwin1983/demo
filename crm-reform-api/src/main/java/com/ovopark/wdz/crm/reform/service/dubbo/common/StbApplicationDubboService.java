package com.ovopark.wdz.crm.reform.service.dubbo.common;

import com.ovopark.wdz.crm.reform.model.common.StbApplicationModel;

/**
 * <p>
 * </p>
 *
 * @author xuke
 * @create 2020-09-07
 */
public interface StbApplicationDubboService {

    /**
     * 查询应用列表
     * @param model
     * @return
     */
    String getAppList(StbApplicationModel model);

}
