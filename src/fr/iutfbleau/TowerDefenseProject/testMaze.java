package fr.iutfbleau.TowerDefenseProject;

import java.util.Random;

public class testMaze {

    public static void printTab(int [][]tab){
        for(int i = 0; i< tab.length;i++){
            System.out.println();
            for(int j = 0; j<tab[i].length;j++){
                System.out.print(tab[i][j]+" ");
            }
        }
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        int[][] tab = new int[y][x];

        // Initialize the array with -1
        for(int j = 0; j<y;j++){
            for(int i = 0; i<x;i++){
                tab[j][i] = -1;
            }
        }

        Random random = new Random();

        for(int j = 0; j<y; j++){
            boolean unlucky = true;
            for(int i = 0; i<x; i++){
                if(j > 0){
                    if(random.nextInt(2) == 1){
                        tab[j][i] = tab[j - 1][i];
                    } else {
                        if(unlucky && (i < x - 1 && tab[j - 1][i] != tab[j - 1][i + 1]) || (i == x-1 && tab[j - 1][i] != tab[j - 1][i - 1])){
                            tab[j][i] = tab[j - 1][i];
                            unlucky = false;
                        }
                    }
                    if(i < x - 1 && tab[j - 1][i] != tab[j - 1][i + 1]){
                        unlucky = true;
                    }
                }
            }

            for(int i = 0; i<x; i++){
                if(tab[j][i] == -1){
                    tab[j][i] = i + (j * 5);
                }
            }
            if(j==0) {
                for (int i = 0; i < x; i++) {
                    if (random.nextInt(2) == 1 && i > 0) {
                        tab[j][i] = tab[j][i - 1];
                    }
                }
            }

        }

        printTab(tab);
    }
}
