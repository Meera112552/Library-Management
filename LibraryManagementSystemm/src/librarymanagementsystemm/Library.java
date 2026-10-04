/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystemm;
import java.util.*;
/**
 *
 * @author Meera
 */
public class Library {
    ArrayList<String> books = new ArrayList<>();
    HashSet<Integer> bookIds = new HashSet<>();
    HashMap<Integer, String> bookMap = new HashMap<>();

    // Add book
    void addBook(int id, String name) {

        if (bookIds.contains(id)) {
            System.out.println("Book ID already exists!");
        } else {
            books.add(name);
            bookIds.add(id);
            bookMap.put(id, name);

            System.out.println("Book added successfully!");
        }
    }

    // Display books
    void displayBooks() {

        System.out.println("\n--- Available Books ---");

        if (bookMap.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Map.Entry<Integer, String> book : bookMap.entrySet()) {
                System.out.println(
                    "ID: " + book.getKey()
                    + " | Book: " + book.getValue()
                );
            }
        }
    }

    // Search book
    void searchBook(int id) {

        if (bookMap.containsKey(id)) {
            System.out.println("Book Found: " + bookMap.get(id));
        } else {
            System.out.println("Book not found!");
        }
    }

    // Remove book
    void removeBook(int id) {

        if (bookMap.containsKey(id)) {

            String name = bookMap.remove(id);
            bookIds.remove(id);
            books.remove(name);

            System.out.println("Book removed successfully!");
        } else {
            System.out.println("Book not found!");
        }
    }
}
    

