import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            // Hien thi menu
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Hien thi hinh chu nhat");
            System.out.println("2. Hien thi tam giac vuong");
            System.out.println("3. Hien thi tam giac can");
            System.out.println("4. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    hinhChuNhat();
                    break;
                case 2:
                    tamGiacVuong();
                    break;
                case 3:
                    tamGiacCan();
                    break;
                case 4:
                    System.out.println("Dang thoat chuong trinh...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le! Vui long thu lai.");
            }
        } while (luaChon != 4);

        scanner.close();
    }

    // Phuong thuc hien thi hinh chu nhat
    public static void hinhChuNhat() {
        System.out.println("\n--- Hinh chu nhat ---");
        int chieuRong = 10;
        int chieuCao = 5;

        for (int i = 0; i < chieuCao; i++) {
            for (int j = 0; j < chieuRong; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Phuong thuc hien thi tam giac vuong
    public static void tamGiacVuong() {
        System.out.println("\n--- Tam giac vuong ---");
        Scanner scanner = new Scanner(System.in);
        int kichThuoc;

        System.out.print("Nhap kich thuoc tam giac: ");
        kichThuoc = scanner.nextInt();

        System.out.println("\n1. Goc vuong o tren - ben trai:");
        // Goc tren - ben trai
        for (int i = kichThuoc; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n2. Goc vuong o tren - ben phai:");
        // Goc tren - ben phai
        for (int i = kichThuoc; i > 0; i--) {
            for (int j = 0; j < kichThuoc - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n3. Goc vuong o duoi - ben trai:");
        // Goc duoi - ben trai
        for (int i = 1; i <= kichThuoc; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n4. Goc vuong o duoi - ben phai:");
        // Goc duoi - ben phai
        for (int i = 1; i <= kichThuoc; i++) {
            for (int j = 0; j < kichThuoc - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Phuong thuc hien thi tam giac can
    public static void tamGiacCan() {
        System.out.println("\n--- Tam giac can ---");
        Scanner scanner = new Scanner(System.in);
        int chieuCao;

        System.out.print("Nhap chieu cao tam giac: ");
        chieuCao = scanner.nextInt();

        for (int i = 1; i <= chieuCao; i++) {
            // In khoang trang
            for (int j = 1; j <= chieuCao - i; j++) {
                System.out.print("  ");
            }
            // In dau *
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}