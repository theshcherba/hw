import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lab3_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader fin = new FileReader("C://Users//Admin//IdeaProjects//Домашнее задание на 18.02.2022//src//2.txt");
        String name;
        int c;
        System.out.println("Print File? YES/NO");
        name = br.readLine();
        if (name.equals("YES"))
            while ((c = fin.read()) != -1) System.out.print((char) c);
    }
}
