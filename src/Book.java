public class Book {

        private final String id;
        private String nameBook;
        private String publishingYear;

        public Book(String id, String nameBook, String publishingYear) {
            this.id = id;
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
}