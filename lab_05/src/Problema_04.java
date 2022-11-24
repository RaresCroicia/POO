import java.util.*;

class Warrior {
    public int health;
    public String name;

    public Warrior(){
        this( 100, "Marmontius");
    }

    public Warrior (int health, String name) {
        this.health = health;
        this.name = name;
    }

    public int getDamage(int type){
        return 0;
    }

    public String toString(){
        return name + " are viata: " + health;
    }
}

class SnakeWarrior extends Warrior{
    SnakeWarrior(int health, String name){
        super(health, name);
    }
    public int getDamage(){
        return (12*health)/100;
    }
}

class HardWarrior extends Warrior{
    HardWarrior(int health, String name){
        super(health, name);
    }
    public int getDamage(){
        return (20 * health)/100;
    }
}

class WarriorPack{

    HardWarrior hard;
    SnakeWarrior snake;


    WarriorPack(){
        hard = new HardWarrior(100, "Greuceanu");
        snake = new SnakeWarrior(120, "Serparie");
    }
    WarriorPack(HardWarrior hard, SnakeWarrior snake){
        this.hard = hard;
        this.snake = snake;
    }

    public int calculateDamage() {
        return hard.getDamage() + snake.getDamage();
    }

    public String toString(){
        return hard + "\n" + snake + "\nImpreuna dau: " + calculateDamage() + " damage";

    }

}

public class Problema_04 {
    public static void main(String[] args){
        WarriorPack pack1 = new WarriorPack();
        System.out.println(pack1 + "\n");
        WarriorPack pack2 = new WarriorPack(new HardWarrior(1000, "Razboinicus"), new SnakeWarrior(500, "SSsssss"));
        System.out.println(pack2);
    }
}
