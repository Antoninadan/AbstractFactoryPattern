package i.ua.mail100.factory;

import i.ua.mail100.interfaces.Archer;
import i.ua.mail100.interfaces.Mage;
import i.ua.mail100.interfaces.Warrior;

public abstract class SquadronFactory {
    public abstract Mage createMage();

    public abstract Archer createArcher();

    public abstract Warrior createWarrior();
}