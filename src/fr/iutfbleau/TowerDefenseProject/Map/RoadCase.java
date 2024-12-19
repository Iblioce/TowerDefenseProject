package fr.iutfbleau.TowerDefenseProject.Map;

import fr.iutfbleau.TowerDefenseProject.Entity.Entity;

import java.util.List;

public class RoadCase extends Case{
    private int x;
    private int y;
    private List<Entity> entitiesList;

    public RoadCase(int x, int y){
    }

    @Override
    public boolean isGrass() {
        return false;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
}
