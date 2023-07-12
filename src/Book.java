public class Book {
    private String bookTitle;
    Author authorName;
    private int publicationYear;

    public Book(String bookTitle, Author authorName, int publicationYear) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
