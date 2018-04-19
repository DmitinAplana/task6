package task6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadStuff {
    ArrayList<String> list = new ArrayList<String>();

    public void start() throws FileNotFoundException {
        int maxValue = 0;
        int numberMaxValue = 0;
        File file = new File("c://project//111.txt");
        Scanner s = new Scanner(file);
        while (s.hasNext()) {
            list.add(s.next().toString());
        }
        s.close();
        //Получили значения и печатаем список
        System.out.println("Прочитали " + list);
        //Сортируем список по алфавиту
        Collections.sort(list);
        System.out.println("после сортировки " + list);
        //Создаём список с совпадениями для слов с помощью вызова метода
        ArrayList<Integer> countList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            int wordCount = countTask6(list.get(i));
            String a = list.get(i);
            countList.add(i, wordCount);
        }
        //Находим 1е максимальное значение  совпадений
        for (int x = 0; x < countList.size(); x++) {
            if (maxValue < countList.get(x)) {
                numberMaxValue = x;
                maxValue = countList.get(x);
            }
        }
        //Печатаем слова с максимальным кол-вом совпадений и количество совпадений
        System.out.println(countList.get(numberMaxValue));
        System.out.println(list.get(numberMaxValue));
    }
        //метод для получения кол-ва повторений слова в списке
    public int countTask6(String word) {
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (word.equals(list.get(i))) {
                counter += 1;
            }
        }
        return counter;
    }
}


