import java.util.Objects;

public class Book {
    private final String nameBook;
    private final Author author;
    private int yearPublication;

    public Book(String nameBook, Author author, int yearPublication) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public Book(String nameBook, int yearPublication) {
        this(nameBook, null, yearPublication);
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                author.toString() +
                ", yearPublication=" + yearPublication +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nameBook);
    }
}
