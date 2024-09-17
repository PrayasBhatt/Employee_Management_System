package models;

public class Workhour {
    int NormalTime;
    int OverTime;

    public Workhour(int normalTime, int overTime) {
        NormalTime = normalTime;
        OverTime = overTime;
    }

    public int getNormalTime() {
        return NormalTime;
    }

    public void setNormalTime(int normalTime) {
        NormalTime = normalTime;
    }

    public int getOverTime() {
        return OverTime;
    }

    public void setOverTime(int overTime) {
        OverTime = overTime;
    }
}
