package com.example.wfrphelper.model;

import org.springframework.stereotype.Component;

@Component
public class BasicSkills {
    //1 value - start, 2 value - numSteps
    private int[] art;
    private int[] athletics;
    private int[] bribery;
    private int[] charm;
    private int[] charmAnimal;
    private int[] climb;
    private int[] cool;
    private int[] consumeAlcohol;
    private int[] dodge;
    private int[] drive;
    private int[] endurance;
    private int[] entertain;
    private int[] gamble;
    private int[] gossip;
    private int[] haggle;
    private int[] intimidate;
    private int[] intuition;
    private int[] leadership;
    private int[] melee;
    private int[] navigation;
    private int[] outDoorSurvival;
    private int[] perception;
    private int[] ride;
    private int[] row;
    private int[] stealth;

    public BasicSkills(int[] art, int[] athletics, int[] bribery, int[] charm, int[] charmAnimal, int[] climb, int[] cool, int[] consumeAlcohol, int[] dodge, int[] drive, int[] endurance, int[] entertain, int[] gamble, int[] gossip, int[] haggle, int[] intimidate, int[] intuition, int[] leadership, int[] melee, int[] navigation, int[] outDoorSurvival, int[] perception, int[] ride, int[] row, int[] stealth) {
        this.art = art;
        this.athletics = athletics;
        this.bribery = bribery;
        this.charm = charm;
        this.charmAnimal = charmAnimal;
        this.climb = climb;
        this.cool = cool;
        this.consumeAlcohol = consumeAlcohol;
        this.dodge = dodge;
        this.drive = drive;
        this.endurance = endurance;
        this.entertain = entertain;
        this.gamble = gamble;
        this.gossip = gossip;
        this.haggle = haggle;
        this.intimidate = intimidate;
        this.intuition = intuition;
        this.leadership = leadership;
        this.melee = melee;
        this.navigation = navigation;
        this.outDoorSurvival = outDoorSurvival;
        this.perception = perception;
        this.ride = ride;
        this.row = row;
        this.stealth = stealth;
    }

    public BasicSkills() {
    }

    public int[] getArt() {
        return art;
    }

    public void setArt(int[] art) {
        this.art = art;
    }

    public int[] getAthletics() {
        return athletics;
    }

    public void setAthletics(int[] athletics) {
        this.athletics = athletics;
    }

    public int[] getBribery() {
        return bribery;
    }

    public void setBribery(int[] bribery) {
        this.bribery = bribery;
    }

    public int[] getCharm() {
        return charm;
    }

    public void setCharm(int[] charm) {
        this.charm = charm;
    }

    public int[] getCharmAnimal() {
        return charmAnimal;
    }

    public void setCharmAnimal(int[] charmAnimal) {
        this.charmAnimal = charmAnimal;
    }

    public int[] getClimb() {
        return climb;
    }

    public void setClimb(int[] climb) {
        this.climb = climb;
    }

    public int[] getCool() {
        return cool;
    }

    public void setCool(int[] cool) {
        this.cool = cool;
    }

    public int[] getConsumeAlcohol() {
        return consumeAlcohol;
    }

    public void setConsumeAlcohol(int[] consumeAlcohol) {
        this.consumeAlcohol = consumeAlcohol;
    }

    public int[] getDodge() {
        return dodge;
    }

    public void setDodge(int[] dodge) {
        this.dodge = dodge;
    }

    public int[] getDrive() {
        return drive;
    }

    public void setDrive(int[] drive) {
        this.drive = drive;
    }

    public int[] getEndurance() {
        return endurance;
    }

    public void setEndurance(int[] endurance) {
        this.endurance = endurance;
    }

    public int[] getEntertain() {
        return entertain;
    }

    public void setEntertain(int[] entertain) {
        this.entertain = entertain;
    }

    public int[] getGamble() {
        return gamble;
    }

    public void setGamble(int[] gamble) {
        this.gamble = gamble;
    }

    public int[] getGossip() {
        return gossip;
    }

    public void setGossip(int[] gossip) {
        this.gossip = gossip;
    }

    public int[] getHaggle() {
        return haggle;
    }

    public void setHaggle(int[] haggle) {
        this.haggle = haggle;
    }

    public int[] getIntimidate() {
        return intimidate;
    }

    public void setIntimidate(int[] intimidate) {
        this.intimidate = intimidate;
    }

    public int[] getIntuition() {
        return intuition;
    }

    public void setIntuition(int[] intuition) {
        intuition = intuition;
    }

    public int[] getLeadership() {
        return leadership;
    }

    public void setLeadership(int[] leadership) {
        this.leadership = leadership;
    }

    public int[] getMelee() {
        return melee;
    }

    public void setMelee(int[] melee) {
        this.melee = melee;
    }

    public int[] getNavigation() {
        return navigation;
    }

    public void setNavigation(int[] navigation) {
        this.navigation = navigation;
    }

    public int[] getOutDoorSurvival() {
        return outDoorSurvival;
    }

    public void setOutDoorSurvival(int[] outDoorSurvival) {
        this.outDoorSurvival = outDoorSurvival;
    }

    public int[] getPerception() {
        return perception;
    }

    public void setPerception(int[] perception) {
        this.perception = perception;
    }

    public int[] getRide() {
        return ride;
    }

    public void setRide(int[] ride) {
        this.ride = ride;
    }

    public int[] getRow() {
        return row;
    }

    public void setRow(int[] row) {
        this.row = row;
    }

    public int[] getStealth() {
        return stealth;
    }

    public void setStealth(int[] stealth) {
        this.stealth = stealth;
    }
}
