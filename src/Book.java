public class Book {

        private final String id;
        private final Author author;
        private String nameBook;
        private String publishingYear;

        public Book(String id, Author author, String nameBook, String publishingYear) {
            this.id = id;
            this.author = author;
            this.nameBook = nameBook;
            this.publishingYear = publishingYear;
        }

        public String getId() {
            return id;
        }

        public String getNameBook() {
            return nameBook;
        }

        public String getPublishingYear() {
            return publishingYear;
        }

    public String setPublishingYear(String newPublishingYear) {
        publishingYear=newPublishingYear;
        return newPublishingYear;
    }
}