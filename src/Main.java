import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{

        String text = readFromFile("res/input.txt");
        MyDictionary myDictionary = new MyDictionary(text);

    }

    public static int inputFromKeyboard(String title){
        Scanner cin = new Scanner(System.in);
        System.out.println("Input " + title + ":");
        return Integer.parseInt(cin.nextLine());
    }

    public static String readFromFile(String path) throws IOException {
        File file = new File(path);
        Scanner cin = new Scanner(file);
        String result = "";
        while (cin.hasNext()){
            result += cin.nextLine();
        }
        return result;
    }
}
