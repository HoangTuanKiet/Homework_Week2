package model;

public class Exercise3 {
    public static void run(){
        System.out.print("Tong cac so nguyen to tu 1 den 10000 voi for: ");
        System.out.println(sumWithFor());
        System.out.print("Tong cac so nguyen to tu 1 den 10000 voi while: ");
        System.out.println(sumWithWhile());
        System.out.print("Tong cac so nguyen to tu 1 den 10000 voi do-while: ");
        System.out.println(sumWithDoWhile());
    }

    public static int sumWithFor(){
        int sum = 0;
        for (int i = 1; i <= 10000; i++){
            sum += checkSoNguyenTo(i) ? i : 0;
        }
        return sum;
    }
    public static int sumWithDoWhile(){
        int sum = 0;
        int i = 1;
        do {
            sum += checkSoNguyenTo(i) ? i : 0;
            i++;
        }while (i <= 10000);
        return sum;
    }
    public static int sumWithWhile(){
        int sum = 0;
        int i = 0;
        while (i <= 10000){
            sum += checkSoNguyenTo(i) ? i : 0;
            i++;
        }
        return sum;
    }
    public static boolean checkSoNguyenTo(int n){
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return true;
    }
}
