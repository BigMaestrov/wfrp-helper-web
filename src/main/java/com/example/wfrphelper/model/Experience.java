package com.example.wfrphelper.model;

import org.springframework.stereotype.Component;

@Component
public class Experience {
    private int currentExp;
    private int spentExp;
    private int totalExp;
    private int improveSteps;
    public final int[][] tableOfImproveCost = new int[][]{
            //Steps taken development
            {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70},
            //Characteristic cost for steps
            {30, 40, 50, 70, 90, 120, 150, 190, 230, 280, 330, 390, 450, 520},
            //Skill cost for steps
            {15, 20, 30, 40, 60, 80, 110, 140, 180, 220, 270, 320, 380, 440}};

    public Experience(int currentExp, int spentExp, int totalExp, int improveSteps) {
        this.currentExp = currentExp;
        this.spentExp = spentExp;
        this.totalExp = totalExp;
        this.improveSteps = improveSteps;
    }

    public Experience() {
    }

    public int[][] getTableOfImproveCost() {
        return tableOfImproveCost;
    }

    public int getCurrentExp() {
        return currentExp;
    }

    public void setCurrentExp(int currentExp) {
        this.currentExp = currentExp;
    }

    public int getSpentExp() {
        return spentExp;
    }

    public void setSpentExp(int spentExp) {
        this.spentExp = spentExp;
    }

    public int getTotalExp() {
        return totalExp;
    }

    public void setTotalExp(int totalExp) {
        this.totalExp = totalExp;
    }

    public int getImproveSteps() {
        return improveSteps;
    }

    public void setImproveSteps(int improveSteps) {
        this.improveSteps = improveSteps;
    }
}
