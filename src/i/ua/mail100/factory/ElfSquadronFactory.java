package i.ua.mail100.factory;

import i.ua.mail100.interfaces.Archer;
import i.ua.mail100.interfaces.Mage;
import i.ua.mail100.interfaces.Warrior;
import i.ua.mail100.model.elfs.ElfArcher;
import i.ua.mail100.model.elfs.ElfMage;
import i.ua.mail100.model.elfs.ElfWarrior;

public class ElfSquadronFactory extends SquadronFactory {
    public Mage createMage() {
        return new ElfMage();
    }

    public Archer createArcher() {
        return new ElfArcher();
    }

    public Warrior createWarrior() {
        return new ElfWarrior();
    }
}