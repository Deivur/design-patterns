package com.idenys.pattern.strategy;

public class StrategyRunner {

    public static void main(String[] args) {
        King king = new King(new SwordBehavior());
        king.fight();

        Queen queen = new Queen(new BowBehavior());
        queen.fight();
    }
}
