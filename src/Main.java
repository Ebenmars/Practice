public class Main {
    public static void main(String[] args) {

        double dig1 = 20.00d;
        double dig2 = 80.00d;

        isRemainder(dig1, dig2);
    }

    public static void isRemainder(double dig1, double dig2) {
        double total = (dig1 + dig2) * 100.00d;

        total %= 40.00;

        Boolean isZero = total == 0.00 ? true : false;

        System.out.println(isZero);

        if(!isZero){
            System.out.println("Got some remainder");
        }
    }

    public  static void displayHighScorePosition(String playerName,int playerPosition){
        System.out.println(playerName + "manged to get into position" + playerPosition + "on the high score list");

    }

    public int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        }
        else if(playerScore >= 500 && playerScore < 1000){
            return 2;
        }
        else if(playerScore >= 100 && playerScore < 500){
            return 3;
        }
        else{
            return 4;
        }
    }

}




