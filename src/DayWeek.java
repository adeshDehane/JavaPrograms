public class DayWeek {
    public static void main(String[] args) {
        printDayOfWeek(10);
    }
    public static void printDayOfWeek(int day){
        switch (day){
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wenesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid day");
        }

    }
}
