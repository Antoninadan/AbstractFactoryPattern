package i.ua.mail100.model.humans;

import i.ua.mail100.interfaces.Warrior;

public class HumanWarrior implements Warrior{
    @Override
    public void attack() {
        System.out.println("Human Warrior attack!");
    }
}
