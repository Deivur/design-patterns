package com.idenys.pattern.strategy;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Attack sword!");
    }
}
