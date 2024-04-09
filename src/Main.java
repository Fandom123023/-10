public class Main {
    public static void main(String[] args) {
        System.out.println("task1");
        int clientOS = 0;
        if (clientOS == 0) {
        System.out.println(" установить версию приложения для iOS По ссылке");
        }else if (clientOS ==1) {
        System.out.println(" установить версию приложения для Android По ссылке");}
        else {
            System.out.println(" не удалось опредить операционную систему");
        }
            System.out.println("task2");
        char year = 2018;
        int iOS = 0;
        if (iOS == 0 && year <= 2015) {
            System.out.println("установить облегченную версию приложения для iOS по ссылке");}
        else if (iOS == 0 && year > 2015){
            System.out.println("установить версию приложения для iOS по ссылке");
        } 
        if (iOS == 1 && year <= 2015){
            System.out.println("установить облегченную версию приложения для Android по ссылке");
        } else if (iOS == 1 && year >= 2015) {
            System.out.println("установить версию приложения для Android по ссылке");
        }
        System.out.println("task3");
        int yearNew = 2024;
        if (yearNew > 1584 && ((yearNew % 4 == 0 && yearNew % 100 != 0) || yearNew % 400 == 0)) {
            System.out.println(yearNew + " год является високосным");
        } else {
            System.out.println(yearNew + " год не является високосным");
        }
        System.out.println("task4");
        int interval = 90;
        int intervalDeys = 1;
        if (interval <= 20) {
            intervalDeys = 1;}
        else if (interval <= 60) {
            intervalDeys = 2;}
        else if (interval <= 100) {
            intervalDeys = 3;
        }
        else {
            System.out.println("доставки на такое растояние не предусмотрено");
        }
        System.out.println(" потребуется дней: " + intervalDeys);

        System.out.println("task5");
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;

            default:
                System.out.println("Некорректный номер месяца");
        }
    }
    }

