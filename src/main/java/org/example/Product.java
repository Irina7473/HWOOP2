package org.example;

public class Product extends Money{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Product(String name, String currencyName, String coinName) {
        super(currencyName, coinName);
        this.name=name;
    }
    public Product(String name, String currencyName, String coinName, int currency, int coin) {
        super(currencyName, coinName);
        this.name=name;
        this.currency = currency;
        this.setCoin(coin);
    }
    public void shouAmount() {
        System.out.print("Товар - " + name + " стоит ");
        super.shouAmount();
    }
    public void priceSetting(int currency, int coin){
        this.currency = currency;
        this.setCoin(coin);
    }

    public void priceReduce(int currency, int coin){
        if (this.currency > currency) this.currency -= currency;
        else {
            System.out.println("Цена товара ниже снижения цены");
            return;
        }
        int odds = this.getCoin() - coin;
        if (odds >= 0) this.setCoin(odds);
        else {
            this.currency -= 1;
            this.setCoin(100 + odds);
        }
    }

}
