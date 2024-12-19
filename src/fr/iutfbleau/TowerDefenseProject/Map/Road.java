package fr.iutfbleau.TowerDefenseProject.Map;

import java.util.Random;

public class Road {
    private RoadCase[] roadCaseTab;

    public Road(RoadCase[] roadCaseTab){
        this.roadCaseTab = roadCaseTab;
    }

    public RoadCase getLastRoadCase(){
        return roadCaseTab[roadCaseTab.length-1];
    }

    public RoadCase getFirstRoadCase(){
        return roadCaseTab[0];
    }
}
