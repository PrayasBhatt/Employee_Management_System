package models;

public class Building {
    int Capacity;
    String Location;
    int BuildingNo;

    public Building(int capacity, String location, int buildingNo) {
        Capacity = capacity;
        Location = location;
        BuildingNo = buildingNo;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public int getBuildingNo() {
        return BuildingNo;
    }

    public void setBuildingNo(int buildingNo) {
        BuildingNo = buildingNo;
    }
}
