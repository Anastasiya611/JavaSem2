import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

// 2. Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
public class z2 {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("text.txt");
        Scanner iScanner = new Scanner(fr);
        System.out.println(iScanner);
        StringBuilder bild = new StringBuilder();

        while (iScanner.hasNextLine()) {
            String line = iScanner.nextLine();
            String[] nums = line.split("\"");
            bild.append("Студент ");
            bild.append(nums[3]).append(" ").append("получил").append(" ");
            bild.append(nums[7]).append(" ").append("по предмету ").append("").append(nums[11]);
            bild.append("\n");
        }

        System.out.println(bild.toString());
        FileWriter fw = new FileWriter("new_students.txt");
        fw.write(bild.toString());

        fr.close();
        fw.close();
    }
}