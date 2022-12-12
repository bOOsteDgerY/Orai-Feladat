package Main;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner scan = new Scanner(System.in);
        switch (scan.nextLine()){
            case "info":
                System.out.println("Üdvözöllek, ez itt a v1-es projekt!"); break;
            case "exit": System.exit(1); break;
        }
    }
}
