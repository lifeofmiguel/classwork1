import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class Main {
    public static void main(String[] args) {
        //int grade = Math.random();
//        int n = grade.nextInt(100);

//        Random grade = new Random();
//        int randomNum = grade.nextInt((0 - 100) + 1) + min;

        //int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        //int grade = Math.random();
        int grade = (int) Math.floor(Math.random() * 100) + 1;
        if(grade > 90){
            System.out.println("you got an A " + grade);
        }else if(grade > 80){
            System.out.println("you got an B " + grade);
        }else if(grade > 70) {
            System.out.println("you got an C " + grade);
        }else{
            System.out.println("you got an F " + grade);
        }


    }
}
