package com.company;

class animal implements iAnimal {

    private int id;
    private String type;
    private int min; // the min temperature for enclosure
    private int max; // the max temperature for enclosure

    public animal(String _type, int _id, int _min, int _max)
    {
        id = _id;
        type = _type;
        min = _min;
        max = _max;
    }
    @Override
    public String getAnimalType() {
        return type;
    }

    @Override
    public int getIdTag() {
        return id;
    }

    @Override
    public void setIdTag(int anIdTag) {
        id = anIdTag;
    }

    @Override
    public int getMinTemperature() {
        return min;
    }

    @Override
    public int getMaxTemperature() {
        return max;
    }
    public String toString() {
        return "Type: "+type+" Id: "+id;
    }

}

