public class Main {
    public static void main(String[] args) {
        //задача 1
        int clientOS = 1;
        if (clientOS == 0); {
            System.out.println("Установите версию приложения iOS по ссылке");
        } if (clientOS == 1); {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            // задача 2

        int clientDeviceYear = 2017;
        if (clientOS == 1); {
            if (clientDeviceYear >= 2015); {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } if (clientDeviceYear < 2015); {
                System.out.println ("Установи облегченную версию приложения для iOS по ссылке");
            }
        }{
            if (clientDeviceYear >= 2015);
            System.out.println("Установите версию приложения для Android по ссылке");
            } if (clientDeviceYear < 2015); {
                System.out.println("Установи облегченную версию приложения для Android по ссылке");
            }
        }
        }