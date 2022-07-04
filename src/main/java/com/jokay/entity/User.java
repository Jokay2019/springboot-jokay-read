package com.jokay.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = -4662327934112478929L;
    private Long id;
    private String name;
    private String password;
}
