package ru.geekbrains.javathree.lesson_01;

import java.util.Arrays;
import java.util.List;

/**
 * 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
 * 2. Написать метод, который преобразует массив в ArrayList;
 * 3. Большая задача:
 * a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
 * b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 * c. Для хранения фруктов внутри коробки можете использовать ArrayList;
 * d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
 * e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
 * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
 * g. Не забываем про метод добавления фрукта в коробку.
 */

public class Main {

    public static void main(String[] args) {
        String[] arrString = {"One", "two", "three", "four"};
        System.out.println(Arrays.toString(arrString)); // Task 1
        elementsSwap(arrString, 0, 3); // Task 1
        System.out.println(Arrays.toString(arrString)); // Task 1

        List<String> list = convertToList(arrString); // Task 2
        System.out.println(list.getClass() + " : " + list); // Task 2
    }


    // method: Task 1
    private static <T> void elementsSwap(T[] array, int a, int b) {
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    // method: Task 2
    private static <T> List<T> convertToList(T[] array) {
        return Arrays.asList(array);
    }

}
