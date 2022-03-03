import java.io.*;
        import java.util.Scanner;

public class lab3_4 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите путь к файлу, с которого будет происходить считывание");
        Scanner scanner1 = new Scanner(System.in);
        String name1 = scanner1.nextLine();
        System.out.println("Введите путь к файлу, в который будут записываться данные");
        Scanner scanner2 = new Scanner(System.in);
        String name2 = scanner2.nextLine();
        FileReader reader = new FileReader(name1);
        Scanner scanner3 = new Scanner(reader);
        PrintWriter writer = new PrintWriter(name2, "UTF-8");
        int k = 0;
        while (scanner3.hasNext()) {
            k = k + 1;
            scanner3.next();
        }
        reader.close();
        writer.print("Общее количество строк: ");
        writer.println(k);
        writer.close();
    }
}