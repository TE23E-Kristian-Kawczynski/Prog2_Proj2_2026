package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import com.google.gson.Gson;

public class Main {
    static void main() {

        String booksUrl = "http://10.151.168.5:3138/books";
        String magazineUrl = "http://10.151.168.5:3138/magazines";
        Gson gson = new Gson();

        //Läser input
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while(true){
        //Meny
        System.out.println("""
                Klient
                1. Hämta Böcker
                2. Hämta Tidningar
                3. Skriv ut böcker
                4. Skriv ut tidningar
                5. Lägg till bok
                6. Lägg till tidning
                7. Avsluta
                """);

        //hantera input
            if (scanner.hasNextInt()){
                choice = scanner.nextInt();
            } else{
                System.out.println("Invalid input");
                scanner.next();
                continue;
            }

            //Hantera val
        if(choice == 1){
            System.out.println("option 1");
        } else if (choice == 2) {
            System.out.println("option 2");
        } else if (choice == 3) {
            System.out.println("option 3");
        } else if (choice == 4) {
            System.out.println("option 4");
        } else if (choice == 5) {
            System.out.println("option 5");
        } else if (choice == 6) {
            System.out.println("option 6");
        } else if (choice == 7) {
            System.exit(0);
        } else {
            System.out.println("Invalid input, kontrollera att du valde ett alternativ");
        }

        }


    }
}
