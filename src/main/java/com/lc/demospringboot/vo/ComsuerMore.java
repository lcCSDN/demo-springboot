package com.lc.demospringboot.vo;

import com.lc.demospringboot.utils.selectlist;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: lichao
 * @Date: 2021/5/11 13:58
 * @Descr: $
 */
@Data
public class ComsuerMore implements Serializable {
    private static final long serialVersionUID = -8256263300679036573L;

    @selectlist("1")
    private List<Comsuer> oneList;
    @selectlist("2")
    private List<Comsuer> twoList;
    @selectlist("3")
    private List<Comsuer> ThreeList;
    @selectlist("4")
    private List<Comsuer> FourList;
    //
}
