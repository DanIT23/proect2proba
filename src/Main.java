import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        int expectedSum = 0;
        int actualSum = 0;

        for (int i = 1; i <= 10; i++) {
            numbersList.add((i);
            expectedSum += i;
        }
                Random random = new Random();
                int x = random.nextInt(10);
                numbersList.remove(x);
                for (int i = 0; i < numbersList.size(); i++) {
                    System.out.println(numbersList.get(i));
                    actualSum += numbersList.get(i);
                }
                System.out.println("Expected sum:" + expectedSum);
                System.out.println("Actual sum " + actualSum);
                System.out.println("Missing number:" + (expectedSum - actualSum));
            }
        }
    }
}
