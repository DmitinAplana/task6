package task6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
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
        System.out.println("Сортировка по алфавиту " + list);
        //Избавляемся от дублей в списке и сохраняем метод .get
        ArrayList<Integer> countList = new ArrayList();
        HashSet<String> hashSetlist = new HashSet<>(list);
        ArrayList convertedSetList = new ArrayList(hashSetlist);
        //Пишем список всех слов
        System.out.println("Список всех слов и количество совпадений:");
        for (int i = 0; i < convertedSetList.size(); i++) {
            String word = (String) convertedSetList.get(i);
            System.out.println(convertedSetList.get(i) + " " + countTask6(word));
            countList.add(i, countTask6(word));

        }//Считаем наибольшее количество совпадений
        for (int x = 0; x < countList.size(); x++) {
            if (maxValue < countList.get(x)) {
                numberMaxValue = x;
                maxValue = countList.get(x);
            }
        }
        //Печатаем слова с максимальным кол-вом совпадений и количество совпадений
        System.out.println("максимальное количество совпадений: " + convertedSetList.get(numberMaxValue) + " " + countList.get(numberMaxValue));

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


