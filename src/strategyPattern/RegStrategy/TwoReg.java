package strategyPattern.RegStrategy;

public class TwoReg implements Reg{
    @Override
    public void reg() {
        System.out.println("난 다리가 2개야");
    }
}
