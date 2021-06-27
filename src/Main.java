import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        start();
    }
    static int computerNumber;
    public static void number(){
         computerNumber =(int)(Math.random()*100);
    }
    public static void write(){
        System.out.println("------------------------------------------------------");
        System.out.println("Do you want to choose how many tries you get? ");
        System.out.println("Enter Ya to choose and No to guess with infinite tries");
        System.out.println("-------------------------------------------------------");
    }
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        write();
        String x = scanner.nextLine();
        if (x.equals("Ya")) {
            pickPlay();

        }else {
            pick();
        }
    }
    static boolean playAgain;

    static int tries=0;

    public static void pick() {
        number();
        playAgain=false;
        System.out.println(computerNumber);
        pickLoop();
        playAgain();
    }
    public static void pickLoop() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter");
            int playerInput = scanner.nextInt();
            inputMore(playerInput);
            pickLess(playerInput);
             if(pickEqual(playerInput)){
                 tries++;
                 correct(playerInput);
                 break;
             }
        }
    }
    public static void inputMore(int playerInput) {
        if (playerInput > computerNumber) {
            System.out.println(playerInput + " is too high");
            tries++;izz++;
        }
    }
    public static boolean pickEqual(int playerInput){
        return playerInput == computerNumber;

    }
    public static void pickLess(int playerInput){
          if (playerInput < computerNumber) {
            System.out.println(playerInput + " is too low");
            tries++;
            izz++;
        }
    }
    static int izz=0;
    public static void pickPlay(){
        number();
        System.out.println(computerNumber);
        playAgain=false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many tries you want: ");
        int numberOfTries=scanner.nextInt();
        pickPlayLoop(numberOfTries);
        playAgain();
    }
    static Scanner scanner=new Scanner(System.in);

    public static void pickPlayLoop(int numberOfTries){
        while (izz<numberOfTries) {
            System.out.println("Enter a number");
            int input = scanner.nextInt();
            inputMore(input);
             pickLess(input);
             if(pickEqual(input)){
                 tries++;
                 correct(input);
                 break;
             }
        }if(izz>=numberOfTries){
            cool(numberOfTries);
        }
    }


    public static void correct(int input){
        System.out.println("Correct, "+input +" is the answer");
        System.out.println("The number of guesses are "+tries);

    }

    public static void cool(int numberOfTries){
        System.out.println("You have exceeded the number of guesses which is "+numberOfTries);
        System.out.println("The correct answer is "+ computerNumber);
    }


    public static String play(){
        return "Would you want to play again";
    }
    static int count=1;
    public static void playAgain(){
        Scanner scanner=new Scanner(System.in);
        System.out.println(play());
        String in=scanner.nextLine();
        playAgain= in.equals("Ya");
        if(!playAgain){
            System.out.println("Good game");
            games();
        }
        while (playAgain){
            games();
            count++;tries=0;izz=0;
            start();
        }
    }
    public static void games(){
        System.out.println("Number of games played "+ count);
    }
}
