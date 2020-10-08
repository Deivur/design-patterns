package com.idenys.pattern.decorator;

public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "class=" + this.getClass().getCanonicalName() + ", " +
                "description='" + getDescription() + '\'' + ", " +
                "cost=" + cost() +
                '}';
    }
}
