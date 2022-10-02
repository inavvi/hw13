import java.awt.print.Book;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Author chehov = new Author("Антон","Павлович","Чехов");
        Author bchehov = new Author("Антон","Павлович","Чехов");
        Author lermontov = new Author("Михаил", "Юрьевич", "Лермонтов");
        library.addBook("ch01", chehov,"Барыня", "2008");
        library.addBook("ch02",chehov,"Дама с собачкой", "2003");
        library.addBook("ch03",chehov,"Чайка", "2005");
        library.addBook("ler01",lermontov,"Стихи. Избранное", "2007");
        library.removeBook("ch03");
        library.setPublishingYear("ch01","2007");
        library.getSeparation();
        System.out.println(chehov.equals(bchehov));
        System.out.println(chehov.equals(lermontov));
        library.getSeparation();
        System.out.println(lermontov.hashCode());
        System.out.println(lermontov.toString());
        library.getSeparation();
        library.printBook("ch01",chehov);
        library.getSeparation();
        library.printBook("ler01",lermontov);
        library.getSeparation();
        System.out.println(library.getCurrentSize());
        library.printAllBooks();
    }
}