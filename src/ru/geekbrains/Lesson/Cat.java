package ru.geekbrains.Lesson;

public class Cat extends Animal {
    String typeOfAnimal;

// п.5 ДЗ - возможность задавать собственные ограничения.
    public Cat (String name, float runDistance, float swimDistance, float jumpDistance) {
        super(name, runDistance, swimDistance, jumpDistance);
        typeOfAnimal = "Кот(кошка)";

    }
// п.3 ДЗ - ограничения по заданным параметрам.
    public Cat (String name) {
        typeOfAnimal = "Кот(кошка)";
        this.name = name;
        runDistance = 200;
        swimDistance = 0;
        jumpDistance = 2;
    }

    void info () {
        System.out.println(typeOfAnimal + " " + name + "  " + runDistance + " " +
                swimDistance + " " + jumpDistance );
    }
}
