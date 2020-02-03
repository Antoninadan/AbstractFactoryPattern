package i.ua.mail100.model;

import i.ua.mail100.factory.SquadronFactory;
import i.ua.mail100.interfaces.Archer;
import i.ua.mail100.interfaces.Mage;
import i.ua.mail100.interfaces.Warrior;

public class Squadron {
    public void createSquadron (SquadronFactory factory) {
        Mage mage = factory.createMage();
        Archer archer = factory.createArcher();
        Warrior warrior = factory.createWarrior();

        mage.cast();
        archer.shoot();
        warrior.attack();
    }
}
