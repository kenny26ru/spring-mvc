package web.model;

public class Car {
    private String mark;
    private int series;
    private String color;
    private int countDriver;

    public Car() {
    }

    public Car(String mark, int series, String color) {
        this.mark = mark;
        this.series = series;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car:" +
                " mark = '" + mark + '\'' +
                ", series = " + series +
                ", color = '" + color + '\'';
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
