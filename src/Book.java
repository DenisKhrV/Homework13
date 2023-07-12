import java.util.Objects;

public class Book {
    private final String bookTitle;
    private final Author authorName;
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
    public Author getAuthor() {
        return this.authorName;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return "Название книги: " + bookTitle + ". Автор книги: " + this.authorName + ". Дата издания: " + publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, authorName, publicationYear);
    }
}
