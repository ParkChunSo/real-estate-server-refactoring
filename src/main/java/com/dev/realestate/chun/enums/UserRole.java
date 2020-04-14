package com.dev.realestate.chun.enums;

import java.util.Arrays;
import java.util.List;

public enum UserRole {
    CLIENT("일반사용자", Arrays.asList(Function.SELECT_OWN_USER_INFO)),
    AGENT("부동산중개인", Arrays.asList(Function.SELECT_OWN_USER_INFO)),
    ADMIN("관리자", Arrays.asList(Function.values()));

    private String name;
    private List<Function> permission;

    UserRole(String s, List<Function> permission) {
        this.name = s;
        this.permission = permission;
    }

    public String getName() {
        return name;
    }
    public boolean hasPermission(Function function){
        return permission.contains(function);
    }
}
