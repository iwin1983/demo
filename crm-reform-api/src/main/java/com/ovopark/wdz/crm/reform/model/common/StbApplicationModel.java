package com.ovopark.wdz.crm.reform.model.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * </p>
 *
 * @author xuke
 * @create 2020-09-07
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class StbApplicationModel extends BaseModel {

    private Long id;

    /**
     * 应用编码
     */
    private String code;

    /**
     * 应用名称
     */
    private String name;

    /**
     * 应用图标url
     */
    private String iconUrl;

    /**
     * 应用状态(1:启用,0:禁用)
     */
    private String state;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 修改人
     */
    private String updateBy;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;
}
