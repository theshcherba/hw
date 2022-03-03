import java.io.*;
import java.util.*;


public class lab1_5 {
    public static <in> void  main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Лена\\IdeaProjects\\dz\\src\\file3.txt");

        //создаем объект FileReader для объекта File
        FileReader fr = new FileReader(file);

        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader reader = new BufferedReader(fr);

        //созадем словарь
        HashMap<String, Integer> dictionary = new HashMap<String, Integer>();

        // считаем сначала первую строку
        String line = reader.readLine();
        while (line != null) {
            line = line.toLowerCase(); //каждую строку приводим к  нижнему регистру, чтобы не было повторений

            //если слово еще не встречалось в файле, то оно добавляется в словарь (ключ)
            //и указывается, что оно встретилось 1 раз (значение)
            if(!dictionary.containsKey(line)) {
                dictionary.put(line,1); //добавляем в словарь
            }
            //иначе (слово уже встречалось в файле и было добавлено в словарь,
            //то значение словаря для этого ключа (слова) увеличивается на 1
            else {
                dictionary.put(line, dictionary.get(line)+1); //увеличиваем значение повторений на 1
            }

            line = reader.readLine(); // считываем остальные строки в цикле
        }

        System.out.println("Набор уникальных слов из файла: ");
        dictionary.keySet().forEach(key -> {
            System.out.println(key);
        });

        //сложный уровень
        System.out.println("\nНабор уникальных слов из файла и количество их повторений: ");
//        System.out.println(dictionary.toString());
        dictionary.forEach((key, value) -> {
            System.out.printf("Слово %s встретилось в тексте %d раз(-а) \n", key, value);
        });

    }
}
