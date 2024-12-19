package fr.iutfbleau.TowerDefenseProject.Map;

import fr.iutfbleau.TowerDefenseProject.Tower.Tower;

public class GrassCase extends Case{
    private Tower tower;

    public GrassCase(){
        this.tower = null;
    }

    @Override
    public boolean isGrass() {
        return true;
    }

    public GrassCase(Tower tower){
        this.tower = tower;
    }

    public Tower getOnMe(){
        return this.tower;
    }
}
