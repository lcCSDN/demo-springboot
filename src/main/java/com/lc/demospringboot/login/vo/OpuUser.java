package com.lc.demospringboot.login.vo;

import java.io.Serializable;
import lombok.Data;

/**
 * opu_user
 * @author 
 */
@Data
public class OpuUser implements Serializable {
    private String id;

    private String userName;

    private String password;

    private static final long serialVersionUID = 1L;
}