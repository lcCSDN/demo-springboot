package com.lc.demospringboot.vo;

import java.io.Serializable;
import lombok.Data;

/**
 * person
 * @author 
 */
@Data
public class Persons implements Serializable {
    private String id;

    private String name;

    private Integer age;

    private static final long serialVersionUID = 1L;
}