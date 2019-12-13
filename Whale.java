package com.company;

public class Whale implements iAnimal{
    public int ID;

    public String getAnimalType() {
        return "Whale";
    }
    public int getIdTag() {
        return ID;
    }
    public void setIdTag(int anIdTag) {
        ID = anIdTag;
    }
    public int getMinTemperature() {
        return 40;
    }
    public int getMaxTemperature() {
        return 76;
    }
}