package ir.maktab58.hw1.question10;

public class Coach {
    private String coachName;
    private Team currentTeam = new Team();
    private Team[] previousTeam = new Team[0];
    boolean leftFlag;

    public boolean isLeftFlag() {
        return leftFlag;
    }

    public void setLeftFlag(boolean leftFlag) {
        this.leftFlag = leftFlag;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public Team getCurrentTeam() {
        return currentTeam;
    }

    public void setCurrentTeam(Team currentTeam) {
        this.currentTeam = currentTeam;
    }

    public Team[] getPreviousTeam() {
        return previousTeam;
    }

    public void setPreviousTeam(Team[] previousTeam) {
        this.previousTeam = previousTeam;
    }

    public void addCurrentToPrevious(){
        // if left flag was one, add current to previous vector
        //then in main set current team
        //TODO
    }

    public void assignPostToPlayers(String post, Player player){
        //check if post is valid
        //then set player's post
        //TODO
    }

}
