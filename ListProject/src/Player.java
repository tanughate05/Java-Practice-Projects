
public class Player {
    int  Playerid;
    String Playername;
    int runs;



    //constructor
    public Player(int playerid, String playername, int runs) {
        Playerid = playerid;
        Playername = playername;
        this.runs = runs;
    }
    // to string method
    @Override
    public String toString() {
        return "Player{" +
                "Playerid=" + Playerid +
                ", Playername='" + Playername + '\'' +
                ", runs=" + runs +
                '}';
    }

    // equals methld for contains check

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Player player = (Player) obj;
        return runs == player.runs && Playername.equals(player.Playername);
    }

    //stters and getters

    public int getPlayerid() {
        return Playerid;
    }

    public void setPlayerid(int playerid) {
        Playerid = playerid;
    }

    public String getPlayername() {
        return Playername;
    }

    public void setPlayername(String playername) {
        Playername = playername;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }





}
