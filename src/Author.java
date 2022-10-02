import java.awt.print.Book;

public class Author {
    private String name;
    private String latName;
    private String surname;

    public Author(String name, String latName, String surname) {
        this.name=name;
        this.latName=latName;
        this.surname=surname;
    }

    @Override
    public String toString() {
        return name + " " + latName+" " + surname;
    }
}

