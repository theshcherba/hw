import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

public class lab1_4 {
    public static void  main(String[] args) throws IOException {
        TreeSet collection = new TreeSet();
        File file = new File("C:\\Users\\Лена\\IdeaProjects\\dz\\src\\file2.txt");
        //создаем объект FileReader для объекта File
        FileReader fr = new FileReader(file);
        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader reader = new BufferedReader(fr);
        // считаем сначала первую строку
        String line = reader.readLine();
        while (line != null) {
            collection.add(line);
            line = reader.readLine(); // считываем остальные строки в цикле
        }

        collection.forEach((s) -> {
            System.out.println(s);
        });

    }
}
