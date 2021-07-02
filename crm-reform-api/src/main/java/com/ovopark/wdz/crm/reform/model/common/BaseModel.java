package com.ovopark.wdz.crm.reform.model.common;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseModel implements Serializable {

    private String orderByClause;

    private Page page;

    private Integer no;

    private Integer limit;

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
        if (no != null && limit != null && limit != 0) {
            this.page = new Page(no, limit);
        }
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
        if (no != null  && limit != null && limit != 0) {
            this.page = new Page(no, limit);
        }
    }

    //深克隆
    public Object deepClone() throws Exception
    {
        // 将该对象序列化成流,写在流里的是对象的一个拷贝，原对象仍然存在于JVM里面，利用这个特性可以实现对象的深拷贝。
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        // 将流序列化成对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}