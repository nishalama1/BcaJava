package BookKeepingSystem;

public class Book {
    private int id;
    private String name;
    private String author;
    private Category category;

    public Book(int id, String name, String author, Category category2) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category2;
    }

    public int getId() {
        return id;
    }

    public void update(String name, String author, Category category2) {
        this.name = name;
        this.author = author;
        this.category = category2;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", category=" + category +
                '}';
    }
}
