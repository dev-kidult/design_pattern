package strategyPattern.RegStrategy;

public class ThreeReg implements Reg {
    @Override
    public void reg() {
        System.out.println("난 다리가 3개야");
    }
}
