import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //задача 1
        int clientOS = 1;
        if (clientOS == 0)
             {
            System.out.println("Установите версию приложения iOS по ссылке");
             }
        if (clientOS == 1)
            {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            // задача 2

        int clientDeviceYear = 2014;
        if (clientOS == 1)
                 {
            if (clientDeviceYear >= 2015)
                {
                    System.out.println("Установите версию приложения для iOS по ссылке");

                } else
                    {
                        System.out.println ("Установи облегченную версию приложения для iOS по ссылке");
                    }
                }
            {
        if (clientDeviceYear >= 2015)
              {
            System.out.println("Установите версию приложения для Android по ссылке");

             } else
        {
            System.out.println ("Установи облегченную версию приложения для Android по ссылке");
        }
              }

        // задача 3

        int year = 2013;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
            System.out.println ("Год является високосным");
        } else
            {
                System.out.println ("Год не является високосным");
            }
         // задача 4

        int deliveryDistance = 95;
        if (deliveryDistance <= 20)
            {
                System.out.println ("Потребуется дней " + 1 );
            }
        else if (deliveryDistance > 20 && deliveryDistance <= 60)
                {
                System.out.println ("Потребуется дней " + 2 );
                }
        else if (deliveryDistance >60 && deliveryDistance <=100)
                {
            System.out.println ("Потребуется дней " + 3 );
                }

            // задача 5

        int monthNumber = 14;
        switch (monthNumber)
        {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }


    }

        }