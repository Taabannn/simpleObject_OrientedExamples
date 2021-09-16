package ir.maktab58.hw1.question10;

public class Referee {
    private String refereeName;
    private Match[] previousMatches = new Match[0];
    private Match currentMatch = new Match();
    private Team team1 = new Team();
    private Team team2 = new Team();
    private boolean redFlag;
    private boolean yellowFlag;

    public boolean isRedFlag() {
        return redFlag;
    }

    public void setRedFlag(boolean redFlag) {
        this.redFlag = redFlag;
    }

    public boolean isYellowFlag() {
        return yellowFlag;
    }

    public void setYellowFlag(boolean yellowFlag) {
        this.yellowFlag = yellowFlag;
    }

    public String getRefereeName() {
        return refereeName;
    }

    public void setRefereeName(String refereeName) {
        this.refereeName = refereeName;
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

    public void announcePenalty(Player player){
        //change flags of player
        //if red flag was enabled remove player
        //TODO
    }
     public void changeNumOfGoals(Team team){
        //in current match changes num of goals
         // TODO
     }

     public void changeCurrentMatch(){
        //if match is finished push current match into vector of matches
         //TODO
     }

     public void addCurrentMatchToPrevious(){
        //if finished flag was one add current to previous vectors
         //then in main set current
         //TODO
     }
}
