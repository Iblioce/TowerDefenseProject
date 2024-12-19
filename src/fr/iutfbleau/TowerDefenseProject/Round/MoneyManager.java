package fr.iutfbleau.TowerDefenseProject.Round;

public class MoneyManager {
    private int money;

    public MoneyManager(){
        this.money = 0;
    }

    public int getMoney(){
        return  this.money;
    }

    public void addMoney(int money){
        this.money = this.money+money;
    }
}
