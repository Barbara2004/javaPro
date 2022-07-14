package lesson06.book;


public class Book {
    private String name;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Book(String name) {
        this.name = name;
    }

    public Book() {
    }
}
