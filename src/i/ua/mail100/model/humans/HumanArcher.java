package i.ua.mail100.model.humans;

import i.ua.mail100.interfaces.Archer;

public class HumanArcher implements Archer {
    @Override
    public void shoot() {
        System.out.println("Human Archer shoot!");
    }
}
