import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
   /*     ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n){
        for (int i :
                n) {
            System.out.println(i*2);
        }
    }

    */
        FootballPlayer joe= new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        Team <FootballPlayer> adelaideCrows = new Team<FootballPlayer>("Adelaide Crows");
        Team <FootballPlayer> melbourne = new Team<FootballPlayer>("Melbourne");
        Team <FootballPlayer> fremantle = new Team<FootballPlayer>("Fremantle");
        Team <FootballPlayer> hawthorne = new Team<FootballPlayer>("Hawthorne");
        adelaideCrows.addPlayer(joe);

        System.out.println(adelaideCrows.numPlayers());
        Team<BaseballPlayer> baseballTeam = new Team<BaseballPlayer>("Chicago Cubs");
        baseballTeam.addPlayer(pat);
        Team<SoccerPlayer> soccerTeam = new Team<SoccerPlayer>("");
        soccerTeam.addPlayer(beckham);

        System.out.println("Rankings: ");
        System.out.println(adelaideCrows.getName()+": "+ adelaideCrows.ranking());
        System.out.println(melbourne.getName()+": "+melbourne.ranking());
        System.out.println(fremantle.getName()+": "+fremantle.ranking());
        System.out.println(hawthorne.getName()+": "+hawthorne.ranking());
    }
}
