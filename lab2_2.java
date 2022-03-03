import java.io.*;
import java.util.*;

public class lab2_2 {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String text = reader.readLine();
//        if (text.equals("hello")){
//            System.out.print("Hello, ");
//            for (String str : args) {
//                System.out.print(str + " ");
//            }
//        }
        Scanner sc = new Scanner(System.in);//Тут делаем,чтобы можно было что нибудь ввести в командную строку
        String comand = sc.nextLine();
        String q = args[0];
        if(comand.contains("hello")){
            System.out.println("Список поддерживаемых команд:");
            System.out.println("dir — выводит список файлов в текущей директории");
            System.out.println(q);
        }

        String co = sc.nextLine();//Тут вводим новый стринг чтобы можно было чтонибудь ввести после хелп
        if(comand.equals("dir") || co.equals("help")|| co.equals("dir")){
            String list[] = new File(".").list();
            for(int i = 0; i < list.length; i++)
                System.out.println(list[i]);
        }
    }
}
