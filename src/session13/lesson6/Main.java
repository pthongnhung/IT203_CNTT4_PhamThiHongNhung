package session13.lesson6;

import java.util.*;

public class Main {

    static List<Medicine> cart = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("\n========= MENU KÊ ĐƠN THUỐC =========");
        System.out.println("1. Thêm thuốc vào đơn");
        System.out.println("2. Điều chỉnh số lượng");
        System.out.println("3. Xóa thuốc");
        System.out.println("4. In hóa đơn");
        System.out.println("5. Tìm thuốc giá dưới 50.000");
        System.out.println("6. Thoát");
        System.out.print("Chọn: ");
    }

    // 1. Thêm thuốc
    public static void addMedicine() {

        System.out.print("Nhập mã thuốc: ");
        String id = sc.nextLine();

        for (Medicine m : cart) {
            if (m.getDrugId().equals(id)) {
                System.out.print("Nhập thêm số lượng: ");
                int qty = Integer.parseInt(sc.nextLine());
                m.setQuantity(m.getQuantity() + qty); // cộng dồn
                System.out.println("Đã cộng dồn số lượng.");
                return;
            }
        }

        System.out.print("Nhập tên thuốc: ");
        String name = sc.nextLine();

        System.out.print("Nhập đơn giá: ");
        double price = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập số lượng: ");
        int quantity = Integer.parseInt(sc.nextLine());

        cart.add(new Medicine(id, name, price, quantity));
        System.out.println("Đã thêm thuốc vào đơn.");
    }

    // 2. Điều chỉnh số lượng
    public static void updateQuantity() {

        System.out.print("Nhập mã thuốc: ");
        String id = sc.nextLine();

        for (Medicine m : cart) {
            if (m.getDrugId().equals(id)) {

                System.out.print("Nhập số lượng mới: ");
                int newQty = Integer.parseInt(sc.nextLine());

                if (newQty == 0) {
                    cart.remove(m);
                    System.out.println("Đã xóa thuốc vì số lượng = 0.");
                } else {
                    m.setQuantity(newQty);
                    System.out.println("Đã cập nhật số lượng.");
                }
                return;
            }
        }

        System.out.println("Không tìm thấy thuốc.");
    }

    // 3. Xóa thuốc
    public static void removeMedicine() {

        System.out.print("Nhập mã thuốc cần xóa: ");
        String id = sc.nextLine();

        Iterator<Medicine> iterator = cart.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getDrugId().equals(id)) {
                iterator.remove();
                System.out.println("Đã xóa thuốc.");
                return;
            }
        }

        System.out.println("Không tìm thấy thuốc.");
    }

    // 4. In hóa đơn
    public static void printInvoice() {

        if (cart.isEmpty()) {
            System.out.println("Đơn thuốc trống.");
            return;
        }

        System.out.println("\n============= HÓA ĐƠN =============");
        System.out.printf("%-10s %-20s %10s %8s %12s\n",
                "Mã", "Tên thuốc", "Đơn giá", "SL", "Thành tiền");

        double total = 0;

        for (Medicine m : cart) {
            System.out.println(m);
            total += m.getTotalPrice();
        }

        System.out.println("-----------------------------------------------");
        System.out.printf("TỔNG TIỀN: %.0f VNĐ\n", total);

        cart.clear(); // Xóa toàn bộ giỏ sau khi in
        System.out.println("Đã hoàn tất đơn và làm mới giỏ hàng.");
    }

    // 5. Tìm thuốc giá rẻ
    public static void findCheapMedicine() {

        boolean found = false;

        for (Medicine m : cart) {
            if (m.getUnitPrice() < 50000) {
                System.out.println(m);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có thuốc dưới 50.000 VNĐ.");
        }
    }

    public static void main(String[] args) {

        while (true) {
            showMenu();
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> addMedicine();
                case 2 -> updateQuantity();
                case 3 -> removeMedicine();
                case 4 -> printInvoice();
                case 5 -> findCheapMedicine();
                case 6 -> {
                    System.out.println("Kết thúc chương trình.");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}