package fr.iutfbleau.TowerDefenseProject.Round;

public class RoundManager {
    private TimeManager timeManager;
    private MoneyManager moneyManager;
    private int entitiesRemaining;
    private int turn;

    public RoundManager(TimeManager timeManager, MoneyManager moneyManager){
        this.timeManager = timeManager;
        this.moneyManager = moneyManager;
    }
}
