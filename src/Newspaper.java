public class Newspaper extends library{
    private int releaseDate;

    public Newspaper(int documentCode, String imPrint, int releaseNumber, int releaseDate) {
        super(documentCode, imPrint, releaseNumber);
        this.releaseDate = releaseDate;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
    @Override
    public String toString() {
        return "library{" +
                "DocumentCode=" + getDocumentCode() +
                ", ImPrint='" + getImPrint() + '\'' +
                ", releaseNumber=" + getReleaseNumber() +
                ", releaseDate" + releaseDate +
                '}';
    }
}
