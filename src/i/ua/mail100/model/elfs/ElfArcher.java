package i.ua.mail100.model.elfs;

import i.ua.mail100.interfaces.Archer;

public class ElfArcher implements Archer {
    @Override
    public void shoot() {
        System.out.println("Elf Archer shoot!");
    }
}
