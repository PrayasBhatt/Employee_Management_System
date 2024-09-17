package models;

public class Salary {
    String Date;
    int Amount;

    public Salary(String date, int amount) {
        Date = date;
        Amount = amount;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }
}
