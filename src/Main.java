import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        pick();
    }

    public  static void pick(){
        int y=(int) (Math.random()*100);
        System.out.println(y);

        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("Enter");
            int x = scanner.nextInt();
            if (x > y) {
                System.out.println("Your value is too high");

            } else if (x<y){
                System.out.println("Your value is too low");
            }
            else{
                System.out.println("Correct");
                break;
            }
        }
        

    }




    

    

}
