package com.lc.demospringboot.vo;

import java.io.Serializable;

import com.lc.demospringboot.utils.selectlist;
import lombok.Data;

/**
 * comsuer
 * @author 
 */
@Data
public class Comsuer implements Serializable {
    /**
     * id
     */
    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 电话
     */
    private String tel;

    /**
     * 地址
     */
    private String addr;

    /**
     * 客户类型
     */
    private String type;

    private static final long serialVersionUID = 1L;
}