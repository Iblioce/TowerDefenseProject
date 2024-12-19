package fr.iutfbleau.TowerDefenseProject;

import fr.iutfbleau.TowerDefenseProject.Map.Case;
import fr.iutfbleau.TowerDefenseProject.Map.RoadCase;
import fr.iutfbleau.TowerDefenseProject.Map.World;
import fr.iutfbleau.TowerDefenseProject.SimplestView.WorldView;

public class Main {
    public static void main(String[] args) {

        World world = new World(5,5);

        WorldView mapView = new WorldView(world);
        mapView.PrintWorld();
    }
}