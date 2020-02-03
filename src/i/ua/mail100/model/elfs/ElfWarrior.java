package i.ua.mail100.model.elfs;

import i.ua.mail100.interfaces.Warrior;

public class ElfWarrior implements Warrior{
    @Override
    public void attack() {
        System.out.println("Elf Warrior attack!");
    }
}
