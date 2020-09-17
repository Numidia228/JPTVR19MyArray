package com.company;

import java.util.Random;

class App {
    public void run() {
        int sum = 0;
        System.out.println("++++++ Программа MyArray ++++++");
        System.out.println("Создать массив типа int с название myArray с 20 ячейками");
        int[] myArray = new int[20];
        System.out.println("Заполните массив случайными значениями в диапозоне от 0 до 50");
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(49 + 1);
        }
        System.out.println("Вывести значения массива на экран:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("%4d", myArray[i]);
        }
        System.out.println();
        System.out.println("Массив в обратном порядке: ");
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.printf("%4d", myArray[i]);
        }
        System.out.println();
        System.out.println("Сумма ячеек: ");
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println(sum);

        System.out.println("Первая половина массива: ");
        for (int i = 0; i < myArray.length / 2; i++) {
            System.out.printf("%3d ", myArray[i]);
        }
        System.out.println();
        System.out.println("Вторая половина массива: ");
        for (int i = myArray.length / 2; i < myArray.length; i++) {
            System.out.printf("%3d ", myArray[i]);
        }
    }
}
