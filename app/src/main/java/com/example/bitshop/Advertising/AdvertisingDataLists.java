package com.example.bitshop.Advertising;

public class AdvertisingDataLists {

    String currency_source, currency_torget, currency_amount,  currency_cost, currency_expire_time, explain;
    int image;

    public String getCurrency_source() {
        return currency_source;
    }

    public void setCurrency_source(String currency_source) {
        this.currency_source = currency_source;
    }

    public String getCurrency_torget() {
        return currency_torget;
    }

    public void setCurrency_torget(String currency_torget) {
        this.currency_torget = currency_torget;
    }

    public String getCurrency_amount() {
        return currency_amount;
    }

    public void setCurrency_amount(String currency_amount) {
        this.currency_amount = currency_amount;
    }

    public String getCurrency_cost() {
        return currency_cost;
    }

    public void setCurrency_cost(String currency_cost) {
        this.currency_cost = currency_cost;
    }

    public String getCurrency_expire_time() {
        return currency_expire_time;
    }

    public void setCurrency_expire_time(String currency_expire_time) {
        this.currency_expire_time = currency_expire_time;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public AdvertisingDataLists(int image, String currency_source, String currency_torget, String currency_amount,
                                String currency_cost, String currency_expire_time, String explain) {

        this.image = image;
        this.currency_source = currency_source;
        this.currency_torget = currency_torget;
        this.currency_amount = currency_amount;
        this.currency_cost = currency_cost;
        this.currency_expire_time = currency_expire_time;
        this.explain = explain;
    }
}