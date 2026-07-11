import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Buoc 1: hoi so can doc
        System.out.print("Nhap so can doc (0-999): ");
        int number = scanner.nextInt();

        // Kiem tra so hop le
        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else if (number < 10) {
            // Buoc 2: doc so co 1 chu so
            System.out.println(readOneDigit(number));
        } else if (number < 20) {
            // Buoc 3: doc so co 2 chu so nho hon 20
            System.out.println(readTeens(number));
        } else if (number < 100) {
            // Buoc 4: doc so co 2 chu so lon hon hoac bang 20
            System.out.println(readTwoDigits(number));
        } else {
            // Buoc 5: doc so co 3 chu so
            System.out.println(readThreeDigits(number));
        }

        scanner.close();
    }

    // Ham doc so 1 chu so
    public static String readOneDigit(int num) {
        switch (num) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    // Ham doc so tu 10 den 19
    public static String readTeens(int num) {
        int ones = num % 10;
        switch (ones) {
            case 0:
                return "ten";
            case 1:
                return "eleven";
            case 2:
                return "twelve";
            case 3:
                return "thirteen";
            case 4:
                return "fourteen";
            case 5:
                return "fifteen";
            case 6:
                return "sixteen";
            case 7:
                return "seventeen";
            case 8:
                return "eighteen";
            case 9:
                return "nineteen";
            default:
                return "";
        }
    }

    // Ham doc so co 2 chu so (>= 20)
    public static String readTwoDigits(int num) {
        int tens = num / 10;
        int ones = num % 10;

        String tensWord = "";
        String onesWord = "";

        // Doc hang chuc
        switch (tens) {
            case 2:
                tensWord = "twenty";
                break;
            case 3:
                tensWord = "thirty";
                break;
            case 4:
                tensWord = "forty";
                break;
            case 5:
                tensWord = "fifty";
                break;
            case 6:
                tensWord = "sixty";
                break;
            case 7:
                tensWord = "seventy";
                break;
            case 8:
                tensWord = "eighty";
                break;
            case 9:
                tensWord = "ninety";
                break;
        }

        // Doc hang don vi
        if (ones > 0) {
            onesWord = readOneDigit(ones);
        }

        // Ghep lai
        if (ones > 0) {
            return tensWord + " " + onesWord;
        } else {
            return tensWord;
        }
    }

    // Ham doc so co 3 chu so
    public static String readThreeDigits(int num) {
        int hundreds = num / 100;
        int remainder = num % 100;

        String hundredsWord = readOneDigit(hundreds);
        String remainderWord = "";

        if (remainder == 0) {
            return hundredsWord + " hundred";
        } else if (remainder < 10) {
            remainderWord = readOneDigit(remainder);
            return hundredsWord + " hundred and " + remainderWord;
        } else if (remainder < 20) {
            remainderWord = readTeens(remainder);
            return hundredsWord + " hundred and " + remainderWord;
        } else {
            remainderWord = readTwoDigits(remainder);
            return hundredsWord + " hundred and " + remainderWord;
        }
    }
}