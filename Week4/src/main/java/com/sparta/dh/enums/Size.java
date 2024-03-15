package com.sparta.dh.enums;

public enum Size {
    SMALL("Small Pizza", 800),
    MEDIUM("Medium Pizza", 1000),
    LARGE("Large Pizza", 1300);

    private String description;

    Size(String description, int Kcals) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }


}
