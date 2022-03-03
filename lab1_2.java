import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class lab1_2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите путь к файлу, с которого будет происходить считывание");
        Scanner scanner1 = new Scanner(System.in);
        String name1 = scanner1.nextLine();
        FileReader reader = new FileReader(name1);
        Scanner scan = new Scanner(reader);
        int number = scan.nextInt();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < number; i++) {
            arrayDeque.add(scan.nextInt());
        }
        Object[] array = arrayDeque.toArray();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}