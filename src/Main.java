public class Main {
    public static void main(String[] args) {

        double dig1 = 20.00d;
        double dig2 = 80.00d;

        double total = (dig1 + dig2) * 100.00d;

        total %= 40.00;

        Boolean isZero = total == 0.00 ? true : false;

        System.out.println(isZero);

        if(!isZero){
            System.out.println("Got some remainder");
        }
    }
}