public class Book extends library{
    private String author;

    public Book(int documentCode, String imPrint, int releaseNumber, String author) {
        super(documentCode, imPrint, releaseNumber);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "library{" +
                "DocumentCode=" + getDocumentCode() +
                ", ImPrint='" + getImPrint() + '\'' +
                ", releaseNumber=" + getReleaseNumber() +
                ", author" + getAuthor() +
                '}';
    }
}
