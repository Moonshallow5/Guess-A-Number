import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        pick();
    }
    static int y;
    public static void number(){
         y=(int)(Math.random()*100);
    }
    
    static boolean playAgain;
    static int tries=0;
    public static void pick() {
        number();
        playAgain=false;
        System.out.println(y);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter");
            int x = scanner.nextInt();
            if (x > y) {
                System.out.println(x+" is too high");
                tries++;
            } else if (x < y) {
                System.out.println(x+" is too low");
                tries++;
            } else {
                System.out.println("Correct, "+x +" is the answer");
                tries++;
                System.out.println("The number of guesses are "+tries);
                break;
            }
        }playAgain();
    }
    public static String play(){
        return "Would you want to play again";
    }
    static int count=1;
    public static void playAgain(){
        Scanner scanner=new Scanner(System.in);
        System.out.println(play());
        String in=scanner.nextLine();
        if(in.equals("Ya")){
            playAgain=true;
        }else {
            playAgain=false;
        }
        if(!playAgain){
            System.out.println("Good game");
            games();
        }
        while (playAgain){
            games();
            count++;
            tries=0;
            pick();
        }
    }
    public static void games(){
        System.out.println("Number of games played "+ count);
    }
}
