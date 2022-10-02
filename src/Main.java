import java.awt.print.Book;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Author chehov = new Author("Антон","Павлович","Чехов");
        Author lermontov = new Author("Михаил", "Юрьевич", "Лермонтов");
        library.addBook("ch01", "Барыня", "2008");
        library.addBook("ch02","Дама с собачкой", "2003");
        library.addBook("ler01","Стихи. Избранное", "2007");
        System.out.println(new Book[0]);
        library.getSeparation("-");
        library.printBook("ch01");
        System.out.println(chehov);
        library.getSeparation("-");
        library.printBook("ler01");
        System.out.println(lermontov);
        library.getSeparation("-");
        System.out.println(library.getCurrentSize());
        library.printAllBooks();
    }
}