package org.example;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kong.unirest.Unirest;
import kong.unirest.HttpResponse;
import kong.unirest.UnirestException;
import java.nio.file.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {

        String booksUrl = "http://10.151.168.5:3138/books";
        String magazineUrl = "http://10.151.168.5:3138/magazines";
        Gson gson = new Gson();

        Library BooksList = new Library();
        Library MagazinesList = new Library();

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
            try{
                HttpResponse<String> getBooks = Unirest.get(booksUrl).asString();
                String book = getBooks.getBody();

                BooksList.addBook(book);
            }catch (UnirestException e){
                IO.println("fel" + e.getLocalizedMessage());
            }
        } else if (choice == 2) {
            try{
                HttpResponse<String> getMagazine = Unirest.get(magazineUrl).asString();
                String magazine = getMagazine.getBody();

                MagazinesList.addMagazine(magazine);
            }catch (UnirestException e){
                IO.println("fel" + e.getLocalizedMessage());
            }
        } else if (choice == 3) {
            System.out.println("Skriver ut böcker:");
            System.out.println(BooksList.Books);
        } else if (choice == 4) {
            System.out.println("Skriver ut tidningar:");
            System.out.println(MagazinesList.Magazines);

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
