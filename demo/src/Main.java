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
        Team adelaideCrows = new Team("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        adelaideCrows.addPlayer(pat);
        adelaideCrows.addPlayer(beckham);
        System.out.println(adelaideCrows.numPlayers());
    }
}
