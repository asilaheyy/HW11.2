public class Main {
    // ДЗ 2.
    public static void OS(int clientOS, int clientDeviceYear) {

        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите приложение для iOS по ссылке.");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите приложение для Android по ссылке.");
        }

    }
    public static void main(String[] args) {
        int clientOS = 1;
        int clientDeviceYear = 2015;
        OS(clientOS, clientDeviceYear);
    }
}