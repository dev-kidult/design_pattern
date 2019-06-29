package strategyPattern;

import strategyPattern.RegStrategy.FourReg;
import strategyPattern.RegStrategy.ThreeReg;

public class Main {
    Animal tiger = new Tiger(new FourReg());
    Animal threeRegTiger = new Tiger(new ThreeReg());
}
