public class Library {
    private final Book[] books;
    private int size;

    public Library() {
        this.books = new Book[4];
    }

    public void addBook(String id, Author author, String nameBook, String  publishingYear) {
        Book newBook = new Book(id, author, nameBook, publishingYear);
        books[size++] = newBook;
    }

    public void removeBook(String id) {
        int newSize=size;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getId().equals(id)) {
                System.out.println("Книга " + books[i].getId() + " удалена");
                System.arraycopy(books, i + 1, books, i, size - i - 1);
                books[size - 1] = null;
                size=newSize-1;
                return;
            }
        }
    }

    public void setPublishingYear(String id, String year) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getId().equals(id)) {
                String a=books[i].getPublishingYear();
                String result=books[i].setPublishingYear(year);
                System.out.println("Книга id:" +books[i].getId()+" дата " +a + " заменена на "+result);
                return;
            }
        }
    }

    public int getCurrentSize() {
        return size;
    }

    public void printBook(String id, Author author) {
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            if (book.getId().equals(id)) {
                System.out.println(book.getId() + ": " +author+" " +book.getNameBook()+" "+book.getPublishingYear());
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

    public void getSeparation() {
        String a="-";
        System.out.println(a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a+a);
    }
}