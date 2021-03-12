package com.example.listviewdemo;

public class Goods {
    private String name;
    private String shop_name;
    private int imgGoods;

    public Goods(String name, String shop_name, int imgGoods) {
        this.name = name;
        this.shop_name = shop_name;
        this.imgGoods = imgGoods;
    }

    public Goods() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public int getImgGoods() {
        return imgGoods;
    }

    public void setImgGoods(int imgGoods) {
        this.imgGoods = imgGoods;
    }
}
