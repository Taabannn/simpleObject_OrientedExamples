package ir.maktab58.hw1.question10;

public class Player {
    private String playerName;
    private String playerPost; //Valid posts are : secondString, linebacker, halfback, fullback, goaler, striker
    private int numOfGoals;
    private int numOfReceivedGoals;
    private Team[] previousListOfTeams = new Team[0];
    private String nameOfCurrentTeam;
    private boolean stateOfParticipation;
    private int numOfYellowCards;
    private int numOfRedCards;
    private boolean leftFlag;

    public boolean isLeftFlag() {
        return leftFlag;
    }

    public void setLeftFlag(boolean leftFlag) {
        this.leftFlag = leftFlag;
    }

    public int getNumOfYellowCards() {
        return numOfYellowCards;
    }

    public void setNumOfYellowCards(int numOfYellowCards) {
        this.numOfYellowCards = numOfYellowCards;
    }

    public int getNumOfRedCards() {
        return numOfRedCards;
    }

    public void setNumOfRedCards(int numOfRedCards) {
        this.numOfRedCards = numOfRedCards;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerPost() {
        return playerPost;
    }

    public void setPlayerPost(String playerPost) {
        this.playerPost = playerPost;
    }

    public int getNumOfGoals() {
        return numOfGoals;
    }

    public void setNumOfGoals(int numOfGoals) {
        this.numOfGoals = numOfGoals;
    }

    public int getNumOfReceivedGoals() {
        return numOfReceivedGoals;
    }

    public void setNumOfReceivedGoals(int numOfReceivedGoals) {
        this.numOfReceivedGoals = numOfReceivedGoals;
    }

    public Team[] getPreviousListOfTeams() {
        return previousListOfTeams;
    }

    public void setPreviousListOfTeams(Team[] previousListOfTeams) {
        this.previousListOfTeams = previousListOfTeams;
    }

    public String getNameOfCurrentTeam() {
        return nameOfCurrentTeam;
    }

    public void setNameOfCurrentTeam(String nameOfCurrentTeam) {
        this.nameOfCurrentTeam = nameOfCurrentTeam;
    }

    public boolean isStateOfParticipation() {
        return stateOfParticipation;
    }

    public void setStateOfParticipation(boolean stateOfParticipation) {
        this.stateOfParticipation = stateOfParticipation;
    }

    public boolean isPostValid(){
        //Check post
        //if it is valid, assign it
        //TODO
        return true;
    }

    public void addCurrentToPreviousVector(){
        //if left flag was enabled add current to previous
        // then in main set current team
        //TODO
    }

}
