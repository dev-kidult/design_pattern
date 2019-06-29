package strategyPattern;

import strategyPattern.RegStrategy.Reg;

public abstract class Animal {
    private Reg reg;

    public Animal(Reg reg) {
        this.reg = reg;
    }
}
