package ru.geekbrains.Lesson;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", 300, 5, 2);
        Cat cat2 = new Cat("Мурка");
        Dog dog1 = new Dog("Жучка");
        Dog dog2 = new Dog("Веста", 700, 10.5f,1);
        Animal animal1 = new Animal("Хома", 5, 0, 0.1f);


        Animal[] animals = {cat1, cat2, dog1, dog2, animal1};

        System.out.print("Сможет ли животное преодолеть препятствие: ");
        System.out.println(cat1.name + ", " + cat2.name + ", " + dog1.name + ", " + dog2.name + ", " + animal1.name);
        System.out.println("Выберете животное (введите имя):");
        String nameOfAnimal = scanner.nextLine();
        for (int i = 0; i < animals.length; i++) {
            if (nameOfAnimal.equals(animals[i].name)) {
                System.out.println("Выберете действие: 1 - бег, 2 - плавание, 3 - прыжок");
                switch ((int) getNumberFromConsol()) {
                    case 1:
                        System.out.println(isPossibleToRun(animals[i]));
                        break;
                    case 2:
                        System.out.println(isPossibleToSweem(animals[i]));
                        break;
                    case 3:
                        System.out.println(isPossibleToJump(animals[i]));
                        break;
                }
            }
        }

    }
    static boolean isPossibleToRun(Animal animal) {
        float obstacle;
        System.out.println("Сможет ли " + animal.name + " пробежать заданное расстояние? Введите число:");
        obstacle = getNumberFromConsol();
        if (obstacle <= animal.runDistance) return true;
        return false;
    }
    static boolean isPossibleToSweem(Animal animal) {
        if (animal.swimDistance == 0){
            System.out.println(animal.name + "  не умеет плавать!");
            return false;
        }
        System.out.println("Сможет ли " + animal.name + " проплыть заданное расстояние? Введите число:");
        float obstacle;
        obstacle = getNumberFromConsol();
        if (obstacle <= animal.swimDistance) return true;
        return false;
    }
    static boolean isPossibleToJump(Animal animal) {
        float obstacle;
        System.out.println("Сможет ли " + animal.name + " прыгнуть на заданную высоту? Введите число:");
        obstacle = getNumberFromConsol();
        if (obstacle <= animal.jumpDistance) return true;
        return false;
    }

    static float getNumberFromConsol () {
        while (!scanner.hasNextFloat()) {
            System.out.println("Введите число");
            scanner.nextLine();
        }
        return scanner.nextFloat();
    }

}
