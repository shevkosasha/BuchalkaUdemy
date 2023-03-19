package org.course.generics;

interface Player {}
record Baseballer(String name, String position) implements Player{}
record Volleyballer(String name, String position) implements Player{}

public class MainWithInterface {
    public static void main(String[] args) {
        BaseballTeam phillies = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros = new BaseballTeam("Houston Astros");
        setScoreResult(phillies, 3, astros, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        var harperq = new BaseballPlayer("B Harper Q", "Left Fielder");
        var marshw = new BaseballPlayer("B Marsh W", "Left Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.listMembers();

        Team<Baseballer> baseballerTeam = new Team<>("baseball");
        Team<Volleyballer> volleyballerTeam = new Team<>("volleyball");
        var harper1 = new Baseballer("B Harper 11", "Right Fielder");
        var marsh2 = new Baseballer("B Marsh 11", "Right Fielder");
        baseballerTeam.addTeamMember(harper1);
        baseballerTeam.addTeamMember(marsh2);
        baseballerTeam.listMembers();
        volleyballerTeam.addTeamMember(new Volleyballer("B Harper Q 22", "Left Fielder"));
        volleyballerTeam.addTeamMember(new Volleyballer("B Marsh Q 22", "Left Fielder"));
        volleyballerTeam.listMembers();



    }

    private static void setScoreResult(BaseballTeam team1, int score1,
                                       BaseballTeam team2, int score2){
        String message = team1.setScore(score1, score2);
        team1.setScore(score2, score1);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
