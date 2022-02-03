package ru.mirea.lab2;

import java.util.*;
import java.util.regex.*;

public  class Task3 {
    public static void countVowels() {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words = str.split(" ");//делим по пробелам
        Map<Integer,ArrayList<String>> states = new HashMap<>();
        String sortedMap="";

        Pattern pattern = Pattern.compile("[аеёиоуыэюяАЕЁИОУЫЭЮЯ]");//регулярное выражения для определения гласных в строке

        for (int i = 0; i < words.length; i++) {

            Matcher matcher = pattern.matcher(words[i]);//поиск совпадений
            int count = 0;
            while (matcher.find()) {
                count++;//счётчик для подсчёта кол-ва гласных в слове
            }
            int j=0;//счётчик для индекса первой гласной

            while (!pattern.matcher(words[i].substring(0,j)).find())
            {
                j++;//ищем индекс первой гласной
            }
            words[i]=words[i].substring(0,j-1)+Character.toUpperCase(words[i].charAt(j-1))+words[i].substring(j);//так как String
            //неизменяемый класс, то простое изменение регистра не сработает. Пробовал через Sb но нет...Поэтому мы не изменяем, а
            //записываем новое слово!

            if(states.containsKey(count)) {
                states.get(count).add(words[i]);//добавление в map
            } else {
                ArrayList<String> identicalWords = new ArrayList<String>();
                identicalWords.add(words[i]);//одинаковые слова под одним ключом
                states.put(count, identicalWords);
            }

        }

        for(Map.Entry entry: states.entrySet()){//сортировка
            sortedMap=entry.getKey() +" "+entry.getValue()+" "+sortedMap;
        }

        System.out.println(sortedMap);
    }

}
