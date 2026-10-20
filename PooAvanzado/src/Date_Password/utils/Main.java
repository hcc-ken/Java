package Date_Password.utils;

public class Main {
    public static void main (String[] args) {
        Password p1, p2;
        p1 = new Password(14);
        p2 = new Password(8);

        System.out.println("P1: " + p1.getPassword());
        System.out.println("P2: " + p2.getPassword());
        System.out.println("The result of equals: " + p1.equals(p2));
        System.out.println("P1 is strong: " + p1.isStrong());
        System.out.println("P2 is strong: " + p2.isStrong());
//        int day = 0;
//        int month = 0;
//        int year = 0;
//
//        Scanner sc = new Scanner(System.in);
//
//        Date date;
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Please introduce the day.");
//            day = sc.nextInt();
//
//            System.out.println("Please introduce the month.");
//            month = sc.nextInt();
//
//            System.out.println("Please intrdouce the year.");
//            year = sc.nextInt();
//
//            date = new Date (day, month, year);
//
//            System.out.println(date.dateCorrect());
//
//            date.print();
//
//            date.nextDay();
//
//            date.print();
//        }
    }
}