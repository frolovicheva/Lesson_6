package ru.geekbrains.Lesson;

import java.util.Scanner;

public class Animal {
    String name;
    float runDistance;
    float swimDistance;
    float jumpDistance;

    public Animal (String name, float runDistance, float swimDistance, float jumpDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.jumpDistance = jumpDistance;
    }


    public Animal() {
    }
}
