public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task4double2();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        }


    public static void task2() {
        System.out.println("Задача 2");

        int clientOS = 0;
        int clientDeviceYear = 2011;

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        }
            else if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Андроид по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Андроид по ссылке");
                }
    }


    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;

        if (year %4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println("Год " + year + " високосный");
        else
            System.out.println("Год " + year + " не високосный");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 66;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день!");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня!");
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется 3 дня!");
        } else {
            System.out.println("Доставки нет!");
        }
    }


    public static void task4double2() {
        System.out.println("Задача 4.2");

        int deliveryDistance1 = 95;
        int deliveryDay = 1;

        if (deliveryDistance1 > 20) {
                deliveryDay++;
        }
        if (deliveryDistance1 > 60) {
                deliveryDay++;
        }
        System.out.println("Потребуется дней: " + deliveryDay);


    }



            public static void task5 () {
                System.out.println("Задача 5");
                int monthNumber = 12;
                switch (monthNumber) {
                    case 12:
                    case 1:
                    case 2:
                        System.out.println("Месяц №" +monthNumber+ " пренадлежит к зимнему сезону");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Месяц №" +monthNumber+ " пренадлежит к весеннему сезону");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("Месяц №" +monthNumber+ " пренадлежит к летнему сезону");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("Месяц №" +monthNumber+ " пренадлежит к осеннему сезону");
                        break;
                    default:
                        System.out.println("Нет месяца под №" +monthNumber);


                }

            }
        }