public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        int year = 2100;
        if (year % 4 == 0 || year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год високосный");
        }else{
            System.out.println(year + " год не високосный");
        }
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance > 20){
            days++;
        }
        if (deliveryDistance > 60){
            days++;
        }
        System.out.println("Время доставки: " + days);

        int month = 9;
        switch (month){
            case 12:
            case 1:
            case 2:
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
                System.out.println("неккоректный месяц");
        }
    }

}