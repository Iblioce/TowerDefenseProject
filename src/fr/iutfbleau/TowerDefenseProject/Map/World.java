package fr.iutfbleau.TowerDefenseProject.Map;

public class World {
    private Case[][] caseTab;
    private Road road;

    public World(int x, int y){
        this.caseTab = new Case[x][y];
        for(int i = 0; i<x;i++){
            for(int j = 0; j<y;j++){
                this.caseTab[i][j] = new GrassCase();
            }
        }

        this.road = new Road(new RoadCase[15]);
    }

    public Case getCase(int x , int y){
        return this.caseTab[x][y];
    }

    public int getRows(){
        return this.caseTab.length;
    }

    public int getColumns(){
        return this.caseTab[0].length;
    }
}
