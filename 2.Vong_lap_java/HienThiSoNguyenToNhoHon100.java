public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.println("Cac so nguyen to nho hon 100 la:");

        // Buoc 2: Lap tu 2 den 100
        for (int so = 2; so < 100; so++) {
            // Buoc 1: Kiem tra so co phai so nguyen to khong
            boolean laSoNguyenTo = true;

            // Kiem tra tu 2 den can bac 2 cua so
            for (int i = 2; i <= Math.sqrt(so); i++) {
                if (so % i == 0) {
                    laSoNguyenTo = false;
                    break;
                }
            }

            // Neu la so nguyen to thi in ra
            if (laSoNguyenTo) {
                System.out.print(so + " ");
            }
        }
    }
}