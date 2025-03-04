public class Book {
    private String nameBook;
    private Author author;
    private int yearPublication;

    public Book(String nameBook, Author author, int yearPublication) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearPublication = yearPublication;
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

    public String setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Author setAuthor(Author author) {
        this.author = author;
    }

    public int setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

}
