package com.dev.realestate.chun.enums;

public enum HousingType {
    APT("아파트"),
    OFFICETEL("오피스텔"),
    HOUSE("단독주택");

    private String title;

    HousingType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
