public class Main {
    /*
    Goal: Create a generic class to implement a league table for a sport.
    - Should allow teams to be added ot the list
    - stores a list of teams that belong to the league.
    - A method to print out the teams in order. With the team at the top of the league printed first.
    - Only teams of the same type can be added to any particular instance of the league class
     */
    public static void main(String[] args) {
        FootballPlayer joe= new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        Team <FootballPlayer> adelaideCrows = new Team<FootballPlayer>("Adelaide Crows");
        Team <FootballPlayer> melbourne = new Team<FootballPlayer>("Melbourne");
        Team <FootballPlayer> fremantle = new Team<FootballPlayer>("Fremantle");
        Team <FootballPlayer> hawthorne = new Team<FootballPlayer>("Hawthorne");
        adelaideCrows.addPlayer(joe);
        League<>

        System.out.println(adelaideCrows.numPlayers());
        Team<BaseballPlayer> baseballTeam = new Team<BaseballPlayer>("Chicago Cubs");
        baseballTeam.addPlayer(pat);
        Team<SoccerPlayer> soccerTeam = new Team<SoccerPlayer>("");
        soccerTeam.addPlayer(beckham);

        hawthorne.matchResult(fremantle,1,0);
        hawthorne.matchResult(adelaideCrows,3,8);
        adelaideCrows.matchResult(fremantle,2,1);

        System.out.println("Rankings: ");
        System.out.println(adelaideCrows.getName()+": "+ adelaideCrows.ranking());
        System.out.println(melbourne.getName()+": "+melbourne.ranking());
        System.out.println(fremantle.getName()+": "+fremantle.ranking());
        System.out.println(hawthorne.getName()+": "+hawthorne.ranking());
        System.out.println(adelaideCrows.compareTo(hawthorne));
        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(hawthorne.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));
    }
}
