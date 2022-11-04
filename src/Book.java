  public class Book {
        final private String nameBook;
        final private Author fullNameAuthor;
        private int yearOfPublication;

        public Book(String nameBook, Author fullNameAuthor, int yearOfPublication) {
            this.nameBook = nameBook;
            this.fullNameAuthor = fullNameAuthor;
            this.yearOfPublication = yearOfPublication;
        }
        public String getFullNameAuthor() {
            return this.fullNameAuthor.getFirstName()+" "+this.fullNameAuthor.getLastName();
        }


        public String getNameBook() {
            return nameBook;
        }

        public Author getNameAuthor() {
            return fullNameAuthor;
        }

        public int getYearOfPublication() {
            return yearOfPublication;
        }

        public void setYearOfPublication(int yearOfPublication) {
            this.yearOfPublication = yearOfPublication;
        }
}

