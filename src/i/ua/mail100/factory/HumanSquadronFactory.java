package i.ua.mail100.factory;

import i.ua.mail100.interfaces.Archer;
import i.ua.mail100.interfaces.Mage;
import i.ua.mail100.interfaces.Warrior;
import i.ua.mail100.model.humans.HumanArcher;
import i.ua.mail100.model.humans.HumanMage;
import i.ua.mail100.model.humans.HumanWarrior;

public class HumanSquadronFactory extends SquadronFactory {
    public Mage createMage() {
        return new HumanMage();
    }

    public Archer createArcher() {
        return new HumanArcher();
    }

    public Warrior createWarrior() {
        return new HumanWarrior();
    }
}