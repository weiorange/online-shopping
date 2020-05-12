package com.os.onlineshoppingentity.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: online-shopping
 * @description: ${description}
 * @author: qianjin
 * @create: 2020-05-07 19:37
 **/
@Data
public class Product implements Serializable {

    private static final long serialVersionUID = 6901440800228626704L;

    private String name;
    private int age;
    private String add;
    private String email;

    public Product() {
        this.name = "name";
        this.age = 12;
        this.add = "北京市历史互通";
        this.email = "6666.qq.com";
    }

}
