package com.company;

public class DocumentItem implements Item, ItemBasicOperations {

    String name;


    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;

    }

    public String getDescription(){
        return "Opis z DocumentItem";
    }


    public String getFullName() {
        return "treer";
    }

    public String getOpis(){
        return "Opis z BLA BLA";
    }

}
