package com.example.api.entity;

public class Message {
    private int id;
    private String symbol;
    private String name;
    private String nameid;
    private int rank;
    private String price_usd;
    private String percent_change_24h;
    private String percent_change_1h;
    private String percent_change_7d;
    private String market_cap_usd;
    private String volume24;
    private String volume24_native;
    private String csupply;
    private String price_btc;
    private String tsupply;
    private String msupply;

    public int getId() {
        return id;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public String getNameid() {
        return nameid;
    }

    public int getRank() {
        return rank;
    }

    public String getPrice_usd() {
        return price_usd;
    }

    public String getPercent_change_24h() {
        return percent_change_24h;
    }

    public String getPercent_change_1h() {
        return percent_change_1h;
    }

    public String getPercent_change_7d() {
        return percent_change_7d;
    }

    public String getMarket_cap_usd() {
        return market_cap_usd;
    }

    public String getVolume24() {
        return volume24;
    }

    public String getVolume24_native() {
        return volume24_native;
    }

    public String getCsupply() {
        return csupply;
    }

    public String getPrice_btc() {
        return price_btc;
    }

    public String getTsupply() {
        return tsupply;
    }

    public String getMsupply() {
        return msupply;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", nameid='" + nameid + '\'' +
                ", rank=" + rank +
                ", price_usd='" + price_usd + '\'' +
                ", percent_change_24h='" + percent_change_24h + '\'' +
                ", percent_change_1h='" + percent_change_1h + '\'' +
                ", percent_change_7d='" + percent_change_7d + '\'' +
                ", market_cap_usd='" + market_cap_usd + '\'' +
                ", volume24='" + volume24 + '\'' +
                ", volume24_native='" + volume24_native + '\'' +
                ", csupply='" + csupply + '\'' +
                ", price_btc='" + price_btc + '\'' +
                ", tsupply='" + tsupply + '\'' +
                ", msupply='" + msupply + '\'' +
                '}';
    }
}
