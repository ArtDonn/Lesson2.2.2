package web.model;

public class Car {

    private int id;
    private String model;
    private String color;
    private int year;

    public Car(int id,String model,String color,int year) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int age) {
        this.year = year;
    }
}