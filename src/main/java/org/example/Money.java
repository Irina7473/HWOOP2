package org.example;

public class Money {
    private String currencyName;
    private  String coinName;
    public int currency;
    private int coin;
    public String getCurrencyName() {
        return currencyName;
    }
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }
    public String getCoinName() {
        return coinName;
    }
    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }
    public int getCoin() {
        return coin;
    }
    public void setCoin(int coin) {
        if (coin<100) this.coin = coin;
        else {
            this.coin = coin%100;
            this.currency +=(coin - this.coin)/100;
        }
    }

    public  Money (String currencyName, String coinName){
        this.currencyName = currencyName;
        this.coinName = coinName;
    }

    public void shouAmount() {
        System.out.println(currency + " " + currencyName + " " + coin + " " + coinName);
    }


}
