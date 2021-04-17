import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Manager {
    List<library> libraryList = new ArrayList<library>();

    public Manager(List<library> libraryList) {
        this.libraryList = libraryList;
    }

    public List<library> getLibraryList() {
        return libraryList;
    }

    public void setLibraryList(List<library> libraryList) {
        this.libraryList = libraryList;
    }
    public List<library> addBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ma tai lieu: ");
        int DocumentCode = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap ten nha xuat ban: ");
        String ImPrint = scanner.nextLine();
        System.out.println("nhap so phat hanh: ");
        int releaseNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap ten tac gia: ");
        String author = scanner.nextLine();
        library book = new Book(DocumentCode, ImPrint, releaseNumber, author);
        libraryList.add(book);
        return libraryList;
    }
    public List<library> addJournal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ma tai lieu: ");
        int DocumentCode = scanner.nextInt();
        System.out.println("nhap ten nha xuat ban: ");
        String ImPrint = scanner.nextLine();
        System.out.println("nhap so phat hanh: ");
        int releaseNumber = scanner.nextInt();
        System.out.println("nhap so phat hanh: ");
        int IssueNumber = scanner.nextInt();
        System.out.println("nhap thang phat hanh: ");
        int monthOfRelease = scanner.nextInt();
        library journal = new Journal(DocumentCode, ImPrint, releaseNumber, IssueNumber, monthOfRelease);
        libraryList.add(journal);
        return libraryList;
    }
    public List<library> addNewspaper(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ma tai lieu: ");
        int DocumentCode = scanner.nextInt();
        System.out.println("nhap ten nha xuat ban: ");
        String ImPrint = scanner.nextLine();
        System.out.println("nhap so phat hanh: ");
        int releaseNumber = scanner.nextInt();
        System.out.println("nhap ngay phat hanh: ");
        int releaseDate = scanner.nextInt();
        library newspaper = new Newspaper(DocumentCode, ImPrint, releaseNumber,  releaseDate);
        libraryList.add(newspaper);
        return libraryList;
    }
    public List<library> deleteLibrary(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma tai lieu can xoa: ");
        int DocumentCode = scanner.nextInt();
        for (library l:libraryList) {
            if (l.getDocumentCode() == DocumentCode){

                libraryList.remove(l);
            }
        }
        return libraryList;
    }
    public void disPlayLibrary(){
        for (library l: libraryList) {
            System.out.println(l.toString());
        }
    }

    public  void  searchBook(){
        System.out.println(libraryList.size());
        for (library l: libraryList) {
            if (l instanceof Book)  System.out.println(l);
            else System.out.println("không tìm thấy");
        }

    }
    public void searchJournal(){
        for (library l: libraryList) {
            if (l instanceof Journal) System.out.println(l);
            else System.out.println("không tìm thấy");
        }
    }
    public void searchNewspaper(){
        for (library l: libraryList) {
            if (l instanceof Newspaper) System.out.println(l);
            else System.out.println("không tìm thấy");
        }
    }
}
