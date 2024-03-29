package com.example.dentalpro;

public class Medication {
    private String type;
    private String name;
    private int quantity;
    private String details;
    private String month;
    private String day;
    private String year;

    private String medPicture;

    public Medication(){
        // Required empty constructor for Firebase
    }

    public String getType(){ return type; }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMedPicture() {
        return medPicture;
    }

    public void setMedPicture(String medPicture) {
        this.medPicture = medPicture;
    }
}
