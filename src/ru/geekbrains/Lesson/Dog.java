package ru.geekbrains.Lesson;

public class Dog extends Animal {
    String typeOfAnimal;

    // п.5 ДЗ - возможность задавать собственные ограничения.
    public Dog (String name, float runDistance, float swimDistance, float jumpDistance) {
        super(name, runDistance, swimDistance, jumpDistance);
        typeOfAnimal = "Собака";
    }

    // п.3 ДЗ - ограничения по заданным параметрам.
    public Dog (String name) {
        typeOfAnimal = "Собака";
        this.name = name;
        runDistance = 500;
        swimDistance = 10;
        jumpDistance = 0.5f;
    }

    void info () {
        System.out.println(typeOfAnimal + " " + name + "  " + runDistance + " " +
                swimDistance + " " + jumpDistance );
    }

}
