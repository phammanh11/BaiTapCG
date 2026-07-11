import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Buoc 2: Khai bao bien ti gia
        double rate = 23000; // Ti gia VND/USD

        // Buoc 3: Khai bao bien gia tri USD va cho nguoi dung nhap vao
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so tien USD can chuyen doi: ");
        double usd = scanner.nextDouble();

        // Buoc 4: Tinh gia tri VND va hien thi ra man hinh
        double vnd = usd * rate;

        System.out.println("Ti gia: " + rate + " VND/USD");
        System.out.println("So tien VND tuong ung: " + vnd + " VND");

        scanner.close();
    }
}
