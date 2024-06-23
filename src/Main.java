import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\merta\\IdeaProjects\\DosyadanSayiOkuTop\\src\\Notes.txt";
        File file = new File(path);
        if (!file.exists()) file.createNewFile();

        FileReader fReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fReader);
        String line;

        System.out.println("---- Notes ----");
        while ((line = bReader.readLine()) != null) {
            System.out.println(line);
        }
        bReader.close();

        Scanner input = new Scanner(System.in);
        System.out.println("Not yazmaya hazırsınız :  ");
        String str = input.nextLine();


        FileWriter fWriter = new FileWriter(file, true);
        BufferedWriter bWriter = new BufferedWriter(fWriter);
        bWriter.write(str);
        bWriter.newLine();

        bWriter.close();

    }
}