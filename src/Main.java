public class Main {
    // ДЗ 2.
    public static void OS(int clientOS, int deviceYear){

        if (deviceYear<2015 && clientOS == 0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if(deviceYear>=2015 && clientOS == 0){
            System.out.println("Установите приложение для iOS по ссылке.");
        }
        if (deviceYear<2015 && clientOS == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        if(deviceYear>=2015 && clientOS == 1){
            System.out.println("Установите приложение для Android по ссылке.");
        }

    }
    public static void main(String[] args) {
      int clientOS = 1;
      int deviceYear = 2014;
        OS(clientOS,deviceYear);
    }
}