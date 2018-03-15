package calculator;

import java.util.Random;

public class RandomGen {
    private Random random;

    public RandomGen() {
        this.random = new Random();
    }
    public int getSmallNumber(){
        return random.nextInt(20);
    }
    public int getBigNumber(){
        return random.nextInt(2000);
    }
}
