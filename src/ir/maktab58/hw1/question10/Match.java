package ir.maktab58.hw1.question10;

import java.util.Date;

public class Match {
    private Stadium stadium = new Stadium();
    private Spectator[] allSpectators = new Spectator[stadium.getNumOfSpectatorsAtMost()];
    private Team team1 = new Team();
    private Team team2 = new Team();
    private int goals1;
    private int goals2;
    private boolean matchResult; //0:equal, 1:win and fail
    private Date dateOfMatch;
    private int matchState; //0:not started yet, 1:in progress, 2:finished
    private String winner;
    private Referee matchReferee = new Referee();

    public Referee getMatchReferee() {
        return matchReferee;
    }

    public void setMatchReferee(Referee matchReferee) {
        this.matchReferee = matchReferee;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public Spectator[] getAllSpectators() {
        return allSpectators;
    }

    public void setAllSpectators(Spectator[] allSpectators) {
        this.allSpectators = allSpectators;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public int getGoals1() {
        return goals1;
    }

    public void setGoals1(int goals1) {
        this.goals1 = goals1;
    }

    public int getGoals2() {
        return goals2;
    }

    public void setGoals2(int goals2) {
        this.goals2 = goals2;
    }

    public boolean isMatchResult() {
        return matchResult;
    }

    public void setMatchResult(boolean matchResult) {
        this.matchResult = matchResult;
    }

    public Date getDateOfMatch() {
        return dateOfMatch;
    }

    public void setDateOfMatch(Date dateOfMatch) {
        this.dateOfMatch = dateOfMatch;
    }

    public int getMatchState() {
        return matchState;
    }

    public void setMatchState(int matchState) {
        this.matchState = matchState;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public void assignWinner(){
        if (matchState == 2){
            if (goals1 > goals2) {
                winner = team1.getTeamName();
                team1.setTeamScore(team1.getTeamScore() + 3);
                team1.setNumOfWins(team1.getNumOfWins() + 1);
            }
            if (goals2 > goals1) {
                winner = team2.getTeamName();
                team2.setTeamScore(team2.getTeamScore() + 3);
                team2.setNumOfWins(team2.getNumOfWins() + 1);
            }
            // set equality state
            //TODO
        }
    }

    public void assignResult(String stateOfWin){
        //if it's finished, assign result
        //TODO
    }

    public void increaseNumOfTeamGoals(Team team){
        //check between teams name and increase num of team goals
        //TODO
    }

    public void handleChangePlayer(Player oldPlayer, Player newPlayer){
        // if old player is existed replace it by new player in a team
        //TODO
        //change state of each player participation in their team
        //TODO
    }

    public void handleIfOnePlayerGetFired(Player player){
        //if the red card flag was enabled or num of yellow cards was two for one player
        //find the player and change the state of its participation
        //TODO

    }

    public void addSpectatorToItsVector(Spectator spectator){
        //add spectator
        //TODO
    }
}
