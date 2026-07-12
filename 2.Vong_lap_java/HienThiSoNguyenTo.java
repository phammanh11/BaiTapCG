import java.util.Scanner;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Buoc 1: Khai bao bien numbers va nhap gia tri tu ban phim
        int numbers;
        System.out.print("Nhap so luong so nguyen to can hien thi: ");
        numbers = scanner.nextInt();

        // Buoc 2: Khai bao bien count = 0 de dem so luong so nguyen to da tim duoc
        int count = 0;

        // Buoc 3: Khai bao bien N = 2 de bat dau kiem tra tu so 2
        int N = 2;

        System.out.println("\n" + numbers + " so nguyen to dau tien la:");

        // Buoc 4: Trong khi count < numbers thi tiep tuc kiem tra
        while (count < numbers) {
            // Kiem tra xem N co phai la so nguyen to khong
            boolean laSoNguyenTo = true;

            // So nguyen to la so > 1 va chi chia het cho 1 va chinh no
            if (N < 2) {
                laSoNguyenTo = false;
            } else {
                // Kiem tra tu 2 den can bac 2 cua N
                for (int i = 2; i <= Math.sqrt(N); i++) {
                    if (N % i == 0) {
                        laSoNguyenTo = false;
                        break;
                    }
                }
            }

            // Neu N la so nguyen to thi in ra va tang count len 1
            if (laSoNguyenTo) {
                System.out.print(N + " ");
                count++;
            }

            // Tang N len 1 de kiem tra so tiep theo
            N++;
        }

        scanner.close();
    }
}