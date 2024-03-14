package school.lesson1;

public class task2 {
    public static void main(String[] args) {
        checkSumSign();
    }
    public static void checkSumSign() {
        int a = 2;
        int b = -3;
        int res = a + b;
        if (res>=0) {System.out.println("Сумма положительная!!!!!!!!!!!!!");}
        else {System.out.println("Сумма отрицательная");}
    }
}