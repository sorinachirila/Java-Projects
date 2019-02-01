package com.yonder.vm.model;

public class Coin implements Comparable<Coin>{

    private Integer cod;
    private Integer value;

    public Coin(Integer cod, Integer value) {
        this.cod = cod;
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    @Override
    public int compareTo(Coin coin) {
        return coin.value.compareTo(this.value);
    }
}
