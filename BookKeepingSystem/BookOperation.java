package BookKeepingSystem;

import static BookKeepingSystem.BookKeepingSystem.inputInt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookOperation {

    public final ArrayList<Book> books = new ArrayList<>();
    public final ArrayList<Category> categories = new ArrayList<>();
    public Scanner sc = new Scanner(System.in);

    BookOperation() {}

    public void add() {
        System.out.println("Adding book:");
        System.out.print("Enter id: ");
        int id = inputInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter author's name: ");
        String author = sc.nextLine();
        Category category = enterCategory();
        
        if (books.add(new Book(id, name, author, category))) {
            System.out.println("Book added successfully");
        } else {
            System.out.println("Could not add book");
        }
    }

    public void delete() {
        System.out.println("Deleting book:");
        System.out.print("Enter id: ");
        int id = inputInt();

        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book b = iterator.next();
            if (b.getId() == id) {
                iterator.remove();
                System.out.println("Book deleted successfully");
                return;
            }
        }
        System.out.println("Could not find book to delete");
    }

    public void update() {
        System.out.println("Updating Book:");
        System.out.print("Enter id: ");
        int id = inputInt();
        sc.nextLine(); // Consume newline

        for (Book b : books) {
            if (b.getId() == id) {
                System.out.print("Enter new name: ");
                String name = sc.nextLine();
                System.out.print("Enter new author's name: ");
                String author = sc.nextLine();
                Category category = enterCategory();
                b.update(name, author, category);
                System.out.println("Book updated successfully");
                return;
            }
        }
        System.out.println("Could not find book to update");
    }

    public void getAll() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    public Category enterCategory() {
        System.out.print("Enter category name: ");
        String categoryName = sc.nextLine();
        Category c = getCategory(categoryName);

        if (c == null) {
            System.out.println("Invalid Category, please try again.");
            return enterCategory(); // Properly return the recursive call result
        }
        return c;
    }

    public Category getCategory(String name) {
        for (Category c : categories) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }
}
