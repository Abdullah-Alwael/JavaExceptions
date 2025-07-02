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


        try{
            System.out.println("Is it Possible to use try and catch inside finally block?");
        }catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
//            finally{
//                System.out.println("Not possible without a try block");
//            }
            System.out.println("Try and catch inside finally block");

            try{
                System.out.println("This is absolutely possible");
            }catch (Exception e){
                System.out.println(e.getMessage());
            } finally {
                System.out.println("yes");
            }
        }
    }
}
