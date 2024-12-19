package fr.iutfbleau.TowerDefenseProject.SimplestView;

import fr.iutfbleau.TowerDefenseProject.Map.World;

public class WorldView {
    private World world;

    public WorldView(World world){
        this.world = world;
    }

    public void PrintWorld(){
        for(int i = 0;i<world.getColumns();i++){
            System.out.println();
            for(int j = 0;j<world.getRows();j++){
                System.out.print(world.getCase(i,j)+" ");
            }
        }
    }

}
