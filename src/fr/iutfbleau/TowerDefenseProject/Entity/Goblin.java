package fr.iutfbleau.TowerDefenseProject.Entity;

public class Goblin extends Entity{

    public Goblin(int hp, int ms, int reward){
        super();
        this.healthPoint = hp;
        this.moveSpeed = ms;
        this.reward = reward;
    }
}
