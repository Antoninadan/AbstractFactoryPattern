import i.ua.mail100.factory.ElfSquadronFactory;
import i.ua.mail100.factory.HumanSquadronFactory;
import i.ua.mail100.model.Squadron;

public class AppRunner {

    public static void main(String[] args) {
        Squadron humanSquadron = new Squadron();
        HumanSquadronFactory humanSquadronFactory = new HumanSquadronFactory();
        humanSquadron.createSquadron(humanSquadronFactory);

        Squadron elfSquadron = new Squadron();
        elfSquadron.createSquadron(new ElfSquadronFactory());

    }
}
