import calculator.Calculator;
import calculator.RandomGen;

public class Application {
    public static void main(String[] args) {
        int a=0; //TODO make something test

        Calculator calculator = new Calculator();
        RandomGen randomGen = new RandomGen();
        System.out.println(calculator.sum(randomGen.getSmallNumber(),randomGen.getBigNumber()));
        System.out.println(calculator.divide(randomGen.getBigNumber(),randomGen.getSmallNumber()));
        System.out.println("second");
        System.out.println("blabla");
    }
}
