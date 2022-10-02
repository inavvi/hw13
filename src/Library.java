public class Library {
    private final Book[] books;
    private int size;

    public Library() {
        this.books = new Book[10];
    }

    public void addBook(String id, String nameBook, String  publishingYear) {
        Book newBook = new Book(id, nameBook, publishingYear);
        books[size++] = newBook;
    }

    public int getCurrentSize() {
        return size;
    }

    public void printBook(String id) {
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            if (book.getId().equals(id)) {
                System.out.println(book.getId() + ": " + book.getNameBook());
                return;
            }
        }
        System.out.println("Книга " + id + " не найдена.");
    }

    public void printAllBooks() {
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            System.out.println(book.getId() + ": " + book.getNameBook()+" " + book.getPublishingYear());
        }
    }

    public void getSeparation(String symbol) {
        String a=symbol;
        System.out.println(a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a);
    }
}