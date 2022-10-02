import java.awt.print.Book;
import java.util.Objects;

public class Author {
    private String name;
    private String latName;
    private String surname;

    public Author(String name, String latName, String surname) {
        this.name=name;
        this.latName=latName;
        this.surname=surname;
    }
    public String getAuthor(Author author) {
        return name+latName+surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && latName.equals(author.latName) && surname.equals(author.surname);
        // Запуск генератора метода Alt+Insert
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, latName, surname);
    }

    @Override
    public String toString() {
        return name + " " + latName+" " + surname;
    }
}

