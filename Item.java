package com.company;

public interface Item {

    void setName(String name);

    String getName();

    public String LABEL = "Nr 1"; //static final

    String getDescription();

    public static String getFullName() {
        return "TOMEK";
    }
}

