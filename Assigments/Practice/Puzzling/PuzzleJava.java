import java.util.Random;
import java.util.ArrayList;
public class PuzzleJava{
 public ArrayList<Integer> getTenRolls() {

        ArrayList<Integer> random10 = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 1; i <=10; i++) {
            random10.add(rand.nextInt(20) + 1);
        }

        return random10;
    }
    
}