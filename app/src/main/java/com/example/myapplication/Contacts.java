package com.example.myapplication;

public class Contacts {
    private int id;
    private String name;
    private String price;
    private String img;
    Contacts(String name, String phno,String img) {
        this.name = name;
        this.price = phno;
        this.img = img;
    }
    //wach 3jbatak
    Contacts(int id, String name, String phno,String img) {
        this.id = id;
        this.name = name;
        this.price = phno;
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    String getPrice() {
        return price;
    }
    public void setPrice(String phno) {
        this.price =price;
    }
}
