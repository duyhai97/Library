public class library {
    private int DocumentCode;
    private String ImPrint;
    private int releaseNumber;

    public library(int documentCode, String imPrint, int releaseNumber) {
        DocumentCode = documentCode;
        ImPrint = imPrint;
        this.releaseNumber = releaseNumber;
    }

    @Override
    public String toString() {
        return "library{" +
                "DocumentCode=" + DocumentCode +
                ", ImPrint='" + ImPrint + '\'' +
                ", releaseNumber=" + releaseNumber +
                '}';
    }

    public int getDocumentCode() {
        return DocumentCode;
    }

    public void setDocumentCode(int documentCode) {
        DocumentCode = documentCode;
    }

    public String getImPrint() {
        return ImPrint;
    }

    public void setImPrint(String imPrint) {
        ImPrint = imPrint;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

}
