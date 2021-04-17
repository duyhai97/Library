public class Journal extends library{
    private int IssueNumber;
    private int monthOfRelease;

    public Journal(int documentCode, String imPrint, int releaseNumber, int issueNumber, int monthOfRelease) {
        super(documentCode, imPrint, releaseNumber);
        IssueNumber = issueNumber;
        this.monthOfRelease = monthOfRelease;
    }

    public int getIssueNumber() {
        return IssueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        IssueNumber = issueNumber;
    }

    public int getMonthOfRelease() {
        return monthOfRelease;
    }

    public void setMonthOfRelease(int monthOfRelease) {
        this.monthOfRelease = monthOfRelease;
    }
    @Override
    public String toString() {
        return "library{" +
                "DocumentCode=" + getDocumentCode() +
                ", ImPrint='" + getImPrint() + '\'' +
                ", releaseNumber=" + getReleaseNumber() +
                ", IssueNumber" + getIssueNumber() +
                ", monthOfRelease" + monthOfRelease +
                '}';
    }
}
