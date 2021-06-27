import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(y);
        pick();
    }

    static int y=(int) (Math.random()*100);
    public  static void pick(){
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("Enter");
            int x = scanner.nextInt();
            if (x > y) {
                System.out.println("Your value is too high");

            } else if (x<y){
                System.out.println("Your value is too low");
            }else{
                System.out.println("Correct");
                break;
            }
        }

    }




    

    

}
