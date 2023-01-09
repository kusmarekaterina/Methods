import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = LocalDate.now().getYear();
        checkLeapYear(year);

        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        String osName = "iOS";
        int clientOS = getClientOS(osName);
        printMessageWhichApplicationDownload (currentYear, clientOS);

        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int numberOfDay = checkNumberOfDeliveryDays (deliveryDistance);
        printNumberOfDeliveryDays (numberOfDay);

    }
    public static void checkLeapYear (int year) {
    boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (isLeapYear) {
        System.out.println(year + " год является високосным");
        } else {
        System.out.println(year + " год не является високосным");
        }
    }
    public static int getClientOS(String name) {
        if (name.equals("iOS")) {
            return 0;
        } else {
            return 1;
        }
    }
    public static void printMessageWhichApplicationDownload (int year, int clientOS) {
        if (clientOS == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && year >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static int checkNumberOfDeliveryDays (int deliveryDistance) {
        int day = 0;
        if (deliveryDistance <= 20) {
            day = day +1;
        } else if (deliveryDistance <= 60) {
            day = day + 2;
        } else if (deliveryDistance < 100) {
            day = day + 3;
        }
        return day;
        }
    public static void printNumberOfDeliveryDays (int numberOfDay) {
        if (numberOfDay != 0) {
            System.out.println("Потребуется дней: " + numberOfDay);
        } else {
            System.out.println("Доставка не возможна!");
        }
    }
}
