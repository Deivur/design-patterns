package com.idenys.pattern.decorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    protected Beverage beverage;

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
