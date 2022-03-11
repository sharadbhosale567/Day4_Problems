package Practice;

public class FlipCoin {
    public static void main(String[] args) {
        int IS_THE_HEAD = 1;
        double flipCoinCheck = Math.floor(Math.random() * 10) % 2;
        if ( IS_THE_HEAD == flipCoinCheck ) {
            System.out.println("HEAD");
        }
        else {
            System.out.println("Tail");
        }
    }
}
