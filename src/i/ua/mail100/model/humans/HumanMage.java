package i.ua.mail100.model.humans;

import i.ua.mail100.interfaces.Mage;

public class HumanMage implements Mage {
    @Override
    public void cast() {
        System.out.println("Human Mage cast!");
    }
}
