package Main;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        switch (scan.nextLine()){
            case "hello": System.out.println("Hello World!!!"); break;
            case "info":
                System.out.println("Üdvözöllek, ez itt a v2-es projekt!"); break;
            case "exit": System.exit(1); break;
            case "help":
                System.out.println("Parancsok: hello/info/help/exit"); break;
        }
    }
}