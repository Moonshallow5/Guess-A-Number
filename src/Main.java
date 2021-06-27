

public class Main {
    public static void main(String[] args) {
        start();
    }
    static int computerNumber;
    public static void number(){
         computerNumber =(int)(Math.random()*100);
    }
    static int human=0;
    static int computer=0;
    public static void write(){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Do you want to choose how many tries you get? ");
        System.out.println("Enter Y to choose the number of tries and N to guess with infinite tries");
        System.out.println("Please enter -1 if you want to concede");
        System.out.println("--------------------------------------------------------------------------");
    }
    public static void start() {
        write();
        char x = InputUtil.readCharFromUser();
        if (x=='Y') {
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

        while (true) {
            System.out.println("Enter");
            int playerInput = InputUtil.readIntFromUser();
            if(playerInput==-1){
                break;
            }
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
            tries++;
            izz++;
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

        System.out.println("Enter how many tries you want: ");

        int numberOfTries=InputUtil.readIntFromUser();
        pickPlayLoop(numberOfTries);
        playAgain();
    }


    public static void pickPlayLoop(int numberOfTries){
        while (izz<numberOfTries) {
            System.out.println("Enter a number");
            int input = InputUtil.readIntFromUser();
            if(input==-1){
                computer++;
                //System.out.println("Score is "+human+" for human and "+computer+" for computer");
                break;
            }
            inputMore(input);
             pickLess(input);
             if(pickEqual(input)){
                 tries++;
                 human++;
                 correct(input);
                 break;
             }
        }if(izz>=numberOfTries){
            computer++;
            cool(numberOfTries);
        }
        System.out.println("Score is "+human+" for human and "+computer+" for computer");
    }


    public static void correct(int input){
        System.out.println("Correct, "+input +" is the answer");
        System.out.println("The number of guesses are "+tries);

    }

    public static void cool(int numberOfTries){
        System.out.println("You have exceeded the number of guesses which is "+numberOfTries);
        System.out.println("The correct answer is "+ computerNumber);
    }


    public static void play(){
        System.out.println("Do you want to play again");
        System.out.println("Enter Y to play again and N to stop playing");
    }
    static int count=1;
    public static void playAgain(){
        play();
        char in=InputUtil.readCharFromUser();
        if(in=='Y'){
            playAgain=true;
        }
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
    public static void score(){

    }

}
