package com.company;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(test(generateRandomAge(), 23));
        System.out.println(test(generateRandomAge(), 23));
        System.out.println(test(4, 35));
        System.out.println(test(34, 23));
        System.out.println(test(generateRandomAge(), 23));
        System.out.println(test(34, 23));
        System.out.println(generateRandomAge());
        System.out.println(generateRandomAge());
    }

    public static String test(int age, int temp) {

        if ((age >= 20 && age <= 45) && (temp >= -2 && temp <= 30))
            return "Можно идти гулять1";
        else if (age < 20 && temp >= 0 && temp <= 28)
            return "Можно идти гулять2";
        else if (age >= 45 && temp >= -10 && temp <= 25)
            return "Можно идти гулять3";
        else return "Оставайтесь дома";
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100);
    }

}
