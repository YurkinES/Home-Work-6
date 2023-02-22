public class Main {
    public static void main(String[] args) {
        //Task #1
    for (int a = 1; a <= 10; a++) {
        System.out.println(a);
    }
    //Task #2
    for (int b = 10; b > 0; b-- ) {
        System.out.println(b);
    }
    //Task #3
    for (int c = 0; c < 17 ; c = c + 2 ) {
        System.out.println(c);
    }
    //Task #4
    for (int d = 10; d > -10; d-- ){
        System.out.println(d);
    }
    //Task #5
    for (int y = 1904; y < 2096; y = y + 4){
        System.out.println(y + " является високосным годом");
    }
    //Task #6
    for (int n = 7; n < 100; n = n + 7) {
        System.out.println(n);
    }
    //Task #7
    for (int n = 1; n < 1000; n = n * 2){
        System.out.println(n);
    }
    //Task #8
    int totalMoney = 0;
    int monthContribution = 29000;
    for (int i = 1; i <= 12; i++) {
       totalMoney = totalMoney + monthContribution;
        System.out.println("Месяц " + i + " сумма накоплений равна " + totalMoney + " рублей");
    }
    }
}