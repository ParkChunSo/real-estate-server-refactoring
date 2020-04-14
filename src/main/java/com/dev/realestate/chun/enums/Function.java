package com.dev.realestate.chun.enums;

public enum Function {
    CREATE_BUILDING("빌딩 정보 추가"),
    CREATE_SALE("매물 생성"),
    SELECT_ALL_USER_INFO("모든 유저 정보 조회"),
    SELECT_OWN_USER_INFO("본인 정보 조회"),
//    UPDATE,
//    DELETE;
    EMPTY("없음");

    private String title;

    Function(String title) {
    }
}
