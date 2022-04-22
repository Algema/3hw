import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        // Задание 2

        int clientOs = 0;
        int clientDeviceYear = 2014;
        if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {

            if (clientOs == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                if (clientOs == 0 && clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для IOS по ссылке ");
                } else {
                    if (clientOs == 0 && clientDeviceYear < 2015) {
                        System.out.println(" Установите облегченную версию для IOS по ссылке");
                    }
                }
            }
        }
        // Задание 3
        short year = 1900;
        if (year % 4==0 && year % 100 != 0 || year % 400 == 0) {
        System.out.println(year + "  высокосный год");
    } else  {
        System.out.println(year + " Не высокосный год ");}

        // Задание 4
        int deliveryDistance = 105;
        int deliveryTime20 = 1;
        int deliveryTime60=2;
        int deliveryTime100=3;
        if (deliveryDistance <20) {
            System.out.println("Потребуеся дней на доставку: " + deliveryTime20);
        }else{
            if (deliveryDistance  > 20  && deliveryDistance<=60) {
                System.out.println("Потребуется дней на доставку " + deliveryTime60);
            }else{
                if (deliveryDistance >60 && deliveryDistance<= 100) {
                    System.out.println("Потребуется дней на доставку " + deliveryTime100);
                }else{
                    System.out.println(" Доставка не осуществляется");
                }
            }
        }

        // Задание 5

        int monthNumber = 13;
        switch (monthNumber) {
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
                System.out.println("Такого времени года не сущетсвует");

        }





    }



}





