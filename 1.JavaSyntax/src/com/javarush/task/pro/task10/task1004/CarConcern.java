package com.javarush.task.pro.task10.task1004;

/* 
Жажда скорости
*/

import java.util.Objects;

public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public CarConcern(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Оранжевый";
    }

    public CarConcern(String model) {
        this.model = model;
        this.year = 4321;
        this.color = "Оранжевый";
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        CarConcern that = (CarConcern) o;
//        return year == that.year && Objects.equals(model, that.model) && Objects.equals(color, that.color);
//    }
//
    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, year, color);
    }

    //    @Override
//    public String toString() {
//        return "CarConcern{" +
//                "manufacturer='" + manufacturer + '\'' +
//                ", model='" + model + '\'' +
//                ", year=" + year +
//                ", color='" + color + '\'' +
//                '}';
//    }
}

class Test {
    public static void main(String[] args) {
        CarConcern carConcern = new CarConcern("Urus2", 1500, "orange5");
        System.out.println(carConcern.toString());

    }
}
