package com.POOCC.lab05;

/**
 * 
 */
public class Warrior {
    public static final int SNAKE_Warrior = 0;
    public static final int OGRE_Warrior = 1;
    public static final int MARSHMALLOW_MAN_Warrior = 2;

    //Stores one of the three above types
    public int type;
    //0 = dead, 100 = full strength
    public int health;
    public String name;

    public Warrior (int type, int health, String name) {
        this.type = type;
        this.health = health;
        this.name = name;
    }
}

class WarriorPack {
    private Vector warriors ;

    public WarriorPack () {
        warriors = new Vector();
    }

    public void addWarrior(Warrior newWarrior) {
        warriors.add(newWarrior);
    }

    public Vector getWarriors() {
        return warriors ;
    }

    public int calculateDamage() {
        int damage = 0;
        for (int i = 0; i < warriors.length; i++) {
            if (warriors.get(i).type == Warrior.SNAKE_Warrior) {
                //Snake does 10 damage
                damage += 10;
            } else if (warriors.get(i).type == Warrior.OGRE_Warrior) {
                //Ogre does 6 damage
                damage += 6;
            } else if (warriors.get(i).type == Warrior.MARSHMALLOW_MAN_Warrior) {
                //Marshmallow Man does 1 damage
                damage += 1;
            }
        }
        return damage;
    }
}