package com.idenys.pattern.strategy;

public class BowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Attack from the bow!");
    }
}
