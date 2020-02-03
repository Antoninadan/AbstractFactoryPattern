package i.ua.mail100.model.elfs;

import i.ua.mail100.interfaces.Mage;

public class ElfMage implements Mage {
    @Override
    public void cast() {
        System.out.println("Elf Mage cast!");
    }
}
