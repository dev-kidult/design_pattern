package strategyPattern.RegStrategy;

public class FourReg implements Reg {
    @Override
    public void reg() {
        System.out.println("난 다리가 4개야");
    }
}
