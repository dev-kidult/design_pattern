package strategyPattern;

import strategyPattern.RegStrategy.Reg;

public class Bird extends Animal{
    public Bird(Reg reg) {
        super(reg);
    }
}
