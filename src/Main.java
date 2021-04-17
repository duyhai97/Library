import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        List<library> libraryList = new ArrayList<>();
        Manager hai = new Manager(libraryList);


        do {
            System.out.println("Mời bạn nhâp lựa chọn: ");
            System.out.println("Nhập 1 để thêm mới tài liệu: ");
            System.out.println("Nhập 2 để xóa tài liệu theo mã: ");
            System.out.println("nhập 3 để hiển thị thông tin tài liệu: ");
            System.out.println("nhập 4 để tìm kiếm tài liệu: ");
            System.out.println("nhập 5 để kết thúc chương trình: ");
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1 : {
                    System.out.println("Nhập a để thêm sách mới: ");
                    System.out.println("Nhập b để thêm tạp chí mới: ");
                    System.out.println("Nhập c để thêm báo mới: ");
                    String type = scanner.nextLine();
                    switch (type){
                        case "a" :
                            hai.addBook();
                            break;
                        case "b" :
                            hai.addJournal();
                            break;
                        case "c" :
                            hai.addNewspaper();
                            break;
                    }
                   break;
                }

                case 2 :
                    hai.deleteLibrary();
                   break;

                case 3 :
                    hai.disPlayLibrary();
                   break;

                case 4 : {
                    System.out.println("Nhập a để tìm kiếm sách : ");
                    System.out.println("Nhập b để tìm kiếm tạp chí: ");
                    System.out.println("Nhập c để tìm kiếm báo: ");
                    String value = scanner.nextLine();
                    switch (value) {
                        case "a" :
                            hai.searchBook();
                            break;
                        case "b" :
                            hai.searchJournal();
                            break;
                        case "c" :
                            hai.searchNewspaper();
                            break;
                    }
                    break;
                }

                case 5 :
                    return;

                default:
                    System.out.println("Không tìm thấy kết quả. ");

            }
        } while (true);
    }
}
