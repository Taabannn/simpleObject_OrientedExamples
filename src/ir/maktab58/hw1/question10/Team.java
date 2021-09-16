package ir.maktab58.hw1.question10;

public class Team {
    private String teamName;
    private int teamScore;
    private Player[] players = new Player[11];
    private int numOfWins;
    private int numOfLost;
    private int numOfEqual;
    private boolean stateOfSeason;
    private Match[] previousMatches = new Match[0];
    private Match currentMatch;
    private Coach teamCoach = new Coach();

    public Coach getTeamCoach() {
        return teamCoach;
    }

    public void setTeamCoach(Coach teamCoach) {
        this.teamCoach = teamCoach;
    }

    public boolean isStateOfSeason() {
        return stateOfSeason;
    }

    public void setStateOfSeason(boolean stateOfSeason) {
        this.stateOfSeason = stateOfSeason;
    }

    public Match[] getPreviousMatches() {
        return previousMatches;
    }

    public void setPreviousMatches(Match[] previousMatches) {
        this.previousMatches = previousMatches;
    }

    public Match getCurrentMatch() {
        return currentMatch;
    }

    public void setCurrentMatch(Match currentMatch) {
        this.currentMatch = currentMatch;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTeamScore() {
        return teamScore;
    }

    public void setTeamScore(int teamScore) {
        this.teamScore = teamScore;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public int getNumOfWins() {
        return numOfWins;
    }

    public void setNumOfWins(int numOfWins) {
        this.numOfWins = numOfWins;
    }

    public int getNumOfLost() {
        return numOfLost;
    }

    public void setNumOfLost(int numOfLost) {
        this.numOfLost = numOfLost;
    }

    public int getNumOfEqual() {
        return numOfEqual;
    }

    public void setNumOfEqual(int numOfEqual) {
        this.numOfEqual = numOfEqual;
    }

    public void kickOutPlayers(Player player){
        //if the red card flag was enabled or num of yellow cards was two for one player
        //find the player and change the state of its participation
        //TODO
        //but if the season of match was finished bring player back
        //TODO
    }

    public void assignPlayersPostsInCurrentMatch(){
        //change players array, each player post and return for new match
        //TODO
    }

    public void currentMatchToPreviousVector(){
        //if match was finished add current to previous vector
        //then in main set current team
        //TODO
    }
}
