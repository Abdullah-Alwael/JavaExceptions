public class Temp {
    public static void main(String[] args) {
        int number = 8523;
        double numberTemp;

        do {
            numberTemp = (double) number /10;
            number /=10;
            numberTemp -=number;
            numberTemp *= 10;
            System.out.print(Math.round(numberTemp));
            if (number == 0){
                break;
            }
        }while (true);
        System.out.println();
    }
}
