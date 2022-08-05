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

        int year = 1904;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
            System.out.println ("Год является високосным");
        } else
            {
                System.out.println ("Год не является високосным");
            }





    }

        }