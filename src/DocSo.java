import java.util.Scanner;

public class DocSo {
    static Scanner Scanner = new Scanner(System.in);

    public static void main(String[] args) {
        doc();
    }

    public static void doc() {
        int x, chuc, don;
        System.out.println("nhap so can doc: ");
        x = Scanner.nextInt();
        if (x < 0 || x > 999) {
            System.out.println("out of ability");
        } else {
            if (x <= 10) {
                donVi(x);
            } else if (x <= 100) {
                if (x < 20) {
                    hangChuc(x);
                } else {
                    don = x - (x / 10) * 10;
                    if (don == 0) {
                        return;
                    } else {
                        donVi(don);
                    }
                }

            } else {
                donVi(x/100);
                System.out.print("hundered ");
                chuc = x - (x / 100) * 100;
                don = chuc - (chuc / 10) * 10;
                if (chuc / 10 == 0 && don == 0) {
                    return;
                } else {
                    System.out.print("and ");
                    if (chuc / 10 == 0) {
                        donVi(don);
                    } else {
                        if (don == 0) {
                            hangChuc(chuc);
                        } else {
                            hangChuc(chuc);
                            donVi(don);
                        }
                    }
                }
            }
        }

    }

    public static void donVi(int x) {
        switch (x) {
            case 0:
                break;
            case 1:
                System.out.print("One ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;
            case 10:
                System.out.print("Ten ");
                break;

        }
    }

    public static void hangChuc(int x) {
        if (x < 20) {
            switch (x) {
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Six teen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eighteen");
                    break;
                case 19:
                    System.out.println("Nineteen");
                    break;
            }
        } else {
            switch (x / 10) {
                case 2:
                    System.out.print("Twenty ");
                    break;
                case 3:
                    System.out.print("Thirty ");
                    break;
                case 4:
                    System.out.print("Forty ");
                    break;
                case 5:
                    System.out.print("Fifty ");
                    break;
                case 6:
                    System.out.print("Sixty ");
                    break;
                case 7:
                    System.out.print("Seventy ");
                    break;
                case 8:
                    System.out.print("Eighty ");
                    break;
                case 9:
                    System.out.print("Ninety ");
                    break;
                case 10:
                    System.out.print("One Hundered ");
                    break;
            }
        }
    }

}
