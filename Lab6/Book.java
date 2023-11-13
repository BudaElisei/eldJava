package Lab6;

public class Book {
    private String name;
    private String author;
    private String ISBM;

    public Book(String name, String author, String ISBM) {
        this.name = name;
        this.author = author;
        this.ISBM = ISBM;

    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBM() {
        return ISBM;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBM(String ISBM) {
        this.ISBM = ISBM;
    }
}
